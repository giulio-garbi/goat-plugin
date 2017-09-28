package com.sysma.goat.eclipse_plugin.tests.generator;

import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider;
import com.sysma.goat.eclipse_plugin.tests.generator.GeneratorTestHelper;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GoatComponentsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionGeneratorTest {
  @Inject
  @Extension
  private GeneratorTestHelper _generatorTestHelper;
  
  @Test
  public void sumExpression() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = [proc.x := 1+5] send{}@(false) print(\"EXPRESSION $x$\").nil");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("EXPRESSION 6"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void expressionWithAttributes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = [proc.g := 3, proc.f := ((this.seven+5)*proc.g)/7] send{}@(false) print(\"EXPRESSION $f$\").nil");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {seven := 7} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("EXPRESSION 5"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void expressionWithComparisonInt() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = [proc.g := 3, proc.f := this.seven > 3] send{}@(false) print(\"EXPRESSION $f$\").nil");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {seven := 7} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("EXPRESSION true"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void expressionWithComparisonIntBool() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = [proc.g := 3, proc.f := this.seven > 3 == 3 > 4] send{}@(false) print(\"EXPRESSION $f$\").nil");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {seven := 7} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("EXPRESSION false"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void expressionFunctionRecursive() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = [proc.six := 6, proc.f := fact(proc.six)] send{}@(false) print(\"EXPRESSION $f$\").nil");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function int fact(int n){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (n <= 1) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 1");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return n * fact(n-1)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("EXPRESSION 720"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void expressionSendPredicate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = send{1}@(receiver.pname == \"Q\").receive(true){proc.x}print(\"P got $x$\").nil");
    _builder.newLine();
    _builder.append("proc Q = receive(true){proc.x}print(\"Q got $x$\").(send{proc.x + 1}@(receiver.pname == \"P\").nil)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {pname := \"P\"} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    _builder.append("component {pname := \"Q\"} Q at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("Q got 1"));
      Assert.assertTrue(out.contains("P got 2"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void expressionSendPredicateStrings() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = send{\"ciao: come (va)\"}@(receiver.pname == \"Q\").nil");
    _builder.newLine();
    _builder.append("proc Q = receive(true){proc.x}print(\"$x$\").nil");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {pname := \"P\"} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    _builder.append("component {pname := \"Q\"} Q at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("ciao: come (va)"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
}
