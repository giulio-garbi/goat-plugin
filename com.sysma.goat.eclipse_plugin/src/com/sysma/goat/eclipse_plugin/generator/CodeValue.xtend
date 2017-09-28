package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.Expression

class CodeValue {
	val Expression value
	val String componentAttr
	val String localAttr
	
	new(Expression value, String componentAttr, String localAttr) {
		this.componentAttr = componentAttr
		this.localAttr = localAttr
		this.value = value
	}
	
	def CharSequence getCode() {
		CodeExpression.getExpressionWithAttributes(value, localAttr, componentAttr)
	}
}