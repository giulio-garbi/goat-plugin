package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.InputProcesses
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcess

class CodeInputProcesses extends CodeTree {
	
	val Iterable<CodeInputProcess> inputs
	private val String varForChoice
	
	private static val String messageVar =  "msg"
	
	private static int progressiveVarForChoice = 0
	
	new(InputProcesses iprocs){
		inputs = (0..<iprocs.inputs.length).map[
			new CodeInputProcess(iprocs.inputs.get(it) as InputProcess, iprocs.preconds.get(it))
		]
		varForChoice = "inputs_choice_"+(progressiveVarForChoice++)
	}
	
	override getCode() {
		'''
		var «varForChoice» int
		«CodeModel.goatProcessReference».Receive(func(attrs *goat.Attributes) bool{
			return true
		}, func(attrs *goat.Attributes, «messageVar» string)bool{
			«FOR input: inputs.indexed»
			if(«input.value.branchCode»(attrs, «messageVar»)){
				«varForChoice» = «input.key»
				return true
			}
			«ENDFOR»
			return false
		})
		
		switch(«varForChoice»){
			«FOR input: inputs.indexed»
			case «input.key»:
			{
				«input.value.thenCode»
			}
			«ENDFOR»
			default:
				panic("Invalid branch!")
		}
		'''
	}
	
	def getCodeForIf(){
		if (inputs.length != 1){
			throw new IllegalArgumentException("The if branches support only single inputs")
		}
		'''
		goat.ThenReceive(«inputs.head.branchCode»)
		'''
	}
	
	def getCodeForFirstThen(){
		inputs.head.thenCode
	}
}