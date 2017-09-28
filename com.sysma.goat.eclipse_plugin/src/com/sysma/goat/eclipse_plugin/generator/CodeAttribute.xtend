package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.AttributeToSet
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentAttributeToSet

class CodeAttribute {
	val AttributeToSet attr
	val String componentMap
	val String localMap
	
	new(AttributeToSet a, String componentMap, String localMap){
		attr = a
		this.componentMap = componentMap
		this.localMap = localMap
	}
	
	def boolean isComp(){
		attr instanceof ComponentAttributeToSet
	}
	
	def assign(CharSequence value) {
		if (comp) {
			'''«componentMap».Set("«attr.attribute»", «value»)'''
		} else {
			'''«localMap»["«attr.attribute»"] = «value»'''
		}
	}
	
	def static assignProcessParameter(CharSequence param, CharSequence value){
		'''«CodeModel.localVariablesMap»["«param»"] = «value»'''
	}
	
	def read() {
		if (comp) {
			'''«componentMap».GetValue("«attr.attribute»")'''
		} else {
			'''«localMap»["«attr.attribute»"]'''
		}
	}
	
	def exists(){
		if (comp) {
			'''«componentMap».Has("«attr.attribute»")'''
		} else {
			'''func()bool{_, has:= «localMap»["«attr.attribute»"]; return has}()'''
		}
	}
}
