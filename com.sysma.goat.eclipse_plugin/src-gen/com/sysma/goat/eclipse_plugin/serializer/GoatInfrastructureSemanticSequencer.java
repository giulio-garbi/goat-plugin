/*
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.serializer;

import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.goatInfrastructure.GoatInfrastructurePackage;
import com.sysma.goat.eclipse_plugin.goatInfrastructure.Params;
import com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer;
import com.sysma.goat.eclipse_plugin.services.GoatInfrastructureGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class GoatInfrastructureSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GoatInfrastructureGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GoatInfrastructurePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GoatInfrastructurePackage.PARAMS:
				sequence_Params(context, (Params) semanticObject); 
				return; 
			case GoatInfrastructurePackage.SINGLE_SERVER:
				sequence_SingleServer(context, (SingleServer) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Params returns Params
	 *
	 * Constraint:
	 *     ((keys+=ID values+=STRING)* keys+=ID values+=STRING)?
	 */
	protected void sequence_Params(ISerializationContext context, Params semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Infrastructure returns SingleServer
	 *     SingleServer returns SingleServer
	 *
	 * Constraint:
	 *     (external?='external'? params=Params)
	 */
	protected void sequence_SingleServer(ISerializationContext context, SingleServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
