/*
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GoatComponentsStandaloneSetup extends GoatComponentsStandaloneSetupGenerated {

	def static void doSetup() {
		new GoatComponentsStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
