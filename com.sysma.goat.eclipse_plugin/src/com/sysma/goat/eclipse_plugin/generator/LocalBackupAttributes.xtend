package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.LocalAttributeToSet

class LocalBackupAttributes{
	public val LocalAttributeToSet attribute
	public val CodeAttribute original
	public val CodeAttribute backup
	
	new(LocalAttributeToSet attribute, String localBackupMap){
		this.attribute = attribute
		this.original = new CodeAttribute(attribute, "", CodeProcessDefinition.localVariablesMap)
		this.backup = new CodeAttribute(attribute, "", localBackupMap)
		/*if (attribute.comp){
			throw new IllegalArgumentException("You need only to backup local attributes!")
		}*/
	} 
}