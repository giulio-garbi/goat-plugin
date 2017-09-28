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
import org.eclipse.xtext.testing.validation.ValidationTestHelper

@RunWith(XtextRunner)
@InjectWith(GoatComponentsInjectorProvider)
class ExpressionValidatorTest {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def intExpression(){
		val result = parse('''
			function int fun (int i, string s, bool b){
				var x = 0
				var y = 5
				return (x+y) * 6 - 5
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def boolExpression(){
		val result = parse('''
			function bool fun (int i, string s, bool b){
				var x = 0
				var y = 5
				return ((x+y) * 6 - 5) > 10 == false
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def stringExpression(){
		val result = parse('''
			function string fun (){
				var x = 0
				var y = 5
				return "o" ++ fun()
			}
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def mixedSumExpression(){
		val result = parse('''
			function string fun (int i, string s, bool b){
				var x = 0
				var y = 5
				return "3" + 9
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.plus, null, "Expected a int expression")
	}
	
	@Test
	def noGlobalAttributeInFunc(){
		val result = parse('''
			function string fun (){
				var x = 0
				var y = 5
				return "o" ++ this.z
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.componentAttributeRef, null, "Attributes cannot be used inside functions")
	}
	
	@Test
	def noRecAttributeInFunc(){
		val result = parse('''
			function string fun (){
				var x = 0
				var y = 5
				return "o" ++ receiver.z
			}
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.recAttributeRef, null, "Receiver attributes can be used only in output predicates")
	}
	
	// Expression on receive
	@Test
	def receiveBoolExpression(){
		val result = parse('''
			proc P = receive (proc.x > 10) {proc.w}.nil
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def receiveNonBoolExpression(){
		val result = parse('''
			proc P = receive (10) {proc.w}.nil
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.inputProcess, null, "Expected a bool expression")
	}
	
		@Test
	def globalAttributeInReceive(){
		val result = parse('''
			proc P = receive (this.l) {proc.w}.nil
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def noRecAttributeInReceive(){
		val result = parse('''
			proc P = receive (receiver.l) {proc.w}.nil
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.recAttributeRef, null, "Receiver attributes can be used only in output predicates")
	}
	
	// Expression on send
	@Test
	def sendBoolExpression(){
		val result = parse('''
			proc P = send {proc.w} @ (proc.x > 10).nil
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def sendNonBoolExpression(){
		val result = parse('''
			proc P = send {proc.w} @ ("k").nil
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.outputProcess, null, "Expected a bool expression")
	}
	
	@Test
	def noGlobalAttributeInSendMessage(){
		val result = parse('''
			proc P = send {this.w} @ (true).nil
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.componentAttributeRef, null, "Component attributes cannot be used in send messages and/or predicates. Use local attributes.")
	}
	
	@Test
	def noGlobalAttributeInSendPred(){
		val result = parse('''
			proc P = send {proc.w} @ (receiver.s == this.d).nil
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.componentAttributeRef, null, "Component attributes cannot be used in send messages and/or predicates. Use local attributes.")
	}
	
	@Test
	def globalAttributeInPreconditions(){
		val result = parse('''
			proc P = wait until (this.x == 8) send {} @ (true).nil
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def noReceiverAttributeInSendPreconditions(){
		val result = parse('''
			proc P = wait until (receiver.x == 8) send {} @ (true).nil
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.recAttributeRef, null, "Receiver attributes can be used only in output predicates")
	}
	
	// Expression on awareness
	@Test
	def awarenessBoolExpression(){
		val result = parse('''
			proc P = wait until(true) send {proc.w} @ (true).nil
		''')
		assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def awarenessNonBoolExpression(){
		val result = parse('''
			proc P =  wait until(4) send {proc.w} @ (false).nil
		''')
		assertNotNull(result)
		result.assertError(GoatComponentsPackage.eINSTANCE.awareness, null, "Expected a bool expression")
	}
}