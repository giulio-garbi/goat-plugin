package com.sysma.goat.eclipse_plugin.tests.generator

import org.junit.runner.RunWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.InjectWith
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider
import com.google.inject.Inject
import org.junit.Test
import org.junit.Assert

@RunWith(XtextRunner)
@InjectWith(GoatComponentsInjectorProvider)
class ComponentGeneratorTest {
	@Inject extension GeneratorTestHelper
	
	@Test
	def sendReceive(){
		compileAndRun('''
		proc P = send{"hello world"}@(true).nil
		proc Q = receive(true){proc.x}print("$x$").nil
		
		component {} P at "127.0.0.1:17654"
		component {} Q at "127.0.0.1:17654"
		''',[out, err| Assert.assertTrue(out.contains("hello world"))])
	}
	
	@Test
	def sendReceiveSameComponent(){
		compileAndRun('''
		proc P = send{"hello world"}@(true).nil
		proc Q = receive(true){proc.x}print("$x$").nil
		proc PQ = P|Q
		
		component {} PQ at "127.0.0.1:17654"
		''',[out, err| Assert.assertFalse(out.contains("hello world"))])
	}
	
	@Test
	def ifProcess(){
		compileAndRun('''
		proc P1 = send{0}@(true).(send{3}@(true).nil)
		proc P2 = send{2}@(true).(send{1}@(true).nil)
		proc P = P1|P2
		
		proc Q = receive(true){proc.x}.(Q|Qrep)
		proc Qrep = if wait until (proc.x < 2) {
			send{}@(false)print("$x$ is little").nil
		} else if wait until (true){
			send{}@(false)print("$x$ is big").nil
		}
		
		component {} P at "127.0.0.1:17654"
		component {} Q at "127.0.0.1:17654"
		''',[out, err| 
			Assert.assertTrue(out.contains("0 is little"))
			Assert.assertTrue(out.contains("1 is little"))
			Assert.assertTrue(out.contains("2 is big"))
			Assert.assertTrue(out.contains("3 is big"))
		])
	}
	
	@Test
	def infiniteServer(){
		compileAndRun('''
		proc P = [proc.x := 0]send{proc.x}@(true).Pp
		proc Pp = wait until(proc.x < 1000)[proc.x := proc.x + 1]send{proc.x}@(true).Pp
		
		proc Q = receive(true){proc.x}.(Q|Qrep)
		proc Qrep = if wait until (proc.x - 2*(proc.x / 2) == 0) {
			send{}@(false)print("$x$ is even").nil
		} else if wait until (true){
			send{}@(false)print("$x$ is odd").nil
		}
		
		component {} P at "127.0.0.1:17654"
		component {} Q at "127.0.0.1:17654"
		''',[out, err| 
			(0..999).forEach[Assert.assertTrue(out.contains(it + " is " + (if(it % 2 == 0)"even" else "odd")))]
		])
	}
	
	@Test
	def infiniteServerPlus(){
		compileAndRun('''
		proc P = [proc.x := 0]send{proc.x}@(true).Pp
		proc Pp = wait until(proc.x < 1000)[proc.x := proc.x + 1]send{proc.x}@(true).Pp
		
		proc Q = receive(even(proc.x)){proc.x}print("$x$ is even").(Q) + receive(!(even(proc.x))){proc.x}print("$x$ is odd").(Q)
		
		function bool even(int x){
			return x - 2*(x / 2) == 0
		}
		
		component {} P at "127.0.0.1:17654"
		component {} Q at "127.0.0.1:17654"
		''',[out, err| 
			var init = 0
			for(i : 0..999){ // must be received in order
				val pl = out.substring(init).indexOf(i + " is " + (if(i % 2 == 0)"even" else "odd")) 
				Assert.assertTrue(pl >= 0)
				init = init + pl
			}
		])
	}
}
