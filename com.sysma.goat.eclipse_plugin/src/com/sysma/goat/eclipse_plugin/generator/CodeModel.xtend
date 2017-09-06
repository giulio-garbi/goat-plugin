package com.sysma.goat.eclipse_plugin.generator

import java.util.List
import com.sysma.goat.eclipse_plugin.goatComponents.Model

class CodeModel {
	val String packageName
	val String mainFuncName
	val List<CodeProcessDefinition> processes
	val Iterable<CodeComponentDefinition> components
	val Iterable<CodeFunction> functions
	
	new(Model model){
		packageName = "main"
		mainFuncName = "main"
		processes = model.processes.map[new CodeProcessDefinition(it)]
		components = model.components.indexed.map[pair | new CodeComponentDefinition(pair.value, "model", '''comp_«pair.key»''')]
		functions = model.functions.map[new CodeFunction(it)]
	}
	
	def static getLocalVariablesMap(){
		"localVars"
	}
	
	def static getGoatProcessReference(){
		"p"
	}
	
	def static getParamPassingMap(){
		"paramPassing"
	}
	
	public static val systemFunction = "model" 
	
	def getCode() {
		'''
		package «packageName»
		
		import (
			"github.com/giulio-garbi/goat/goat"
			"strings"
			"fmt"
			"strconv"
		)
		
		«FOR func: functions»
			«func.code»
		«ENDFOR»
		
		func «mainFuncName»(){
			//Needed to avoid golang errors "imported and not used"
			_ = func(){
				fmt.Println(strings.Join([]string{},""))
				strconv.Atoi("")
			}
			
			var «systemFunction» func(string, map[string]string, *goat.Process)
			«systemFunction» = func(procname string, «localVariablesMap» map[string]string, «goatProcessReference» *goat.Process){
				var «paramPassingMap» map[string]string
				_ = «paramPassingMap»
				
				switch(procname) {
					«FOR c_pdef : processes»
					case "«c_pdef.procname»":
						goto «c_pdef.process_goto_label»
					«ENDFOR»
					default:
						panic("Undefined process name!")
				}
				
				«FOR c_pdef : processes»
				«c_pdef.code»
				«ENDFOR»
			}
			
			_ = «systemFunction»
			
			term := make(chan struct{})
			«FOR cdef: components»
				«cdef.componentDeclaration»
			«ENDFOR»
			«FOR cdef: components»
				«cdef.code»
			«ENDFOR»
			<- term
		}
		'''
	}
}