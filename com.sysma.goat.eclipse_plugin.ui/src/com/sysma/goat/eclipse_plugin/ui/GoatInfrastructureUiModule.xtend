/*
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.builder.IXtextBuilderParticipant

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class GoatInfrastructureUiModule extends AbstractGoatInfrastructureUiModule {
    override Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
        return JavaProjectBasedBuilderParticipant2;
    }
}
