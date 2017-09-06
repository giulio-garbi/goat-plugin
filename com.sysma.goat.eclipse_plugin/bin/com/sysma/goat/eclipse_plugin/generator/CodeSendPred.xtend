package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.Pred
import com.sysma.goat.eclipse_plugin.goatComponents.Predicate
import com.sysma.goat.eclipse_plugin.goatComponents.And
import com.sysma.goat.eclipse_plugin.goatComponents.Not
import com.sysma.goat.eclipse_plugin.goatComponents.Immediate
import com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest
import com.sysma.goat.eclipse_plugin.goatComponents.RecAttribute

class CodeSendPred extends CodeTree {
	
	val Pred pred
	val String localAttributes
	
	new(Pred pred, String localAttributes) {
		this.pred = pred
		this.localAttributes = localAttributes
	}
	
	override getCode() {
		return toCode(pred)
	}
	
	def private String toCode(Pred pred){
		switch(pred){
			Predicate:
			{
				val codedOr = pred.or.map[toCode]
				if (codedOr.length > 1){
					var orCode = '''goat.Or{«codedOr.get(0)», «codedOr.get(1)»}'''
					for (corPart : codedOr.tail.tail){
						orCode = '''goat.Or{«orCode», «corPart»}'''
					}
					orCode
				} else{
					codedOr.get(0)
				}
			}
			And:
			{
				val codedAnd = pred.and.map[toCode]
				if (codedAnd.length > 1){
					var andCode = '''goat.And{«codedAnd.get(0)», «codedAnd.get(1)»}'''
					for (candPart : codedAnd.tail.tail){
						andCode = '''goat.And{«andCode», «candPart»}'''
					}
					andCode
				} else{
					codedAnd.get(0)
				}
			}
			Not:{
				if (pred.neg)
					"goat.Not{"+toCode(pred.term)+"}"
				else
					toCode(pred.term)
			}
			Immediate:{
				if(pred.isTrue)
					"goat.True{}"
				else
					"goat.False{}"
			}
			EqualityTest: {
				var op1 = (pred.op1 as RecAttribute).ident
				var op2 = new CodeValue(pred.op2,"@ERR@",localAttributes).code
				val opName = switch pred.operand {
					case "=": "Equal"
					case "!=": "NotEqual"
					case "<": "Lower"
					case "<=": "LowerEqual"
					case ">": "Greater"
					case ">=": "GreaterImm"
				}
				'''goat.«opName»Imm{"«op1»", «op2»}'''
			}
			default:
				// not compiles
				"@ERR@"
		}
	}
}