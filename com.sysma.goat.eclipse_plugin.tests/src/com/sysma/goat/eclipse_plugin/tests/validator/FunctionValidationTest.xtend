package com.sysma.goat.eclipse_plugin.tests.validator

import org.junit.runner.RunWith
import org.eclipse.xtext.testing.XtextRunner
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import com.sysma.goat.eclipse_plugin.goatComponents.Model
import org.junit.Test
import static org.junit.Assert.*
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage

@RunWith(XtextRunner)
@InjectWith(GoatComponentsInjectorProvider)
class FunctionValidationTest {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper2
	
	@Test
	def useVarBeforeDefinition(){
		val result = parse('''
			function int fun (int i, string s, bool b){
				var x = y
				var y = 5
				return 7
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.localVarRef,org.eclipse.xtext.diagnostics.Diagnostic.LINKING_DIAGNOSTIC, "Couldn't resolve reference to LRef 'y'.")
	}
	
	// Hiding
	@Test
	def twoDifferentNames(){
		val result = parse('''
			function int fun (int i, string s, bool b){
				var x = 0
				var y = 5
				return x+y
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def sameName(){
		val result = parse('''
			function int funS (int i, string s, bool b){
				var x = 0
				var x = 5
				return x+x
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.funcVarDeclaration,null, "Variable x declared multiple times")
	}	
	
	@Test
	def sameNameTwoFunctions(){
		val result = parse('''
			function int fun (int i, string s, bool b){
				var x = 0
				return x+x
			}
			
			function int fun2 (int i, string s, bool b){
				var x = 0
				return x+x
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def sameNameTwoBlocksNotAllowed(){
		val result = parse('''
			function int fun (int i, string s, bool b){
				if (5 > 0){
					var x = 0
					return x+x
				} else {
					var x = 1
					return x
				}
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.funcVarDeclaration,null, "Variable x declared multiple times")
	}	
	
	@Test
	def sameNameFunc(){
		val result = parse('''
			function int fun (){
				return 3
			}
			
			function int fun (int x){
				return 4
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.funcDefinition,null, "Function fun declared multiple times")
	}	
	
	
	@Test
	def twoFunctions(){
		val result = parse('''
			function int fun1 (){
				return 3
			}
			
			function int fun2 (int x){
				return 4
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}	
	
	// Parameter hiding
	@Test
	def twoParams(){
		val result = parse('''
			function int fun1 (int x, int y){
				return 3
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}	
	
	@Test
	def sameNameParams(){
		val result = parse('''
			function int fun (int x, int y, string x){
				return 3
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.funcParam,null, "Parameter x declared multiple times")
	}
	
	@Test
	def sameNameParams2(){
		val result = parse('''
			function int fun (int x, int y, string z, bool y, string x){
				return 3
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.funcParam,null, "Parameter x declared multiple times")
		result.assertError(GoatComponentsPackage.eINSTANCE.funcParam,null, "Parameter y declared multiple times")
	}
	
	@Test
	def twoParamsTwoFunc(){
		val result = parse('''
			function int fun1 (int x, int y){
				return 3
			}
			
			function int fun2 (int x){
				return 3
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	// Always returning
	@Test
	def returningAtTheEnd(){
		val result = parse('''
			function int fun (){
				var x = 4
				var y = 5
				return 3
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}	
	
	@Test
	def returningAtTheMiddle(){
		val result = parse('''
			function int fun (){
				var x = 4
				var y = 5
				return 3
				y = x
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}	
	
	@Test
	def returningIf(){
		val result = parse('''
			function int fun (){
				var y = 8
				if (5 > 3){
					return 3
				}
				y = 9
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.funcDefinition,null, "Functions must eventually return")
	}	
	
	@Test
	def returningIfElse(){
		val result = parse('''
			function int fun (){
				if (5 > 3){
					return 3
				} else {
					return 5
				}
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def returningIfElifElse(){
		val result = parse('''
			function int fun (){
				if (5 > 3){
					return 3
				} else if (6 < 9){ 
					return 8
				} else {
					return 5
				}
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def returningIfElif(){
		val result = parse('''
			function int fun (){
				var y = 8
				if (5 > 3){
					return 3
				} else if (9 < 0) {
					return 123
				}
				y = 9
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.funcDefinition,null, "Functions must eventually return")
	}	
	
	// Return type
	
	@Test
	def returningTypeOk(){
		val result = parse('''
			function int fun (){
				var y = 8
				if (5 > 3){
					return 3
				} else if (9 < 0) {
					return 123
				}
				y = 9
				return y
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}		
	
	def returningTypeWrong(){
		val result = parse('''
			function int fun (){
				var y = 8
				if (5 > 3){
					return "3"
				} else if (9 < 0) {
					return 123
				}
				y = 9
				return y
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.funcReturn,null, "Must return a int")
	}	
}