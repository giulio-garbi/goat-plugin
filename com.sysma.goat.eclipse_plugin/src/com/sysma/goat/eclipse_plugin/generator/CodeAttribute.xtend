package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.AttributeToSet
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentAttributeToSet

class CodeAttribute {
	val String attribute
	val boolean comp
	val String componentMap
	val String localMap
	
	new(AttributeToSet a, String componentMap, String localMap){
		this.attribute = a.attribute
		this.comp = a instanceof ComponentAttributeToSet
		this.componentMap = componentMap
		this.localMap = localMap
	}
	
	new(String attrName, boolean comp, String componentMap, String localMap){
		this.attribute = attrName
		this.comp = comp
		this.componentMap = componentMap
		this.localMap = localMap
	}
	
	def assign(CharSequence value) {
		if (comp) {
			'''«componentMap».Set("«attribute»", «value»)'''
		} else {
			'''«localMap»["«attribute»"] = «value»'''
		}
	}
	
	def getName(){
		if (comp) {
			'''this.«attribute»'''
		} else {
			attribute
		}
	}
	
	def static assignProcessParameter(CharSequence param, CharSequence value){
		'''«CodeModel.localVariablesMap»["«param»"] = «value»'''
	}
	
	def read() {
		if (comp) {
			'''«componentMap».GetValue("«attribute»")'''
		} else {
			'''«localMap»["«attribute»"]'''
		}
	}
	
	def exists(){
		if (comp) {
			'''«componentMap».Has("«attribute»")'''
		} else {
			'''func()bool{_, has:= «localMap»["«attribute»"]; return has}()'''
		}
	}
}
