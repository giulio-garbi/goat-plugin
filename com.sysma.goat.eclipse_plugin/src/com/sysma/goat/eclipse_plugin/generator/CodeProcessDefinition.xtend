package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessBlock
import com.sysma.goat.eclipse_plugin.goatComponents.PDPBlock

class CodeProcessDefinition {
	val ProcessDefinition pdef
	
	new(ProcessDefinition pdef){
		this.pdef = pdef
	}
	
	def getCode() {
		if (pdef.block instanceof ProcessBlock) {
			var localVariablesMap = new LocalVariableMap("locvar")
			var CharSequence procReference = "p"
			'''
			func «process_func_name»(wg *sync.WaitGroup, «localVariablesMap.name» *map[string]interface{}, «procReference» *goat.Process) continuationProcess{
				«new CodeProcessBlock(pdef.block as ProcessBlock, localVariablesMap, procReference).code»
				return nil
			}
			'''
		} else if (pdef.block instanceof PDPBlock){
			'''var «process_func_name» []continuationProcess = unroll(«
			(pdef.block as PDPBlock).procs.map[new CodeProcessDefinition(it).process_func_name].join(", ")»)
			'''
		} else {
			""
		}
	}
	
	def getProcess_func_name() {
		return '''pr_«pdef.name»'''
	}
	
}