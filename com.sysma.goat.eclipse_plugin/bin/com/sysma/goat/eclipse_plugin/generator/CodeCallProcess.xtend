package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess

class CodeCallProcess extends CodeTree {
	val CallProcess call
	new(CallProcess p){
		call = p
	}
	
	override getCode() {
		'''
			«IF !call.params.empty»
				«CodeModel.paramPassingMap» = map[string]string{}
				«FOR idx: 0..< call.params.length»
					«CodeModel.paramPassingMap»["«call.procname.params.get(idx)»"] = «new CodeValue(call.params.get(idx), "@ERR@",CodeModel.localVariablesMap).code»
				«ENDFOR»
				«FOR idx: 0..< call.params.length»
					«CodeAttribute.assignProcessParameter(call.procname.params.get(idx), 
						'''«CodeModel.paramPassingMap»["«call.procname.params.get(idx)»"]'''
				)»
				«ENDFOR»
			«ENDIF»
			goto «new CodeProcessDefinition(call.procname).process_goto_label»
		'''
	}
	
}
