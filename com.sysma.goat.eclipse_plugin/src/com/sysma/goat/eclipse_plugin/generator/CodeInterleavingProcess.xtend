package com.sysma.goat.eclipse_plugin.generator

import java.util.List
import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess
import com.sysma.goat.eclipse_plugin.goatComponents.InterleavingProcess

class CodeInterleavingProcess extends CodeTree {
	
	val List<CallProcess> subprocesses
	
	new(InterleavingProcess ip){
		this.subprocesses = ip.subProcs.map[it as CallProcess]
	}
	
	override getCode() {
		'''
		«FOR proc: subprocesses.tail»
			«CodeModel.goatProcessReference».Spawn(func(pr *goat.Process){
				lvars := map[string]interface{}{}
				for k, v := range «CodeProcessDefinition.localVariablesMap»{
					lvars[k] = v
				}
				
				«CodeModel.runFuncName»(«new CodeProcessDefinition(proc.procname).process_func_name», lvars)(pr)
			})
		«ENDFOR»
		
		«new CodeCallProcess(subprocesses.head).code»
		'''
	}
}