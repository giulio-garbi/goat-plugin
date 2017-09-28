package com.sysma.goat.eclipse_plugin.tests.parser;

import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.goatComponents.Model;
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GoatComponentsInjectorProvider.class)
@SuppressWarnings("all")
public class ComponentsParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void emptyComponent() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("proc P = nil");
      _builder.newLine();
      _builder.append("component {} P at \"ip\"");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
      int _length = ((Object[])Conversions.unwrapArray(result.getComponents().get(0).getEnv().getAttrs(), Object.class)).length;
      boolean _equals = (_length == 0);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void filledComponent() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("proc P = nil");
      _builder.newLine();
      _builder.append("component {x := 4} P at \"ip\"");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
      int _length = ((Object[])Conversions.unwrapArray(result.getComponents().get(0).getEnv().getAttrs(), Object.class)).length;
      boolean _equals = (_length == 1);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void numberedAttributeNotAllowed() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("proc P = nil");
      _builder.newLine();
      _builder.append("component {5 := 4} P at \"ip\"");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertFalse(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void componentMustReferAProcess() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("proc P = nil");
      _builder.newLine();
      _builder.append("component {x := 4} at \"ip\"");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertFalse(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}