package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess

class CodeCallProcess extends CodeTree {
	val CallProcess call
	new(CallProcess p){
		call = p
	}
	
	override getCode() {
		'''
			goto «new CodeProcessDefinition(call.procname).process_goto_label»
		'''
	}
	
}
