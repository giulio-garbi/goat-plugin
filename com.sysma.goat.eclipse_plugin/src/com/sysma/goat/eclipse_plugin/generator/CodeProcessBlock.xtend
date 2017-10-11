package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ProcessBlock

class CodeProcessBlock {
	val ProcessBlock blk;
	val LocalVariableMap localVariableMap;
	val CharSequence processRef
	
	new(ProcessBlock blk, LocalVariableMap localVariableMap, CharSequence processRef){
		this.blk = blk
		this.localVariableMap = localVariableMap
		this.processRef = processRef
	}
	
	def getCode(){
		'''
		«FOR x : blk.statements.map[Utils.getCode(it, localVariableMap, processRef)]»
		«x»
		«ENDFOR»
		'''
	}
}