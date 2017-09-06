package com.sysma.goat.eclipse_plugin.generator

import java.util.ArrayList

class StdoutStringHelper {
	def private static escape(String escapedSequence, String componentAttr, String localAttr){
		if(escapedSequence.length == 0){
			return ('"$"')
		} else if (escapedSequence.startsWith("this.")) {
			return ('''«componentAttr».GetValue("«escapedSequence.substring(5)»")''')
		} else {
			return ('''«localAttr»["«escapedSequence»"]''')
		}
	}
	
	// TODO escaping actual strings for go
	def static convertString(String text, String componentAttr, String localAttr){
		var outTokens = new ArrayList<String>()
		var String escapedSequence = null
		var actualString = ""
		
		for(ch:text.toCharArray){
			if(ch == '$'.charAt(0)){
				if(escapedSequence === null){
					escapedSequence =  ""
					outTokens.add('"'+actualString+'"')
				} else {
					outTokens.add(escape(escapedSequence, componentAttr, localAttr))
					escapedSequence = null
				}
				actualString =  ""
			} else {
				if(escapedSequence === null){
					actualString += ch
				} else {
					escapedSequence += ch
				}
			}
		}
		if (escapedSequence === null){
			outTokens.add('"'+actualString+'"')
		} else {
			outTokens.add(escape(escapedSequence, componentAttr, localAttr))
		}
		return String.join(" + ", outTokens)
	}
}