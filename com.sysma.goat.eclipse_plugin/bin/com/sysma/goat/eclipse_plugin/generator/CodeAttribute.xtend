package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.Attribute

class CodeAttribute {
	val Attribute attr
	val String componentMap
	val String localMap
	
	new(Attribute a, String componentMap, String localMap){
		attr = a
		this.componentMap = componentMap
		this.localMap = localMap
	}
	
	def assign(CharSequence value) {
		if (attr.comp) {
			'''«componentMap».Set("«attr.ident»", «value»)'''
		} else {
			'''«localMap»["«attr.ident»"] = «value»'''
		}
	}
	
	def static assignProcessParameter(CharSequence param, CharSequence value){
		'''«CodeModel.localVariablesMap»["«param»"] = «value»'''
	}
	
	def read() {
		if (attr.comp) {
			'''«componentMap».GetValue("«attr.ident»")'''
		} else {
			'''«localMap»["«attr.ident»"]'''
		}
	}
	
	def exists(){
		if (attr.comp) {
			'''«componentMap».Has("«attr.ident»")'''
		} else {
			'''func()bool{_, has:= «localMap»["«attr.ident»"]; return has}()'''
		}
	}
}
