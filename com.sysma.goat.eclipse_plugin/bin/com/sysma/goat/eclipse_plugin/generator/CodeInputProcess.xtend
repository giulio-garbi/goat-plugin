package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.InputProcess
import com.sysma.goat.eclipse_plugin.goatComponents.Attribute
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions

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
	
	static class LocalBackupAttributes{
		public val Attribute attribute
		public val CodeAttribute original
		public val CodeAttribute backup
		
		new(Attribute attribute){
			this.attribute = attribute
			this.original = new CodeAttribute(attribute, "", CodeModel.localVariablesMap)
			this.backup = new CodeAttribute(attribute, "", localBackupMap)
			if (attribute.comp){
				throw new IllegalArgumentException("You need only to backup local attributes!")
			}
		} 
	}
	
	def private getSetupMessageParts(String componentAttributesMap){
		//TODO replace with tuple code!
		val nbrParts = actualInput.msgInParts.length
		val attributes = actualInput.msgInParts.map[new CodeAttribute(it, componentAttributesMap, CodeModel.localVariablesMap)]
		val attributesToBackup = actualInput.msgInParts.filter[!comp].map[new LocalBackupAttributes(it)]
		
		'''
					msgTokens := strings.Split(«messageVar», " ")
					if (len(msgTokens) != «nbrParts»){
						attrsWrap.Rollback()
						return false
					}
					
					«FOR locAttr:attributesToBackup»
						if «locAttr.original.exists»{
							«locAttr.backup.assign(locAttr.original.read)»
						}
					«ENDFOR»
					
					«FOR i : 0 ..< nbrParts»
						«attributes.get(i).assign('''msgTokens[«i»]''')»
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
				func(attrs *goat.Attributes, «messageVar» string)bool{
					«localBackupMap» := map[string]string{}
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
						«IF actualInput.output !== null»
							fmt.Println("DBG",«StdoutStringHelper.convertString(actualInput.output, "attrs", CodeModel.localVariablesMap)»)
						«ENDIF»
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
		