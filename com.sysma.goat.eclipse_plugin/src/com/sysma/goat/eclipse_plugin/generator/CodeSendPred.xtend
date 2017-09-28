package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.Expression

class CodeSendPred extends CodeTree {
	
	val Expression pred
	val String localAttributes
	
	new(Expression pred, String localAttributes) {
		this.pred = pred
		this.localAttributes = localAttributes
	}
	
	override getCode() {
		CodeExpression.getOutputPredicate(pred, localAttributes)
	}
}