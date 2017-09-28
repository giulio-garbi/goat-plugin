package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.Expression

class CodeReceivePred extends CodeTree {
	
	val Expression pred
	val String componentAttributes
	val String localAttributes
	
	new(Expression pred, String componentAttributes, String localAttributes) {
		this.pred = pred
		this.componentAttributes = componentAttributes
		this.localAttributes = localAttributes
	}
	
	override getCode() {
		CodeExpression.getExpressionWithAttributes(pred, localAttributes, componentAttributes)
	}
	
}