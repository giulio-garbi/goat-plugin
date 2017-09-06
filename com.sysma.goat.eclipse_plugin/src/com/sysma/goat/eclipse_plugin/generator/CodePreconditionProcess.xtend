package com.sysma.goat.eclipse_plugin.generator

import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.EObject
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions
import com.sysma.goat.eclipse_plugin.goatComponents.Awareness
import com.sysma.goat.eclipse_plugin.goatComponents.Attribute
import com.sysma.goat.eclipse_plugin.goatComponents.Update

class CodePreconditionProcess {
	val List<EObject> preconds
	
	new(Preconditions p){
		//process = p
		preconds = p.precond
	}
	
	new(Awareness awr){
		preconds = #[awr]
	}
	
	static class LocalBackupAttributes{
		public val Attribute attribute
		public val CodeAttribute original
		public val CodeAttribute backup
		
		new(Attribute attribute, String localBackupMap){
			this.attribute = attribute
			this.original = new CodeAttribute(attribute, "", CodeModel.localVariablesMap)
			this.backup = new CodeAttribute(attribute, "", localBackupMap)
			if (attribute.comp){
				throw new IllegalArgumentException("You need only to backup local attributes!")
			}
		} 
	}
	
	def getPreconditionCode(String localBackupMap, String componentMap){
		val locVarsToBackupNames = new HashSet<Attribute>()
		preconds.filter[it instanceof Update].forEach[
			(it as Update).vars.filter[!comp].forEach[locVarsToBackupNames.add(it)]
		]
		
		val locVarsToBackup = locVarsToBackupNames.map[new LocalBackupAttributes(it, localBackupMap)]
		'''
		func()bool{
			«FOR locAttr:locVarsToBackup»
			if «locAttr.original.exists»{
				«locAttr.backup.assign(locAttr.original.read)»
			}
			«ENDFOR»
			if !(func()bool{
				«FOR prec: preconds»
					«IF prec instanceof Update»
						«FOR i: 0..<prec.vals.length»
							«new CodeAttribute(prec.vars.get(i), componentMap, CodeModel.localVariablesMap).
								assign(new CodeValue(prec.vals.get(i),componentMap, CodeModel.localVariablesMap).code)»
						«ENDFOR»
					«ELSEIF prec instanceof Awareness»
						if !(«new CodeReceivePred((prec as Awareness).pred, componentMap, CodeModel.localVariablesMap).code»){
							return false
						}
					«ENDIF» 
					
				«ENDFOR»
				return true
			}()){
				for lv, val := range «localBackupMap» {
					«CodeModel.localVariablesMap»[lv] = val
				}
				return false
			} else {
				return true
			}
		}'''
	}
}