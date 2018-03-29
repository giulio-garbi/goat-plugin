package com.sysma.goat.eclipse_plugin.tests.parser;

import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.goatComponents.Model;
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GoatComponentsInjectorProvider.class)
@SuppressWarnings("all")
public class ProcessParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  private EObject encapsulateProcess(final CharSequence proc) {
    try {
      EObject _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("infrastructure infr");
        _builder.newLine();
        _builder.newLine();
        _builder.append("process P {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(proc, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        final Model result = this.parseHelper.parse(_builder);
        Assert.assertNotNull(result);
        _xblockexpression = result.getProcesses().get(0).getBlock();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void zeroProcess() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nempty cannot be resolved");
  }
  
  @Test
  public void call() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void interleaving() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field proc is undefined for the type ProcessSpawn"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  @Test
  public void defineInterleaving() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nreverseView cannot be resolved"
      + "\ntail cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nlast cannot be resolved");
  }
  
  @Test
  public void inputProcessSimple() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void threeInputProcessSimple() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void threeInputProcessUpdate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void outputProcess() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nhead cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  @Test
  public void outputProcessPrint() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nhead cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  @Test
  public void inputProcessEmpty() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void outputProcessEmpty() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nhead cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  @Test
  public void sequence() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("send {} @ (true); receive (proc.x > 3) {a}; set [proc.s := 8];");
    final EObject result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
  }
  
  @Test
  public void if_() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nhead cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  @Test
  public void if_ElseIf() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nhead cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  @Test
  public void if_Else() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nhead cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  @Test
  public void if_Else_Else() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (true) { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send {proc.x,comp.y,proc.z} @ (receiver.ciao == 1);");
    _builder.newLine();
    _builder.append("} else { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send {proc.x,comp.y,proc.z} @ (receiver.ciao == 1);");
    _builder.newLine();
    _builder.append("} else { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send {proc.x,comp.y,proc.z} @ (receiver.ciao == 1);");
    _builder.newLine();
    _builder.append("}");
    final EObject result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertFalse(result.eResource().getErrors().isEmpty());
  }
  
  @Test
  public void if_Else_ElseIf() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (true) { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send {proc.x,comp.y,proc.z} @ (receiver.ciao == 1);");
    _builder.newLine();
    _builder.append("} else { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send {proc.x,comp.y,proc.z} @ (receiver.ciao == 1);");
    _builder.newLine();
    _builder.append("} else if (true) { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("send {proc.x,comp.y,proc.z} @ (receiver.ciao == 1);");
    _builder.newLine();
    _builder.append("}");
    final EObject result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertFalse(result.eResource().getErrors().isEmpty());
  }
  
  @Test
  public void sleep() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nhead cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  @Test
  public void awareness() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nhead cannot be resolved"
      + "\nhead cannot be resolved");
  }
  
  @Test
  public void set_() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nThe method or field statements is undefined for the type EObject"
      + "\nhead cannot be resolved"
      + "\nhead cannot be resolved");
  }
}
