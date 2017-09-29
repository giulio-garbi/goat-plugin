package com.sysma.goat.eclipse_plugin.tests.generator;

import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider;
import com.sysma.goat.eclipse_plugin.tests.generator.GeneratorTestHelper;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GoatComponentsInjectorProvider.class)
@SuppressWarnings("all")
public class ComponentGeneratorTest {
  @Inject
  @Extension
  private GeneratorTestHelper _generatorTestHelper;
  
  @Test
  public void sendReceive() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = send{\"hello world\"}@(true).nil");
    _builder.newLine();
    _builder.append("proc Q = receive(true){proc.x}print(\"$x$\").nil");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    _builder.append("component {} Q at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("hello world"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void sendReceiveSameComponent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = send{\"hello world\"}@(true).nil");
    _builder.newLine();
    _builder.append("proc Q = receive(true){proc.x}print(\"$x$\").nil");
    _builder.newLine();
    _builder.append("proc PQ = P|Q");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {} PQ at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertFalse(out.contains("hello world"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void ifProcess() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P1 = send{0}@(true).(send{3}@(true).nil)");
    _builder.newLine();
    _builder.append("proc P2 = send{2}@(true).(send{1}@(true).nil)");
    _builder.newLine();
    _builder.append("proc P = P1|P2");
    _builder.newLine();
    _builder.newLine();
    _builder.append("proc Q = receive(true){proc.x}.(Q|Qrep)");
    _builder.newLine();
    _builder.append("proc Qrep = if wait until (proc.x < 2) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send{}@(false)print(\"$x$ is little\").nil");
    _builder.newLine();
    _builder.append("} else if wait until (true){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send{}@(false)print(\"$x$ is big\").nil");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    _builder.append("component {} Q at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("0 is little"));
      Assert.assertTrue(out.contains("1 is little"));
      Assert.assertTrue(out.contains("2 is big"));
      Assert.assertTrue(out.contains("3 is big"));
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void infiniteServer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = [proc.x := 0]send{proc.x}@(true).Pp");
    _builder.newLine();
    _builder.append("proc Pp = wait until(proc.x < 1000)[proc.x := proc.x + 1]send{proc.x}@(true).Pp");
    _builder.newLine();
    _builder.newLine();
    _builder.append("proc Q = receive(true){proc.x}.(Q|Qrep)");
    _builder.newLine();
    _builder.append("proc Qrep = if wait until(proc.x == 0){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send{}@(false)print(\"$x$ is zero\").nil");
    _builder.newLine();
    _builder.append("} else if wait until (proc.x - 2*(proc.x / 2) == 0) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send{}@(false)print(\"$x$ is even\").nil");
    _builder.newLine();
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send{}@(false)print(\"$x$ is odd\").nil");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    _builder.append("component {} Q at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      Assert.assertTrue(out.contains("0 is zero"));
      final Consumer<Integer> _function_1 = (Integer it) -> {
        String _plus = (it + " is ");
        String _xifexpression = null;
        if ((((it).intValue() % 2) == 0)) {
          _xifexpression = "even";
        } else {
          _xifexpression = "odd";
        }
        String _plus_1 = (_plus + _xifexpression);
        Assert.assertTrue(out.contains(_plus_1));
      };
      new IntegerRange(1, 999).forEach(_function_1);
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
  
  @Test
  public void infiniteServerPlus() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc P = [proc.x := 0]send{proc.x}@(true).Pp");
    _builder.newLine();
    _builder.append("proc Pp = wait until(proc.x < 1000)[proc.x := proc.x + 1]send{proc.x}@(true).Pp");
    _builder.newLine();
    _builder.newLine();
    _builder.append("proc Q = receive(even(proc.x)){proc.x}print(\"$x$ is even\").(Q) + receive(!(even(proc.x))){proc.x}print(\"$x$ is odd\").(Q)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function bool even(int x){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return x - 2*(x / 2) == 0");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("component {} P at \"127.0.0.1:17654\"");
    _builder.newLine();
    _builder.append("component {} Q at \"127.0.0.1:17654\"");
    _builder.newLine();
    final Procedure2<String, String> _function = (String out, String err) -> {
      int init = 0;
      IntegerRange _upTo = new IntegerRange(0, 999);
      for (final Integer i : _upTo) {
        {
          String _substring = out.substring(init);
          String _plus = (i + " is ");
          String _xifexpression = null;
          if ((((i).intValue() % 2) == 0)) {
            _xifexpression = "even";
          } else {
            _xifexpression = "odd";
          }
          String _plus_1 = (_plus + _xifexpression);
          final int pl = _substring.indexOf(_plus_1);
          Assert.assertTrue((pl >= 0));
          init = (init + pl);
        }
      }
    };
    this._generatorTestHelper.compileAndRun(_builder, _function);
  }
}
