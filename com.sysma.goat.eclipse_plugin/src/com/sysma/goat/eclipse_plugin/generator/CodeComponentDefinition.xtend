package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition

class CodeComponentDefinition extends com.sysma.goat.eclipse_plugin.generator.CodeTree {
	
	val ComponentDefinition cdef
	val CharSequence mainFunc
	val CharSequence compName
	
	new(ComponentDefinition cdef, CharSequence mainFunc, CharSequence compName){
		this.cdef = cdef
		this.mainFunc = mainFunc
		this.compName = compName
	}
	
	def getComponentDeclaration(){
		'''
			«compName» := goat.NewComponentWithAttributes("«cdef.address»",  map[string]string{
				«FOR i : 0..<cdef.env.attrs.length»
					"«cdef.env.attrs.get(i)»" : "«cdef.env.vals.get(i)»",
				«ENDFOR»
			})
		'''
	}
	
	override getCode() {
		'''
		goat.NewProcess(«compName»).Run(func(p *goat.Process){
			«mainFunc»("«cdef.proc.name»", map[string]string{
				«FOR i: 0..<cdef.params.length»
					"«cdef.proc.params.get(i)»" : "«cdef.params.get(i)»",
				«ENDFOR»
			}, p)
		})'''
	}
	
}
