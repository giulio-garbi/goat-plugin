package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition
import com.sysma.goat.eclipse_plugin.goatInfrastructure.Infrastructure
import com.sysma.goat.eclipse_plugin.goatComponents.Environment
import com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentDefinition
import java.util.List
import com.sysma.goat.eclipse_plugin.goatComponents.Expression
import com.sysma.goat.eclipse_plugin.goatComponents.EnvironmentArg

class CodeComponentDefinition {
	
	val ComponentDefinition cdef
	val CharSequence mainFunc
	val CharSequence compName
	
	new(ComponentDefinition cdef, CharSequence runFunc, CharSequence compName){
		this.cdef = cdef
		this.mainFunc = runFunc
		this.compName = compName
	}
	
	def getComponentDeclaration(Infrastructure infr){
		val infrCode = new CodeInfrastructureAgent(infr).code
		val envCode = if(cdef.env !== null) {getCode(cdef.env)} else {getCode(cdef.envref, cdef.envargs)}
		'''
			«compName» := goat.NewComponentWithAttributes(«infrCode»,  «envCode»)
		'''
	}
	
	private def getCode(Environment env){
		'''
		map[string]interface{}{
			«FOR v : env.attrs.indexed»
				"«v.value»" : «CodeExpression.getExpressionWithoutAttributes(env.vals.get(v.key))»,
			«ENDFOR»
		}'''
	}
	
	private def getCode(EnvironmentDefinition edef, List<Expression>envargs){
		val argc = Math.min(edef.envParams.length, envargs.length)
		val args = newImmutableMap((0..<argc).map[edef.envParams.get(it).name -> envargs.get(it)])
		val vals = edef.env.vals.map[
			if (it instanceof EnvironmentArg) args.getOrDefault((it as EnvironmentArg).arg.name, null) 
			else it
		].map[CodeExpression.getExpressionWithoutAttributes(it)]
			
		'''
		map[string]interface{}{
			«FOR v : edef.env.attrs.indexed»
				"«v.value»" : «vals.get(v.key)»,
			«ENDFOR»
		}'''
	}
	
	def getCode() {
		val fncCode = new CodeProcessBlock(cdef.block, new LocalVariableMap("locvar"), "p").codeAsFunction
		'''
		goat.NewProcess(«compName»).Run(«mainFunc»(&wg, «fncCode», &(map[string]interface{}{})))'''
	}
	
}
