package com.sysma.goat.eclipse_plugin.validation

import org.eclipse.xtext.validation.Check
import com.sysma.goat.eclipse_plugin.goatComponents.GoStringFunction
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage
import com.sysma.goat.eclipse_plugin.goatComponents.FuncDefinition
import com.sysma.goat.eclipse_plugin.goatComponents.FuncBlock
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarDeclaration
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarAssign
import com.sysma.goat.eclipse_plugin.goatComponents.FuncIfElse
import com.sysma.goat.eclipse_plugin.goatComponents.FuncReturn

class FunctionValidator extends AbstractGoatComponentsValidator {
	@Check
	def checkCallArgumentsCount(GoStringFunction call){
		if (call.funcname !== null && call.params !== null && 
			call.params.length != call.funcname.params.length) {
			error('''A call to «call.funcname.name» expects «call.funcname.params.length» arguments''',
				GoatComponentsPackage.eINSTANCE.goStringFunction_Params)
		}
	}
	
	@Check
	def checkMustReturn(FuncDefinition fdef){
		if (!isAlwaysReturning(fdef)){
			error("Functions must always return a string",
				GoatComponentsPackage.eINSTANCE.funcDefinition_Blk
			)
		}
	}
	
	def boolean isAlwaysReturning(Object x){
		switch x {
			FuncDefinition:
				isAlwaysReturning(x.blk)
			FuncBlock:
				x.statements.exists[alwaysReturning]
			FuncVarDeclaration,
			FuncVarAssign:
				false
			FuncIfElse:
				x.then.forall[alwaysReturning] && (x.elseBranch !== null &&
					isAlwaysReturning(x.elseBranch)
				)
			FuncReturn:
				true
			default:
				false
		}
	}
}
