package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.InputProcess
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions
import com.sysma.goat.eclipse_plugin.goatComponents.LocalAttributeToSet

class CodeInputProcess implements CodeInputOutputProcess {
	var InputProcess actualInput
	val CodePreconditionProcess precond
	
	new(InputProcess p, Preconditions precond){
		actualInput = p
		this.precond = new CodePreconditionProcess(precond)
	}
	
	def private static getMessageVar(){
		"msg"
	}
	
	def private static getLocalBackupMap(){
		"locVarBak"
	}
	
	def private getSetupMessageParts(String componentAttributesMap){
		val nbrParts = actualInput.msgInParts.length
		val attributes = actualInput.msgInParts.map[new CodeAttribute(it, componentAttributesMap, CodeModel.localVariablesMap)]
		val attributesToBackup = actualInput.msgInParts.filter[it instanceof LocalAttributeToSet].map[new LocalBackupAttributes(it as LocalAttributeToSet, localBackupMap)]
		//TODO remove string type assertion
		'''
			if (!«messageVar».IsLong(«nbrParts»)){
				attrsWrap.Rollback()
				return false
			}
			
			«FOR locAttr:attributesToBackup»
				if «locAttr.original.exists»{
					«locAttr.backup.assign(locAttr.original.read)»
				}
			«ENDFOR»
			
			«FOR i : 0 ..< nbrParts»
				«attributes.get(i).assign('''«messageVar».Get(«i»)''')»
			«ENDFOR»
		'''
	}
	
	def private static getRollbackLocalVars(){
		'''
			for lv, val := range «localBackupMap» {
				«CodeModel.localVariablesMap»[lv] = val
			}
		'''
	}
	
	override getBranchCode(){
		'''
				func(attrs *goat.Attributes, «messageVar» goat.Tuple)bool{
					«localBackupMap» := map[string]interface{}{}
					_ = «localBackupMap»
					attrsWrap := goat.AttributesWrapper{}
					attrsWrap.Init(attrs)
					«IF precond !== null»
						if (!«precond.getPreconditionCode(localBackupMap, "attrsWrap")»()){
							attrsWrap.Rollback()
							return false
						}
					«ENDIF»
					«getSetupMessageParts("attrsWrap")»
					if («new CodeReceivePred(actualInput.rec_pred,"attrsWrap",CodeModel.localVariablesMap).code»){
						«IF actualInput.output !== null»
							fmt.Println(«StdoutStringHelper.convertString(actualInput.output, "attrsWrap", CodeModel.localVariablesMap)»)
						«ENDIF»
						attrsWrap.Commit()
						return true
					} else {
						«rollbackLocalVars»
						attrsWrap.Rollback()
						return false
					}
				}'''
	}
	
	override getThenCode(){
		CodeTree.convert(actualInput.next).code
	}
}
		