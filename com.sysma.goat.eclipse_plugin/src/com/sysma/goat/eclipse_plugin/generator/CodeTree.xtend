package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess
import com.sysma.goat.eclipse_plugin.goatComponents.IfProcesses
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcesses
import com.sysma.goat.eclipse_plugin.goatComponents.InterleavingProcess
import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess
import com.sysma.goat.eclipse_plugin.goatComponents.ZeroProcess
import com.sysma.goat.eclipse_plugin.goatComponents.Process

abstract class CodeTree {
	def CharSequence getCode()
	
	def static CodeTree convert(Process p){
		// TODO return code trees as per p
		switch (p){
			CallProcess:
				new CodeCallProcess(p)
			IfProcesses:
				new CodeIfProcesses(p)
			InputProcesses:
				new CodeInputProcesses(p)
			InterleavingProcess:
				new CodeInterleavingProcess(p)
			OutputProcess:
				new CodeOutputProcess(p)
			ZeroProcess:
				new CodeZeroProcess
			default:
				new InvalidCodeTree
		}
	}
}

class InvalidCodeTree extends CodeTree{
	override getCode() {
		"@ERR@"
	}
}