package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.FuncDefinition
import com.sysma.goat.eclipse_plugin.goatComponents.FuncBlock
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarAssign
import com.sysma.goat.eclipse_plugin.goatComponents.FuncIfElse
import com.sysma.goat.eclipse_plugin.goatComponents.FuncReturn
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarDeclaration
import com.sysma.goat.eclipse_plugin.goatComponents.FuncString
import com.sysma.goat.eclipse_plugin.goatComponents.FuncMemoryRef
import com.sysma.goat.eclipse_plugin.goatComponents.FuncPredicate
import com.sysma.goat.eclipse_plugin.goatComponents.FuncAnd
import com.sysma.goat.eclipse_plugin.goatComponents.FuncNot
import com.sysma.goat.eclipse_plugin.goatComponents.FuncImmediate
import com.sysma.goat.eclipse_plugin.goatComponents.FuncEqualityTest

class CodeFunction {
	val FuncDefinition definition;
	
	new(FuncDefinition fdef){
		definition = fdef
	}
	
	def getCode(){
		'''
			func f_«definition.name»(«
			definition.params.map['''«it.name» string'''].join(",")») string «makeCode(definition.blk)»
		'''
	}
	
	def CharSequence makeCode(Object item){
		switch item{
			FuncBlock:
				'''
			{
				«item.statements.map[makeCode].join('\n')»
			}'''
			FuncVarAssign:
				'''«item.^var.name» = «makeCode(item.^val)»'''
			FuncIfElse:
				(0..<item.then.length).map[i|
					'''
					if («makeCode(item.test.get(i))») «makeCode(item.then.get(i))»'''].join("else ") 
							+ 
				if (item.elseBranch !== null) {
					'''else «makeCode(item.elseBranch)»'''
				} else {
					''
				}
			FuncReturn:
				'''return «makeCode(item.^val)»'''
			FuncVarDeclaration:
				'''
			var «item.name» = «makeCode(item.^val)»
			_ = «item.name»'''
			FuncString:
				'''"«item.imm»"'''
			FuncMemoryRef:
				'''«item.ref.name»'''
			FuncPredicate:
				item.or.map[makeCode].join(" || ")
			FuncAnd:
				item.and.map[makeCode].join(" && ")
			FuncNot:
				if(item.neg) "!" + makeCode(item.term) else makeCode(item.term)
			FuncImmediate:
				if(item.isTrue) "true" else "false"
			FuncEqualityTest:
				switch item.operand {
					case '=':
						'''«makeCode(item.op1)» == «makeCode(item.op2)»'''
					case '!=':
						'''«makeCode(item.op1)» != «makeCode(item.op2)»'''
					default:
						'''
					func ()bool{
						o1, err := strconv.Atoi(«makeCode(item.op1)»)
						if err != nil {
							panic("Not an integer number")
						}
						o2, err := strconv.Atoi(«makeCode(item.op2)»)
						if err != nil {
							panic("Not an integer number")
						}
						return o1 «item.operand» o2
					}()'''
				}
		}
	}
}
