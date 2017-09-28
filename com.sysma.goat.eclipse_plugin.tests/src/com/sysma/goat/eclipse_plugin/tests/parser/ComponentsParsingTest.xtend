package com.sysma.goat.eclipse_plugin.tests.parser

import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider
import com.google.inject.Inject
import com.sysma.goat.eclipse_plugin.goatComponents.Model
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(GoatComponentsInjectorProvider)
class ComponentsParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def emptyComponent(){
		val result = parseHelper.parse('''
			proc P = nil
			component {} P at "ip"
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.empty)
		Assert.assertTrue(result.components.get(0).env.attrs.length == 0)
	}
	
	@Test
	def filledComponent(){
		val result = parseHelper.parse('''
			proc P = nil
			component {x := 4} P at "ip"
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.empty)
		Assert.assertTrue(result.components.get(0).env.attrs.length == 1)
	}
	
	@Test
	def numberedAttributeNotAllowed(){
		val result = parseHelper.parse('''
			proc P = nil
			component {5 := 4} P at "ip"
		''')
		Assert.assertNotNull(result)
		Assert.assertFalse(result.eResource.errors.empty)
	}
	
	@Test
	def componentMustReferAProcess(){
		val result = parseHelper.parse('''
			proc P = nil
			component {x := 4} at "ip"
		''')
		Assert.assertNotNull(result)
		Assert.assertFalse(result.eResource.errors.empty)
	}
}
