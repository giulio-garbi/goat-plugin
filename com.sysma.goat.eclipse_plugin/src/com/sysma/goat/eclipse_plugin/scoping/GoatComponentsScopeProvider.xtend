/*
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage
import com.sysma.goat.eclipse_plugin.goatComponents.Model
import org.eclipse.xtext.scoping.IScope
import com.sysma.goat.eclipse_plugin.goatComponents.FuncDefinition
import com.sysma.goat.eclipse_plugin.goatComponents.FuncBlock
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarDeclaration
import org.eclipse.xtext.scoping.Scopes
import com.sysma.goat.eclipse_plugin.goatComponents.Expression
import com.sysma.goat.eclipse_plugin.goatComponents.FuncStatement

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class GoatComponentsScopeProvider extends AbstractGoatComponentsScopeProvider {
	override getScope(EObject context, EReference reference){
		switch reference {
			case GoatComponentsPackage.eINSTANCE.processCall_Proc,
			case GoatComponentsPackage.eINSTANCE.processSpawn_Proc:
				scopeForProcessDefinition(context)
			case GoatComponentsPackage.eINSTANCE.localVarRef_Ref:
				scopeForFuncVarParam(context)
			default:
				super.getScope(context, reference)
		}
	}
	
	def scopeForProcessDefinition(EObject context){
		var container = context
		while(container !== null && !(container instanceof Model)){
			container = container.eContainer
		}
		if(container === null){
			IScope.NULLSCOPE
		} else {
			Scopes.scopeFor((container as Model).processes)
		}
	}
	
	def IScope scopeForFuncVarParam(EObject context){
		val container = context.eContainer
		switch container{
			FuncDefinition:
				Scopes.scopeFor(container.params)
			FuncBlock:
				Scopes.scopeFor(container.statements.takeWhile[it != context]
					.filter(FuncVarDeclaration), scopeForFuncVarParam(container))
			FuncStatement,
			Expression:
				scopeForFuncVarParam(container)
			default:
				Scopes.scopeFor(#[])
		}
	}
}

