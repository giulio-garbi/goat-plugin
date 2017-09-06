package com.sysma.goat.eclipse_plugin.generator

import java.util.List
import com.sysma.goat.eclipse_plugin.goatComponents.IfProcesses
import com.sysma.goat.eclipse_plugin.goatComponents.IfBranchProcess

class CodeIfProcesses extends CodeTree {
	
	private static var progressiveIfBranch = 0
	
	val String branchChoiceVar
	val List<CodeIfProcess> branches
	
	new(IfProcesses ifb){
		branchChoiceVar = "ifb_var_"+(progressiveIfBranch++)
		branches = ifb.branches.map[new CodeIfProcess(it as IfBranchProcess)]
	}
	 
	
	override getCode() {
		'''
			var «branchChoiceVar» int
			p.SendOrReceive(func(attr *goat.Attributes, receiving bool) goat.SendReceive{
				lbm := map[string]string{}
				attrWrap := goat.AttributesWrapper{}
				attrWrap.Init(attr)
				«FOR branch : branches.indexed»
					if(receiving == «branch.value.receivingBranch» && «branch.value.getConditionCode("lbm", "attrWrap")»()){
						«branchChoiceVar» = «branch.key»
						attrWrap.Commit()
						return «branch.value.branchCode»
					}
					lbm = map[string]string{}
					attrWrap.Rollback()
				«ENDFOR»
				
				return goat.ThenFail()
			})
			
			switch «branchChoiceVar» {
				«FOR branch : branches.indexed»
					case «branch.key»:
						«branch.value.thenCode»
				«ENDFOR»
				default:
					panic("Invalid branch!")
			}
		'''
	}
	
}
