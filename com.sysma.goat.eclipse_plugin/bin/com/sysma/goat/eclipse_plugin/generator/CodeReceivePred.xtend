package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.Pred
import com.sysma.goat.eclipse_plugin.goatComponents.Predicate
import com.sysma.goat.eclipse_plugin.goatComponents.And
import com.sysma.goat.eclipse_plugin.goatComponents.Not
import com.sysma.goat.eclipse_plugin.goatComponents.Immediate
import com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest
import com.sysma.goat.eclipse_plugin.goatComponents.Value

class CodeReceivePred extends CodeTree {
	
	val Pred pred
	val String componentAttributes
	val String localAttributes
	
	new(Pred pred, String componentAttributes, String localAttributes) {
		this.pred = pred
		this.componentAttributes = componentAttributes
		this.localAttributes = localAttributes
	}
	
	override getCode() {
		return toCode(pred)
	}
	
	def private static castToInt(CharSequence xCode){
		'''
		func()int {
			x, err := strconv.Atoi(«xCode»)
			if err != nil {
				panic("Inequalities expect integers")
			} else {
				return x
			}
		}()'''
	}
	
	def private String toCode(Pred pred){
		switch(pred){
			Predicate:
				String.join(" || ",pred.or.map["("+toCode+")"])
			And:
				String.join(" && ",pred.and.map["("+toCode+")"])
			Not:{
				if (pred.neg)
					"!("+toCode(pred.term)+")"
				else
					toCode(pred.term)
			}
			Immediate:{
				if(pred.isTrue)
					"true"
				else
					"false"
			}
			EqualityTest: {
				val op1Code = new CodeValue(pred.op1 as Value,componentAttributes,localAttributes).code
				val op2Code = new CodeValue(pred.op2,componentAttributes,localAttributes).code
				
				
				 
				switch(pred.operand){
					case "=":{
						op1Code + " == " + op2Code
					}
					case "!=":{
						op1Code + " != " + op2Code
					}
					case "<",
					case ">",
					case "<=",
					case ">=":{
						castToInt(op1Code) + " " + pred.operand + " " + castToInt(op2Code)
					}
					default:{
						"@ERR@"
					}
				}
			}
			/*GoBoolFunction:{
				val call = pred.funcname + "("+
					String.join(", ",pred.params.map[new CodeValue(it,componentAttributes,localAttributes).code])+")"
				if (pred.isTrue)
					call
				else
					"!(" + call + ")"
			}*/
			default:
				// not compiles
				"@ERR@"
		}
	}
}