package com.sysma.goat.eclipse_plugin.generator

import java.util.List
import com.sysma.goat.eclipse_plugin.goatComponents.Model

class CodeModel {
	val String packageName
	val String mainFuncName
	val List<CodeProcessDefinition> processes
	val Iterable<CodeComponentDefinition> components
	val Iterable<CodeFunction> functions
	public static val runFuncName = "run"
	
	new(Model model){
		packageName = "main"
		mainFuncName = "main"
		processes = model.processes.map[new CodeProcessDefinition(it)]
		components = model.components.indexed.map[pair | new CodeComponentDefinition(pair.value, runFuncName, '''comp_«pair.key»''')]
		functions = model.functions.map[new CodeFunction(it)]
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
			«IF timeout >= 0 »
				goat.RunCentralServer(17654, term, «timeout»)
			«ENDIF»
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