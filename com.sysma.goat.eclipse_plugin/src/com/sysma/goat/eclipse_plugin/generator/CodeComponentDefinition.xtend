package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition

class CodeComponentDefinition extends com.sysma.goat.eclipse_plugin.generator.CodeTree {
	
	val ComponentDefinition cdef
	val CharSequence mainFunc
	val CharSequence compName
	
	new(ComponentDefinition cdef, CharSequence runFunc, CharSequence compName){
		this.cdef = cdef
		this.mainFunc = runFunc
		this.compName = compName
	}
	
	def getComponentDeclaration(){
		'''
			«compName» := goat.NewComponentWithAttributes(goat.NewSingleServerAgent("«cdef.address»"),  map[string]interface{}{
				«FOR i : 0..<cdef.env.attrs.length»
					"«cdef.env.attrs.get(i)»" : «CodeExpression.getExpressionWithoutAttributes(cdef.env.vals.get(i))»,
				«ENDFOR»
			})
		'''
	}
	
	override getCode() {
		'''
		goat.NewProcess(«compName»).Run(«mainFunc»(«new CodeProcessDefinition(cdef.proc).process_func_name», map[string]interface{}{}))'''
	}
	
}
