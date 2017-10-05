package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.PrintStatement
import com.sysma.goat.eclipse_plugin.goatComponents.PrintFormattedStatement
import java.util.ArrayList
import org.apache.commons.lang.math.NumberUtils
import java.util.List
import com.sysma.goat.eclipse_plugin.goatComponents.AttributeToSet

class CodePrint {
	
	def static of(PrintStatement pstat, String componentAttr, String localAttr, List<AttributeToSet> message){
		switch pstat{
			PrintFormattedStatement:
				'''fmt.Println(«convertString(pstat.toPrint, componentAttr, CodeProcessDefinition.localVariablesMap, message)»)'''
			default:
				""
		}
	}
	
	def private static escape(String escapedSequence, String componentAttr, String localAttr, List<AttributeToSet> message){
		if(escapedSequence.length == 0){
			return ('"$"')
		} else if (NumberUtils.isDigits(escapedSequence)) {
			val tupleIdx = Integer.parseInt(escapedSequence)
			if (tupleIdx >= message.length){
				return '''"<invalid tuple index>"'''
		    } else {
		    	val attribCode = new CodeAttribute(message.get(tupleIdx), componentAttr, localAttr)
				return ('''fmt.Sprintf("%s: %v","«attribCode.name»", «attribCode.read»''')
			}
		} else{
			var attrName = ""
			var compLevel = false
			if(escapedSequence.startsWith("this.")){
				compLevel = true
				attrName = escapedSequence.substring(5)
			} else {
				compLevel = false
				attrName = escapedSequence
			}
			val attribCode = new CodeAttribute(attrName,compLevel, componentAttr, localAttr)
			return ('''fmt.Sprintf("%v",«attribCode.read»)''')
		}
	}
	
	// TODO escaping actual strings for go
	def private static convertString(String text, String componentAttr, String localAttr, List<AttributeToSet> message){
		var outTokens = new ArrayList<String>()
		var String escapedSequence = null
		var actualString = ""
		
		for(ch:text.toCharArray){
			if(ch == '$'.charAt(0)){
				if(escapedSequence === null){
					escapedSequence =  ""
					outTokens.add('"'+actualString+'"')
				} else {
					outTokens.add(escape(escapedSequence, componentAttr, localAttr, message))
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
			outTokens.add(escape(escapedSequence, componentAttr, localAttr, message))
		}
		return String.join(" + ", outTokens)
	}
}