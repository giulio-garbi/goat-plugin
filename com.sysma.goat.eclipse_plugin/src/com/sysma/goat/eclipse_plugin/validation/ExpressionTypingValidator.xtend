package com.sysma.goat.eclipse_plugin.validation

import com.sysma.goat.eclipse_plugin.goatComponents.And
import com.sysma.goat.eclipse_plugin.goatComponents.Comparison
import com.sysma.goat.eclipse_plugin.goatComponents.Equality
import com.sysma.goat.eclipse_plugin.goatComponents.Expression
import com.sysma.goat.eclipse_plugin.goatComponents.FunctionCall
import com.sysma.goat.eclipse_plugin.goatComponents.Minus
import com.sysma.goat.eclipse_plugin.goatComponents.MulOrDiv
import com.sysma.goat.eclipse_plugin.goatComponents.Not
import com.sysma.goat.eclipse_plugin.goatComponents.Or
import com.sysma.goat.eclipse_plugin.goatComponents.Plus
import com.sysma.goat.eclipse_plugin.typing.ExpressionTyping.ExprType
import org.eclipse.xtext.validation.Check
import com.sysma.goat.eclipse_plugin.typing.ExpressionTyping
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage
import org.eclipse.emf.ecore.EReference
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcess
import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess
import com.sysma.goat.eclipse_plugin.goatComponents.Awareness
import com.google.inject.Inject
import org.eclipse.xtext.validation.EValidatorRegistrar
import com.sysma.goat.eclipse_plugin.goatComponents.Concatenate

class ExpressionTypingValidator extends AbstractGoatComponentsValidator {
    @Inject
    def override register(EValidatorRegistrar registrar) {
        // nothing to do
    }
    
	def private expectedType(Expression expr, ExprType typ, EReference at){
		if (!ExpressionTyping.matchable(ExpressionTyping.typeOf(expr), typ)){
			error('''Expected a «ExpressionTyping.goType(typ)» expression''', at)
		}
	}
	
	def private expected2Types(Expression expr, ExprType typ, ExprType typ2, EReference at){
		if (!ExpressionTyping.matchable(ExpressionTyping.typeOf(expr), typ) && !ExpressionTyping.matchable(ExpressionTyping.typeOf(expr), typ2)){
			error('''Expected a «ExpressionTyping.goType(typ)» or «ExpressionTyping.goType(typ2)» expression''', at)
			true
		} else { 
			false
		}
	}
	
	def private sameType(Expression expr1, Expression expr2, EReference at2){
		val type1 = ExpressionTyping.typeOf(expr1)
		val type2 = ExpressionTyping.typeOf(expr2)
		if (!ExpressionTyping.matchable(type1, type2)){
			error('''Expected a «ExpressionTyping.goType(type1)» expression''', at2)
		}
	}
	
	@Check
	def checkTypeReceivePredicate(InputProcess iproc){
		expectedType(iproc.rec_pred, ExprType.BOOL, GoatComponentsPackage.eINSTANCE.inputProcess_Rec_pred)
	}
	
	@Check
	def checkTypeSendPredicate(OutputProcess oproc){
		expectedType(oproc.send_pred, ExprType.BOOL, GoatComponentsPackage.eINSTANCE.outputProcessPart_Send_pred)
	}
	
	@Check
	def checkTypeAwareness(Awareness awr){
		expectedType(awr.pred, ExprType.BOOL, GoatComponentsPackage.eINSTANCE.awareness_Pred)
	}
	
	@Check
	def checkTypes(Expression expr){
		switch(expr){
			And: {
				expectedType(expr.left, ExprType.BOOL, GoatComponentsPackage.eINSTANCE.and_Left)
				expectedType(expr.right, ExprType.BOOL, GoatComponentsPackage.eINSTANCE.and_Right)
			}
			Or: {
				expectedType(expr.left, ExprType.BOOL, GoatComponentsPackage.eINSTANCE.or_Left)
				expectedType(expr.right, ExprType.BOOL, GoatComponentsPackage.eINSTANCE.or_Right)
			}
			Not:
				expectedType(expr.expression, ExprType.BOOL, GoatComponentsPackage.eINSTANCE.not_Expression)
			Equality: 
				sameType(expr.left, expr.right, GoatComponentsPackage.eINSTANCE.equality_Right)
			Comparison:{
				val errL = expected2Types(expr.left, ExprType.INT, ExprType.STRING, GoatComponentsPackage.eINSTANCE.comparison_Left)
				val errR = expected2Types(expr.right, ExprType.INT, ExprType.STRING, GoatComponentsPackage.eINSTANCE.comparison_Right)
				if (!errL && !errR){
					sameType(expr.left, expr.right, GoatComponentsPackage.eINSTANCE.comparison_Right)
				}
			}
			Plus:
			{
				expectedType(expr.left, ExprType.INT, GoatComponentsPackage.eINSTANCE.plus_Left)
				expectedType(expr.right, ExprType.INT, GoatComponentsPackage.eINSTANCE.plus_Right)
			}
			Concatenate: //always ok
			{ }
			Minus: {
				expectedType(expr.left, ExprType.INT, GoatComponentsPackage.eINSTANCE.minus_Left)
				expectedType(expr.right, ExprType.INT, GoatComponentsPackage.eINSTANCE.minus_Right)
			}
			MulOrDiv: {
				expectedType(expr.left, ExprType.INT, GoatComponentsPackage.eINSTANCE.mulOrDiv_Left)
				expectedType(expr.right, ExprType.INT, GoatComponentsPackage.eINSTANCE.mulOrDiv_Right)
			}
			FunctionCall: {
				var okTypes = expr.function.params.length == expr.params.length
				if (okTypes){
					for(i : 0..<expr.params.length){
						okTypes = okTypes && ExpressionTyping.matchable(
							ExpressionTyping.typeOf(expr.function.params.get(i).type),
							ExpressionTyping.typeOf(expr.params.get(i))
						)
					}
				}
				if (!okTypes){
					val exp = expr.function.params.map[ExpressionTyping.goType(ExpressionTyping.typeOf(it.type))].join(", ")
					val got = expr.params.map[ExpressionTyping.goType(ExpressionTyping.typeOf(it))].join(", ")
					error('''Expected («exp») as arguments but got («got»)''', GoatComponentsPackage.eINSTANCE.functionCall_Params)
				}	
			}
		}
	}
}