package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.Value
import com.sysma.goat.eclipse_plugin.goatComponents.AttributeValue
import com.sysma.goat.eclipse_plugin.goatComponents.ImmediateValue
import com.sysma.goat.eclipse_plugin.goatComponents.GoStringFunction

class CodeValue {
	val Value value
	val String componentAttr
	val String localAttr
	
	new(Value value, String componentAttr, String localAttr) {
		this.componentAttr = componentAttr
		this.localAttr = localAttr
		this.value = value
	}
	
	def CharSequence getCode() {
		switch(value){
			AttributeValue:
				new CodeAttribute(value.attr, componentAttr, localAttr).read
			ImmediateValue:
				'"'+value.imm+'"'
			GoStringFunction:
				"f_"+value.funcname.name+"("+String.join(", ", value.params.map[new CodeValue(it, componentAttr, localAttr).code])+")"
			default:
				"@ERR@"
		}
	}
}