package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition
import com.sysma.goat.eclipse_plugin.goatComponents.Process

class CodeProcessDefinition extends CodeTree {
	public val String procname
	public val String process_goto_label
	val Process proc
	
	new(ProcessDefinition pdef){
		procname = pdef.name
		process_goto_label = "proc_"+procname
		proc = pdef.proc
	}
	
	override getCode() {
		'''
		// Process «procname»
		«process_goto_label»:
		{
			«CodeTree.convert(proc).code»
		}
		'''
	}
}