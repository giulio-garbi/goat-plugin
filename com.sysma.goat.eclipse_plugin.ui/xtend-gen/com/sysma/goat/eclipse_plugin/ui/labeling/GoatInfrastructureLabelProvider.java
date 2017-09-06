/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class GoatInfrastructureLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public GoatInfrastructureLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
