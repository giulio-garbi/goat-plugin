package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition
import com.sysma.goat.eclipse_plugin.goatComponents.Process

class CodeProcessDefinition extends CodeTree {
	public val String procname
	//public val String process_goto_label
	val Process proc
	
	def static getLocalVariablesMap(){
		"localVars"
	}
	
	new(ProcessDefinition pdef){
		procname = pdef.name
		//process_goto_label = "proc_"+procname
		proc = pdef.proc
	}
	
	override getCode() {
		'''
		func «process_func_name»(«localVariablesMap» map[string]interface{}, p *goat.Process) continuationProcess{
			«CodeTree.convert(proc).code»
		}
		'''
	}
	
	def getProcess_func_name() {
		return '''pr_«procname»'''
	}
	
}