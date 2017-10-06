package com.sysma.goat.eclipse_plugin.tests.validator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage;
import com.sysma.goat.eclipse_plugin.goatComponents.Model;
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GoatComponentsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionValidatorTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  public void checkNoErrorApartInfr(final EObject obj) {
    final Function1<Resource.Diagnostic, Boolean> _function = (Resource.Diagnostic it) -> {
      String _message = it.getMessage();
      return Boolean.valueOf((!Objects.equal(_message, "Couldn\'t resolve reference to Infrastructure \'infr\'.")));
    };
    int _length = ((Object[])Conversions.unwrapArray(IterableExtensions.<Resource.Diagnostic>filter(obj.eResource().getErrors(), _function), Object.class)).length;
    boolean _equals = (_length == 0);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void intExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("function int fun (int i, string s, bool b){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x = 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var y = 5");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return (x+y) * 6 - 5");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this.checkNoErrorApartInfr(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void boolExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("function bool fun (int i, string s, bool b){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x = 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var y = 5");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return ((x+y) * 6 - 5) > 10 == false");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this.checkNoErrorApartInfr(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void stringExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("function string fun (){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x = 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var y = 5");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return \"o\" ++ fun()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this.checkNoErrorApartInfr(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mixedSumExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("function string fun (int i, string s, bool b){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x = 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var y = 5");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return \"3\" + 9");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getPlus(), null, "Expected a int expression");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void noGlobalAttributeInFunc() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("function string fun (){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x = 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var y = 5");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return \"o\" ++ this.z");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getComponentAttributeRef(), null, "Attributes cannot be used inside functions");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void noRecAttributeInFunc() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("function string fun (){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x = 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var y = 5");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return \"o\" ++ receiver.z");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getRecAttributeRef(), null, "Receiver attributes can be used only in output predicates");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void receiveBoolExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = receive (proc.x > 10) {proc.w}.nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this.checkNoErrorApartInfr(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void receiveNonBoolExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = receive (10) {proc.w}.nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getInputProcess(), null, "Expected a bool expression");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void globalAttributeInReceive() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = receive (this.l) {proc.w}.nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this.checkNoErrorApartInfr(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void noRecAttributeInReceive() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = receive (receiver.l) {proc.w}.nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getRecAttributeRef(), null, "Receiver attributes can be used only in output predicates");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void sendBoolExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = send {proc.w} @ (proc.x > 10).nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this.checkNoErrorApartInfr(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void sendNonBoolExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = send {proc.w} @ (\"k\").nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getOutputProcess(), null, "Expected a bool expression");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void noGlobalAttributeInSendMessage() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = send {this.w} @ (true).nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getComponentAttributeRef(), null, "Component attributes cannot be used in send messages and/or predicates. Use local attributes.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void noGlobalAttributeInSendPred() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = send {proc.w} @ (receiver.s == this.d).nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getComponentAttributeRef(), null, "Component attributes cannot be used in send messages and/or predicates. Use local attributes.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void globalAttributeInPreconditions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = wait until (this.x == 8) send {} @ (true).nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this.checkNoErrorApartInfr(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void noReceiverAttributeInSendPreconditions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = wait until (receiver.x == 8) send {} @ (true).nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getRecAttributeRef(), null, "Receiver attributes can be used only in output predicates");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void awarenessBoolExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P = wait until(true) send {proc.w} @ (true).nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this.checkNoErrorApartInfr(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void awarenessNonBoolExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("infrastructure infr");
      _builder.newLine();
      _builder.newLine();
      _builder.append("proc P =  wait until(4) send {proc.w} @ (false).nil");
      _builder.newLine();
      final Model result = this._parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertError(result, GoatComponentsPackage.eINSTANCE.getAwareness(), null, "Expected a bool expression");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
