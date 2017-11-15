package com.sysma.goat.eclipse_plugin.typing

import com.sysma.goat.eclipse_plugin.goatComponents.And
import com.sysma.goat.eclipse_plugin.goatComponents.BoolConstant
import com.sysma.goat.eclipse_plugin.goatComponents.Comparison
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentAttributeRef
import com.sysma.goat.eclipse_plugin.goatComponents.Equality
import com.sysma.goat.eclipse_plugin.goatComponents.Expression
import com.sysma.goat.eclipse_plugin.goatComponents.FunctionCall
import com.sysma.goat.eclipse_plugin.goatComponents.IntConstant
import com.sysma.goat.eclipse_plugin.goatComponents.LocalAttributeRef
import com.sysma.goat.eclipse_plugin.goatComponents.Minus
import com.sysma.goat.eclipse_plugin.goatComponents.MulOrDiv
import com.sysma.goat.eclipse_plugin.goatComponents.Not
import com.sysma.goat.eclipse_plugin.goatComponents.Or
import com.sysma.goat.eclipse_plugin.goatComponents.Plus
import com.sysma.goat.eclipse_plugin.goatComponents.RecAttributeRef
import com.sysma.goat.eclipse_plugin.goatComponents.StringConstant
import com.sysma.goat.eclipse_plugin.typing.ExpressionTyping.ExprType
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarDeclaration
import com.sysma.goat.eclipse_plugin.goatComponents.FuncParam
import com.sysma.goat.eclipse_plugin.goatComponents.LocalVarRef
import com.sysma.goat.eclipse_plugin.goatComponents.Concatenate
import com.sysma.goat.eclipse_plugin.goatComponents.TupleConstant
import com.sysma.goat.eclipse_plugin.goatComponents.TupleLength

class ExpressionTyping {
	enum ExprType{
		INT, BOOL, STRING, TUPLE, UNKNOWN
	}
	
	def static matchable(ExprType a, ExprType b){
		return a == ExprType.UNKNOWN || b == ExprType.UNKNOWN || a == b
	}
	
	def static coalesceType(ExprType a, ExprType b) {
		if (a == ExprType.UNKNOWN) b else a
	}
	
	def static ExprType typeOf(String t){
		switch(t){
			case 'int':
				ExprType.INT
			case 'string':
				ExprType.STRING
			case 'bool':
				ExprType.BOOL
			case 'tuple', case 'Tuple', case 'goat.Tuple':
				ExprType.TUPLE
			default:
				ExprType.UNKNOWN
		}
	}
	
	def static String goType(String x){
		goType(typeOf(x))
	}
	
	def static String goType(Expression x){
		goType(typeOf(x))
	}
	
	def static String castFunction(ExprType x){
		switch(x){
			case INT: {
				"cast_int"
			}
			case BOOL: {
				"cast_bool"
			}
			case STRING: {
				"cast_string"
			}
			case TUPLE: {
				"cast_tuple"
			}
			case UNKNOWN: {
				""
			}
		}
	}
	
	def static String goType(ExprType x){
		switch(x){
			case INT: {
				"int"
			}
			case BOOL: {
				"bool"
			}
			case STRING: {
				"string"
			}
			case TUPLE: {
				"goat.Tuple"
			}
			case UNKNOWN: {
				"interface{}"
			}
		}
	}
	
	def static ExprType typeOf(Expression expr){
		switch(expr){
			And, Or, Not, Equality, Comparison, BoolConstant:
				ExprType.BOOL

			Plus, Minus, MulOrDiv, IntConstant, TupleLength:
				ExprType.INT
				
			Concatenate, StringConstant:
				ExprType.STRING
			
			LocalVarRef:
			{
				val rf = expr.ref
				switch(rf){
					FuncVarDeclaration:
						typeOf(rf.^val)
					FuncParam:
						typeOf(rf.type)
				}				
			}
			
			LocalAttributeRef:
				ExprType.UNKNOWN
				
			FunctionCall: 
				typeOf(expr.function.type)
				
			RecAttributeRef, ComponentAttributeRef:
				ExprType.UNKNOWN
				
			TupleConstant:
				ExprType.TUPLE
				
			default:
				ExprType.UNKNOWN
		}
	}
	
}