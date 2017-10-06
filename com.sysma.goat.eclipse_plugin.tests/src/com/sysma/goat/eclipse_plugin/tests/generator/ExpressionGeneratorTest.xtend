package com.sysma.goat.eclipse_plugin.tests.generator

import org.eclipse.xtext.testing.InjectWith
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider
import org.eclipse.xtext.testing.XtextRunner
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.junit.Test
import org.junit.Assert

@RunWith(XtextRunner)
@InjectWith(GoatComponentsInjectorProvider)
class ExpressionGeneratorTest {
	@Inject extension GeneratorTestHelper
	
	@Test
	def sumExpression(){
		compileAndRun('''
		infrastructure infr
		
		proc P = [proc.x := 1+5] send{}@(false) print("EXPRESSION $x$").nil
		
		component {} P at "127.0.0.1:17654"
		''',[out, err| Assert.assertTrue(out.contains("EXPRESSION 6"))])
	}
	
	@Test
	def expressionWithAttributes(){
		compileAndRun('''
		proc P = [proc.g := 3, proc.f := ((this.seven+5)*proc.g)/7] send{}@(false) print("EXPRESSION $f$").nil
		
		component {seven := 7} P at "127.0.0.1:17654"
		''',[out, err| Assert.assertTrue(out.contains("EXPRESSION 5"))])
	}
	
	@Test
	def expressionWithComparisonInt(){
		compileAndRun('''
		proc P = [proc.g := 3, proc.f := this.seven > 3] send{}@(false) print("EXPRESSION $f$").nil
		
		component {seven := 7} P at "127.0.0.1:17654"
		''',[out, err| Assert.assertTrue(out.contains("EXPRESSION true"))])
	}
	
	@Test
	def expressionWithComparisonIntBool(){
		compileAndRun('''
		proc P = [proc.g := 3, proc.f := this.seven > 3 == 3 > 4] send{}@(false) print("EXPRESSION $f$").nil
		
		component {seven := 7} P at "127.0.0.1:17654"
		''',[out, err| Assert.assertTrue(out.contains("EXPRESSION false"))])
	}
	
	@Test
	def expressionFunctionRecursive(){
		compileAndRun('''
		proc P = [proc.six := 6, proc.f := fact(proc.six)] send{}@(false) print("EXPRESSION $f$").nil
		
		component {} P at "127.0.0.1:17654"
		
		function int fact(int n){
			if (n <= 1) {
				return 1
			} else {
				return n * fact(n-1)
			}
		}
		''',[out, err| Assert.assertTrue(out.contains("EXPRESSION 720"))])
	}
	
	@Test
	def expressionSendPredicate(){
		compileAndRun('''
		proc P = send{1}@(receiver.pname == "Q").receive(true){proc.x}print("P got $x$").nil
		proc Q = receive(true){proc.x}print("Q got $x$").(send{proc.x + 1}@(receiver.pname == "P").nil)
		
		component {pname := "P"} P at "127.0.0.1:17654"
		component {pname := "Q"} Q at "127.0.0.1:17654"
		''',[out, err| 
				Assert.assertTrue(out.contains("Q got 1"))
				Assert.assertTrue(out.contains("P got 2"))
		])
	}
	
	@Test
	def expressionSendPredicateStrings(){
		compileAndRun('''
		proc P = send{"ciao: come (va)"}@(receiver.pname == "Q").nil
		proc Q = receive(true){proc.x}print("$x$").nil
		
		component {pname := "P"} P at "127.0.0.1:17654"
		component {pname := "Q"} Q at "127.0.0.1:17654"
		''',[out, err| 
				Assert.assertTrue(out.contains("ciao: come (va)"))
		])
	}
}