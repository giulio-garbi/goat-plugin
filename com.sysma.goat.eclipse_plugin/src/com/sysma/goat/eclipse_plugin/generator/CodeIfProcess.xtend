package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.IfBranchProcess
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcesses
import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess

class CodeIfProcess {
	
	val IfBranchProcess process
	var boolean isOutput
	var CodeInputProcesses c_iproc
	var CodeOutputProcess c_oproc
	
	
	new(IfBranchProcess process) {
		this.process = process
		val then = process.then
		switch (then) {
			InputProcesses:{
				isOutput = false
				c_iproc = new CodeInputProcesses(process.then as InputProcesses)
			}
			OutputProcess:{
				isOutput = true
				c_oproc = new CodeOutputProcess(process.then as OutputProcess)
			}
			default:
				isOutput = false
		}
	}
	
	def getBranchCode() {
		if (isOutput){
			c_oproc.codeForIf
		} else {
			c_iproc.codeForIf
		}
	}
	
	def isReceivingBranch(){
		return !isOutput
	}
	
	def getConditionCode(String localVar, String attrVar) {
		new CodePreconditionProcess(process.cond).getPreconditionCode(localVar, attrVar)
	}
	
	def getThenCode() {
		if (isOutput){
			c_oproc.thenCode
		} else {
			c_iproc.codeForFirstThen
		}
	}
	
}
