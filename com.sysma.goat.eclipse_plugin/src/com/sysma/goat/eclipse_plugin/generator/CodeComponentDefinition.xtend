package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition
import com.sysma.goat.eclipse_plugin.goatInfrastructure.Infrastructure

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
		'''
			«compName» := goat.NewComponentWithAttributes(«infrCode»,  map[string]interface{}{
				«FOR i : 0..<cdef.env.attrs.length»
					"«cdef.env.attrs.get(i)»" : «CodeExpression.getExpressionWithoutAttributes(cdef.env.vals.get(i))»,
				«ENDFOR»
			})
		'''
	}
	
	def getCode() {
		val fncCode = new CodeProcessBlock(cdef.block, new LocalVariableMap("locvar"), "p").codeAsFunction
		'''
		goat.NewProcess(«compName»).Run(«mainFunc»(&wg, «fncCode», &(map[string]interface{}{})))'''
	}
	
}
