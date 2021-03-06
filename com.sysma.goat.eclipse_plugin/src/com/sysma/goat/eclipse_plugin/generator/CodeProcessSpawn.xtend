package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ProcessSpawn

class CodeProcessSpawn {
	
	val ProcessSpawn proc
	val LocalVariableMap locvars
	val CharSequence processRef
	
	new(ProcessSpawn proc, LocalVariableMap locvars, CharSequence processRef) {
		this.proc = proc
		this.locvars = locvars
		this.processRef = processRef
	}
	
	def getCode() {
		val unroll ='''unroll(«
			proc.blk.procs.map[new CodeProcessDefinition(it).process_func_name].join(", ")»)...''' 
		'''«processRef».Spawn(runWith(wg, «locvars.copy», «unroll»)...)'''
	}
	
}