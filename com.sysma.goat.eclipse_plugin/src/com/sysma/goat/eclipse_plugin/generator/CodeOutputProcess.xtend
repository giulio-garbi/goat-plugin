package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions
import com.sysma.goat.eclipse_plugin.goatComponents.Immediate
import com.sysma.goat.eclipse_plugin.goatComponents.Attribute

class CodeOutputProcess extends CodeTree implements CodeInputOutputProcess {
	
	val OutputProcess proc
	val boolean isRealOutput
	val CodePreconditionProcess precond
	
	new(OutputProcess p){
		val sPred = p.send_pred
		proc = p
		this.precond = new CodePreconditionProcess(p.precond as Preconditions)
		isRealOutput = !(sPred instanceof Immediate) || ((sPred as Immediate).isTrue) 
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
		'''
		«messageVar» := goat.NewTuple(«proc.msgOutParts.map[part|new CodeValue(part, componentAttributesMap, CodeModel.localVariablesMap).code].join(",")»)
		'''
		
	}
	
	override getCode(){
		if(isRealOutput){
			'''
			«CodeModel.goatProcessReference».Send(func(attrs *goat.Attributes) (goat.Tuple, goat.Predicate, bool){
				«localBackupMap» := map[string]string{}
				_ = «localBackupMap»
				«IF precond !== null»
					if (!«precond.getPreconditionCode(localBackupMap, "attrs")»()){
						return goat.NewTuple(), goat.False{}, false
					}
				«ENDIF»
				«getSetupMessageParts("attrs")»
				«IF proc.output !== null»
					fmt.Println(«StdoutStringHelper.convertString(proc.output, "attrs", CodeModel.localVariablesMap)»)
				«ENDIF»
				return «messageVar», «new CodeSendPred(proc.send_pred,CodeModel.localVariablesMap).code», true
			})
			«thenCode»
			'''
		} else {
			'''
			«IF precond !== null»
				«CodeModel.goatProcessReference».WaitUntilTrue(func(attrs *goat.Attributes)bool{
					«localBackupMap» := map[string]string{}
					_ = «localBackupMap»
					ok :=  «precond.getPreconditionCode(localBackupMap, "attrs")»()
					«IF proc.output !== null»
						if (ok){
							fmt.Println(«StdoutStringHelper.convertString(proc.output, "attrs", CodeModel.localVariablesMap)»)
						}
					«ENDIF»
					return ok
				})
				
			«ENDIF»
			«thenCode»
			'''
		}
	}
	
	override getBranchCode() {
		'''
		func(attrs *goat.Attributes) (goat.Tuple, goat.Predicate, bool){
			«localBackupMap» := map[string]string{}
			_ = «localBackupMap»
			attrsWrap := goat.AttributeWrapper{}
			attrsWrap.Init(attrs)
			«IF precond !== null»
				if (!«precond.getPreconditionCode(localBackupMap, "attrsWrap")»()){
					attrsWrap.Rollback()
					return goat.NewTuple(), goat.False{}, false
				}
			«ENDIF»
			«IF proc.output !== null»
				fmt.Println(«StdoutStringHelper.convertString(proc.output, "attrsWrap", CodeModel.localVariablesMap)»)
			«ENDIF»
			«IF isRealOutput»
				«getSetupMessageParts("attrsWrap")»
				attrsWrap.Commit()
				return «messageVar», «new CodeSendPred(proc.send_pred,CodeModel.localVariablesMap).code», true
			«ELSE»
				attrsWrap.Commit()
				return goat.NewTuple(), goat.False{}, true
			«ENDIF»
		}'''
	}
	
	def getCodeForIf() {
		'''
		func(attrs *goat.Attributes) goat.SendReceive{
			«localBackupMap» := map[string]string{}
			_ = «localBackupMap»
			«IF precond !== null»
				if (!«precond.getPreconditionCode(localBackupMap, "attrs")»()){
					return goat.ThenFail()
				}
			«ENDIF»
			«IF proc.output !== null»
				fmt.Println(«StdoutStringHelper.convertString(proc.output, "attrs", CodeModel.localVariablesMap)»)
			«ENDIF»
			«IF isRealOutput»
				«getSetupMessageParts("attrs")»
				return goat.ThenSend(«messageVar», «new CodeSendPred(proc.send_pred,CodeModel.localVariablesMap).code»)
			«ELSE»
				return goat.ThenSend(goat.NewTuple(), goat.False{})
			«ENDIF»
		}(attr)'''
	}
	
	override getThenCode() {
		'''
		«IF proc.msec > 0»
			«CodeModel.goatProcessReference».Sleep(«proc.msec»)
		«ENDIF»
		«CodeTree.convert(proc.next).code»
		'''
	}

}