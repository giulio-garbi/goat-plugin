package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions
import com.sysma.goat.eclipse_plugin.goatComponents.BoolConstant

class CodeOutputProcess extends CodeTree implements CodeInputOutputProcess {
	
	val OutputProcess proc
	val boolean isRealOutput
	val CodePreconditionProcess precond
	
	new(OutputProcess p){
		val sPred = p.send_pred
		proc = p
		this.precond = new CodePreconditionProcess(p.precond as Preconditions)
		isRealOutput = !(sPred instanceof BoolConstant) || !((sPred as BoolConstant).value == "false") 
	}
	
	
	def private static getMessageVar(){
		"msg"
	}
	
	def private static getLocalBackupMap(){
		"locVarBak"
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
				«localBackupMap» := map[string]interface{}{}
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
					«localBackupMap» := map[string]interface{}{}
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
			«localBackupMap» := map[string]interface{}{}
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
			«localBackupMap» := map[string]interface{}{}
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