package com.sysma.goat.eclipse_plugin.tests.parser

import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.InjectWith
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import com.sysma.goat.eclipse_plugin.goatComponents.Model
import org.junit.Assert
import org.junit.Test
import com.sysma.goat.eclipse_plugin.goatComponents.ZeroProcess
import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess
import com.sysma.goat.eclipse_plugin.goatComponents.InterleavingProcess
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcess
import com.sysma.goat.eclipse_plugin.goatComponents.Expression
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentAttributeToSet
import com.sysma.goat.eclipse_plugin.goatComponents.LocalAttributeToSet
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcesses
import com.sysma.goat.eclipse_plugin.goatComponents.Awareness
import com.sysma.goat.eclipse_plugin.goatComponents.Update
import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess
import com.sysma.goat.eclipse_plugin.goatComponents.IfProcesses
import com.sysma.goat.eclipse_plugin.goatComponents.IfBranchProcess
import com.sysma.goat.eclipse_plugin.goatComponents.Comparison
import com.sysma.goat.eclipse_plugin.goatComponents.PrintFormattedStatement

@RunWith(XtextRunner)
@InjectWith(GoatComponentsInjectorProvider)
class ProcessParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	def private encapsulateProcess(CharSequence proc){
		val result = parseHelper.parse('''
		infrastructure infr
		
		proc P = «proc»
		''')
		Assert.assertNotNull(result)
		result.processes.get(0).proc
	}
	
	@Test
	def zeroProcess(){
		val result = encapsulateProcess('''nil''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof ZeroProcess)
	}
	
	@Test
	def brackets(){
		val result = encapsulateProcess('''(((nil)))''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof ZeroProcess)
	}
	
	@Test
	def call(){
		val result = encapsulateProcess('''P''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof InterleavingProcess)
		val p = result as InterleavingProcess
		Assert.assertTrue(p.subProcs.length == 1)
		Assert.assertTrue(p.subProcs.get(0) instanceof CallProcess)
		val cp = p.subProcs.get(0) as CallProcess
		Assert.assertTrue(cp.procname.name == "P")
	}
	
	@Test
	def interleaving(){
		val result = encapsulateProcess('''P|P|P|P''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof InterleavingProcess)
		val p = result as InterleavingProcess
		Assert.assertTrue(p.subProcs.length == 4)
		Assert.assertTrue(p.subProcs.forall[it instanceof CallProcess])
	}
	
	// Input process
	@Test
	def inputProcessSimple(){
		val result = encapsulateProcess('''receive (true) {proc.x,this.y,proc.z}''')
		/*
		 * InputProcesses
		 * 		.preconds = [ []           ]
		 * 		.inputs =   [ InputProcess ]
		 */
		Assert.assertNotNull(result)
		Assert.assertFalse(result.eResource.errors.isEmpty) //missing the next
		Assert.assertTrue(result instanceof InputProcesses)
		val iprocs = result as InputProcesses
		Assert.assertTrue(iprocs.preconds.length == 1)
		Assert.assertTrue(iprocs.preconds.get(0).precond.length == 0)
		Assert.assertTrue(iprocs.inputs.length == 1)
		Assert.assertTrue(iprocs.inputs.get(0) instanceof InputProcess)
		val p = iprocs.inputs.get(0) as InputProcess
		Assert.assertTrue(p.preconds.length == 0)
		Assert.assertTrue(p.rec_pred instanceof Expression)
		Assert.assertTrue(p.msgInParts.length == 3)
		Assert.assertTrue(p.msgInParts.get(1) instanceof ComponentAttributeToSet)
		Assert.assertTrue(p.msgInParts.get(0) instanceof LocalAttributeToSet)
		Assert.assertTrue(p.msgInParts.get(2) instanceof LocalAttributeToSet)
	}
	
	@Test
	def threeInputProcessesSimple(){
		val result = encapsulateProcess('''receive (true) {proc.x,this.y,proc.z} + receive (true) {proc.x,this.y,proc.z} + receive (true) {proc.x,this.y,proc.z}''')
		/*
		 * InputProcesses
		 * 		.preconds = [ []          , []          , []           ]
		 * 		.inputs =   [ InputProcess, InputProcess, InputProcess ]
		 */
		Assert.assertNotNull(result)
		Assert.assertFalse(result.eResource.errors.isEmpty) // missing the next
		Assert.assertTrue(result instanceof InputProcesses)
		val iprocs = result as InputProcesses
		Assert.assertTrue(iprocs.preconds.length == 3)
		Assert.assertTrue(iprocs.inputs.length == 3)
		(0..2).forEach[i|
			Assert.assertTrue(iprocs.preconds.get(i).precond.length == 0)
			Assert.assertTrue(iprocs.inputs.get(i) instanceof InputProcess)
			val p = iprocs.inputs.get(i) as InputProcess
			Assert.assertTrue(p.preconds.length == 0)
			Assert.assertTrue(p.rec_pred instanceof Expression)
			Assert.assertTrue(p.msgInParts.length == 3)
			Assert.assertTrue(p.msgInParts.get(1) instanceof ComponentAttributeToSet)
			Assert.assertTrue(p.msgInParts.get(0) instanceof LocalAttributeToSet)
			Assert.assertTrue(p.msgInParts.get(2) instanceof LocalAttributeToSet)
		]
	}
	@Test
	def inputProcessesPrecond(){
		val result = encapsulateProcess('''wait until(true) receive (true) {proc.x,this.y,proc.z}.nil + [proc.x := 2]wait until(true) receive (true) {proc.x,this.y,proc.z}.nil''')
		/*
		 * InputProcesses
		 * 		.preconds = [ [Awareness] , [Awr., Upd.] ]
		 * 		.inputs =   [ InputProcess, InputProcess ]
		 */
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof InputProcesses)
		val iprocs = result as InputProcesses
		Assert.assertTrue(iprocs.preconds.length == 2)
		Assert.assertTrue(iprocs.inputs.length == 2)
		(0..1).forEach[i|
			Assert.assertTrue(iprocs.preconds.get(i).precond.length == i+1)
			Assert.assertTrue(iprocs.inputs.get(i) instanceof InputProcess)
			val p = iprocs.inputs.get(i) as InputProcess
			Assert.assertTrue(p.preconds.length == 0)
			Assert.assertTrue(p.rec_pred instanceof Expression)
			Assert.assertTrue(p.msgInParts.length == 3)
			Assert.assertTrue(p.msgInParts.get(1) instanceof ComponentAttributeToSet)
			Assert.assertTrue(p.msgInParts.get(0) instanceof LocalAttributeToSet)
			Assert.assertTrue(p.msgInParts.get(2) instanceof LocalAttributeToSet)
			Assert.assertTrue(p.next instanceof ZeroProcess)
		]
		Assert.assertTrue(iprocs.preconds.get(0).precond.get(0) instanceof Awareness)
		Assert.assertTrue(iprocs.preconds.get(1).precond.get(1) instanceof Awareness)
		Assert.assertTrue(iprocs.preconds.get(1).precond.get(0) instanceof Update)
		Assert.assertNull(iprocs.next)
	}
	
	@Test
	def outputProcess(){
		val result = encapsulateProcess('''wait until(true) send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof OutputProcess)
		val p = result as OutputProcess
		Assert.assertTrue(p.precond.precond.length == 1)
		Assert.assertTrue(p.send_pred instanceof Expression)
		Assert.assertTrue(p.msgOutParts.length == 3)
		Assert.assertTrue(p.msgOutParts.forall[it instanceof Expression])
		Assert.assertTrue(p.next instanceof ZeroProcess)
		Assert.assertTrue(p.msec == 0)
		Assert.assertNull(p.output)
	}
	
	@Test
	def outputProcessSleepPrint(){
		val result = encapsulateProcess('''send {proc.x,this.y,proc.z} @ (receiver.ciao == 1) print("Ciao ciao") sleep(10).nil''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof OutputProcess)
		val p = result as OutputProcess
		Assert.assertTrue(p.msec == 10)
		Assert.assertTrue(p.output instanceof PrintFormattedStatement)
		Assert.assertTrue((p.output as PrintFormattedStatement).toPrint == "Ciao ciao")
	}
	
	@Test
	def mixedChoiceForbidden(){
		val result = encapsulateProcess('''send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil + send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil''')
		Assert.assertNotNull(result)
		Assert.assertFalse(result.eResource.errors.isEmpty)
	}
	
	@Test
	def inputProcessEmpty(){
		val result = encapsulateProcess('''receive (true) {}.nil''')
		/*
		 * InputProcesses
		 * 		.preconds = [ []           ]
		 * 		.inputs =   [ InputProcess ]
		 */
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof InputProcesses)
		val iprocs = result as InputProcesses
		Assert.assertTrue(iprocs.preconds.length == 1)
		Assert.assertTrue(iprocs.preconds.get(0).precond.length == 0)
		Assert.assertTrue(iprocs.inputs.length == 1)
		Assert.assertTrue(iprocs.inputs.get(0) instanceof InputProcess)
		val p = iprocs.inputs.get(0) as InputProcess
		Assert.assertTrue(p.preconds.length == 0)
		Assert.assertTrue(p.rec_pred instanceof Expression)
		Assert.assertTrue(p.msgInParts.length == 0)
	}
	
	@Test
	def outputProcessEmpty(){
		val result = encapsulateProcess('''send {} @ (true).nil''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof OutputProcess)
		val p = result as OutputProcess
		Assert.assertTrue(p.precond.precond.length == 0)
		Assert.assertTrue(p.send_pred instanceof Expression)
		Assert.assertTrue(p.msgOutParts.length == 0)
		Assert.assertTrue(p.next instanceof ZeroProcess)
		Assert.assertTrue(p.msec == 0)
		Assert.assertNull(p.output)
	}
	
	@Test
	def sequence(){
		val result = encapsulateProcess('''send {} @ (true).receive (proc.x > 3) {proc.a}.([proc.s := 8] send {} @ (false).nil)''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	// if 
	
	@Test
	def if_(){
		val result = encapsulateProcess('''if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil }''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof IfProcesses)
		val ifp = result as IfProcesses
		Assert.assertTrue(ifp.branches.length == 1)
		val branch = ifp.branches.get(0) as IfBranchProcess
		Assert.assertTrue(branch.cond.precond.length == 1)
		val p = branch.then as OutputProcess
		Assert.assertTrue(p.precond.precond.length == 0)
		Assert.assertTrue(p.send_pred instanceof Expression)
		Assert.assertTrue(p.msgOutParts.length == 3)
		Assert.assertTrue(p.msgOutParts.forall[it instanceof Expression])
		Assert.assertTrue(p.next instanceof ZeroProcess)
		Assert.assertTrue(p.msec == 0)
		Assert.assertNull(p.output)
	}
	
	@Test
	def if_ElseIf(){
		val result = encapsulateProcess('''if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } else if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } ''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof IfProcesses)
		val ifp = result as IfProcesses
		Assert.assertTrue(ifp.branches.length == 2)
		ifp.branches.forEach[br|
			val branch = br as IfBranchProcess
			Assert.assertTrue(branch.cond.precond.length == 1)
			val p = branch.then as OutputProcess
			Assert.assertTrue(p.precond.precond.length == 0)
			Assert.assertTrue(p.send_pred instanceof Expression)
			Assert.assertTrue(p.msgOutParts.length == 3)
			Assert.assertTrue(p.msgOutParts.forall[it instanceof Expression])
			Assert.assertTrue(p.next instanceof ZeroProcess)
			Assert.assertTrue(p.msec == 0)
			Assert.assertNull(p.output)
		]
	}
	
	@Test
	def if_Else(){
		val result = encapsulateProcess('''if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } else { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } ''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result instanceof IfProcesses)
		val ifp = result as IfProcesses
		Assert.assertTrue(ifp.branches.length == 2)
		ifp.branches.forEach[br|
			val branch = br as IfBranchProcess
			val p = branch.then as OutputProcess
			Assert.assertTrue(p.precond.precond.length == 0)
			Assert.assertTrue(p.send_pred instanceof Expression)
			Assert.assertTrue(p.msgOutParts.length == 3)
			Assert.assertTrue(p.msgOutParts.forall[it instanceof Expression])
			Assert.assertTrue(p.next instanceof ZeroProcess)
			Assert.assertTrue(p.msec == 0)
			Assert.assertNull(p.output)
		]
	}
	
	@Test
	def if_Else_Else(){
		val result = encapsulateProcess('''if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } else { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } else { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil }''')
		Assert.assertNotNull(result)
		Assert.assertFalse(result.eResource.errors.isEmpty)
	}
	
	@Test
	def if_Else_ElseIf(){
		val result = encapsulateProcess('''if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } else { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } else if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil }''')
		Assert.assertNotNull(result)
		Assert.assertFalse(result.eResource.errors.isEmpty)
	}
	
	// Preconditions
	def private encapsulatePrecondition(CharSequence pre){
		val result = parseHelper.parse('''
			proc P = «pre» send {} @ (true).nil
		''')
		Assert.assertNotNull(result)
		(result.processes.get(0).proc as OutputProcess).precond
	}
	
	@Test
	def awareness(){
		val result = encapsulatePrecondition('''wait until(proc.x > 0)''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result.precond.length == 1)
		Assert.assertTrue(result.precond.get(0) instanceof Awareness)
		Assert.assertTrue((result.precond.get(0) as Awareness).pred instanceof Comparison)
	}
	
	@Test
	def update(){
		val result = encapsulatePrecondition('''[proc.x := 4]''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result.precond.length == 1)
		Assert.assertTrue(result.precond.get(0) instanceof Update)
	}
	
	@Test
	def mixPreconds(){
		val result = encapsulatePrecondition('''[proc.x := 4] wait until(proc.f > this.g && proc.h <= 8) [proc.h := 9, proc.z:= this.q]''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		Assert.assertTrue(result.precond.length == 3)
		Assert.assertTrue(result.precond.get(0) instanceof Update)
		Assert.assertTrue(result.precond.get(1) instanceof Awareness)
		Assert.assertTrue(result.precond.get(2) instanceof Update)
		
		Assert.assertTrue((result.precond.get(0) as Update).vars.length == 1)
		Assert.assertTrue((result.precond.get(2) as Update).vars.length == 2)
	}
}