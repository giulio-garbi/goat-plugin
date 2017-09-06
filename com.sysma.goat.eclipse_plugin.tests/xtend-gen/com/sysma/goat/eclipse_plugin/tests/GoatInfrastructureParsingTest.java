/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.tests;

import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.goatInfrastructure.Infrastructure;
import com.sysma.goat.eclipse_plugin.tests.GoatInfrastructureInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GoatInfrastructureInjectorProvider.class)
@SuppressWarnings("all")
public class GoatInfrastructureParsingTest {
  @Inject
  private ParseHelper<Infrastructure> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Infrastructure result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
