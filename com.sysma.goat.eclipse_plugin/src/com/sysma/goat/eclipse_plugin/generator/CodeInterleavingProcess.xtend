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
				lvars := map[string]string{}
				for k, v := range «CodeModel.localVariablesMap»{
					lvars[k] = v
				}
				«FOR i: 0..<proc.procname.params.length»
					lvars["«proc.procname.params.get(i)»"] = «new CodeValue(proc.params.get(i),"@ERR@", CodeModel.localVariablesMap).code»
				«ENDFOR»
				
				«CodeModel.systemFunction»("«proc.procname.name»", lvars , pr)
			})
		«ENDFOR»
		
		«new CodeCallProcess(subprocesses.head).code»
		'''
	}
}