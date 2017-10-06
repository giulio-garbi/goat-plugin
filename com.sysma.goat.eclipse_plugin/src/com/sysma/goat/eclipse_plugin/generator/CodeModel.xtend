package com.sysma.goat.eclipse_plugin.generator

import java.util.List
import com.sysma.goat.eclipse_plugin.goatComponents.Model
import com.sysma.goat.eclipse_plugin.goatInfrastructure.Infrastructure

class CodeModel {
	val String packageName
	val String mainFuncName
	val List<CodeProcessDefinition> processes
	val Iterable<CodeComponentDefinition> components
	val Iterable<CodeFunction> functions
	val Infrastructure infr
	public static val runFuncName = "run"
	
	new(Model model){
		packageName = "main"
		mainFuncName = "main"
		processes = model.processes.map[new CodeProcessDefinition(it)]
		components = model.components.indexed.map[pair | new CodeComponentDefinition(pair.value, runFuncName, '''comp_«pair.key»''')]
		functions = model.functions.map[new CodeFunction(it)]
		infr = model.infrastructure
	}
	
	def static getGoatProcessReference(){
		"p"
	}
	
	def getCode() {
		getCode(-1)
	}
	
	def getTestCode(int timeout) {
		getCode(timeout)
	}
	
	def getCode(int timeout){
		'''
		package «packageName»
		
		import (
			"github.com/giulio-garbi/goat/goat"
			"strings"
			"fmt"
			"strconv"
		)
		
		type continuationProcess func(map[string]interface{}, *goat.Process) continuationProcess
		
		«FOR func: functions»
			«func.code»
		«ENDFOR»
		
		«FOR c_pdef : processes»
			«c_pdef.code»
		«ENDFOR»
		
		func «runFuncName»(proc continuationProcess, locAttr map[string]interface{}) (func(*goat.Process)){
			return func(p *goat.Process){
			    for currp := proc; currp != nil; currp = currp(locAttr, p){}
			}
		}
		
		func «mainFuncName»(){
			//Needed to avoid golang errors "imported and not used"
			_ = func(){
				fmt.Println(strings.Join([]string{},""))
				strconv.Atoi("")
			}
			
			term := make(chan struct{})
			«FOR cdef: components»
				«cdef.getComponentDeclaration(infr)»
			«ENDFOR»
			«FOR cdef: components»
				«cdef.code»
			«ENDFOR»
			<- term
		}
		'''
	}
	
}