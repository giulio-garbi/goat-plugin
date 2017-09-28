package com.sysma.goat.eclipse_plugin.tests.parser;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.goatComponents.AttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.Awareness;
import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.Comparison;
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentAttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;
import com.sysma.goat.eclipse_plugin.goatComponents.IfBranchProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.IfProcesses;
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcesses;
import com.sysma.goat.eclipse_plugin.goatComponents.InterleavingProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.LocalAttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.Model;
import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions;
import com.sysma.goat.eclipse_plugin.goatComponents.Update;
import com.sysma.goat.eclipse_plugin.goatComponents.ZeroProcess;
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GoatComponentsInjectorProvider.class)
@SuppressWarnings("all")
public class ProcessParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  private com.sysma.goat.eclipse_plugin.goatComponents.Process encapsulateProcess(final CharSequence proc) {
    try {
      com.sysma.goat.eclipse_plugin.goatComponents.Process _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("proc P = ");
        _builder.append(proc);
        _builder.newLineIfNotEmpty();
        final Model result = this.parseHelper.parse(_builder);
        Assert.assertNotNull(result);
        _xblockexpression = result.getProcesses().get(0).getProc();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void zeroProcess() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("nil");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof ZeroProcess));
  }
  
  @Test
  public void brackets() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(((nil)))");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof ZeroProcess));
  }
  
  @Test
  public void call() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("P");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof InterleavingProcess));
    final InterleavingProcess p = ((InterleavingProcess) result);
    int _length = ((Object[])Conversions.unwrapArray(p.getSubProcs(), Object.class)).length;
    boolean _equals = (_length == 1);
    Assert.assertTrue(_equals);
    com.sysma.goat.eclipse_plugin.goatComponents.Process _get = p.getSubProcs().get(0);
    Assert.assertTrue((_get instanceof CallProcess));
    com.sysma.goat.eclipse_plugin.goatComponents.Process _get_1 = p.getSubProcs().get(0);
    final CallProcess cp = ((CallProcess) _get_1);
    String _name = cp.getProcname().getName();
    boolean _equals_1 = Objects.equal(_name, "P");
    Assert.assertTrue(_equals_1);
  }
  
  @Test
  public void interleaving() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("P|P|P|P");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof InterleavingProcess));
    final InterleavingProcess p = ((InterleavingProcess) result);
    int _length = ((Object[])Conversions.unwrapArray(p.getSubProcs(), Object.class)).length;
    boolean _equals = (_length == 4);
    Assert.assertTrue(_equals);
    final Function1<com.sysma.goat.eclipse_plugin.goatComponents.Process, Boolean> _function = (com.sysma.goat.eclipse_plugin.goatComponents.Process it) -> {
      return Boolean.valueOf((it instanceof CallProcess));
    };
    Assert.assertTrue(IterableExtensions.<com.sysma.goat.eclipse_plugin.goatComponents.Process>forall(p.getSubProcs(), _function));
  }
  
  @Test
  public void inputProcessSimple() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("receive (true) {proc.x,this.y,proc.z}");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertFalse(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof InputProcesses));
    final InputProcesses iprocs = ((InputProcesses) result);
    int _length = ((Object[])Conversions.unwrapArray(iprocs.getPreconds(), Object.class)).length;
    boolean _equals = (_length == 1);
    Assert.assertTrue(_equals);
    int _length_1 = ((Object[])Conversions.unwrapArray(iprocs.getPreconds().get(0).getPrecond(), Object.class)).length;
    boolean _equals_1 = (_length_1 == 0);
    Assert.assertTrue(_equals_1);
    int _length_2 = ((Object[])Conversions.unwrapArray(iprocs.getInputs(), Object.class)).length;
    boolean _equals_2 = (_length_2 == 1);
    Assert.assertTrue(_equals_2);
    com.sysma.goat.eclipse_plugin.goatComponents.Process _get = iprocs.getInputs().get(0);
    Assert.assertTrue((_get instanceof InputProcess));
    com.sysma.goat.eclipse_plugin.goatComponents.Process _get_1 = iprocs.getInputs().get(0);
    final InputProcess p = ((InputProcess) _get_1);
    int _length_3 = ((Object[])Conversions.unwrapArray(p.getPreconds(), Object.class)).length;
    boolean _equals_3 = (_length_3 == 0);
    Assert.assertTrue(_equals_3);
    Expression _rec_pred = p.getRec_pred();
    Assert.assertTrue((_rec_pred instanceof Expression));
    int _length_4 = ((Object[])Conversions.unwrapArray(p.getMsgInParts(), Object.class)).length;
    boolean _equals_4 = (_length_4 == 3);
    Assert.assertTrue(_equals_4);
    AttributeToSet _get_2 = p.getMsgInParts().get(1);
    Assert.assertTrue((_get_2 instanceof ComponentAttributeToSet));
    AttributeToSet _get_3 = p.getMsgInParts().get(0);
    Assert.assertTrue((_get_3 instanceof LocalAttributeToSet));
    AttributeToSet _get_4 = p.getMsgInParts().get(2);
    Assert.assertTrue((_get_4 instanceof LocalAttributeToSet));
  }
  
  @Test
  public void threeInputProcessesSimple() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("receive (true) {proc.x,this.y,proc.z} + receive (true) {proc.x,this.y,proc.z} + receive (true) {proc.x,this.y,proc.z}");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertFalse(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof InputProcesses));
    final InputProcesses iprocs = ((InputProcesses) result);
    int _length = ((Object[])Conversions.unwrapArray(iprocs.getPreconds(), Object.class)).length;
    boolean _equals = (_length == 3);
    Assert.assertTrue(_equals);
    int _length_1 = ((Object[])Conversions.unwrapArray(iprocs.getInputs(), Object.class)).length;
    boolean _equals_1 = (_length_1 == 3);
    Assert.assertTrue(_equals_1);
    final Consumer<Integer> _function = (Integer i) -> {
      int _length_2 = ((Object[])Conversions.unwrapArray(iprocs.getPreconds().get((i).intValue()).getPrecond(), Object.class)).length;
      boolean _equals_2 = (_length_2 == 0);
      Assert.assertTrue(_equals_2);
      com.sysma.goat.eclipse_plugin.goatComponents.Process _get = iprocs.getInputs().get((i).intValue());
      Assert.assertTrue((_get instanceof InputProcess));
      com.sysma.goat.eclipse_plugin.goatComponents.Process _get_1 = iprocs.getInputs().get((i).intValue());
      final InputProcess p = ((InputProcess) _get_1);
      int _length_3 = ((Object[])Conversions.unwrapArray(p.getPreconds(), Object.class)).length;
      boolean _equals_3 = (_length_3 == 0);
      Assert.assertTrue(_equals_3);
      Expression _rec_pred = p.getRec_pred();
      Assert.assertTrue((_rec_pred instanceof Expression));
      int _length_4 = ((Object[])Conversions.unwrapArray(p.getMsgInParts(), Object.class)).length;
      boolean _equals_4 = (_length_4 == 3);
      Assert.assertTrue(_equals_4);
      AttributeToSet _get_2 = p.getMsgInParts().get(1);
      Assert.assertTrue((_get_2 instanceof ComponentAttributeToSet));
      AttributeToSet _get_3 = p.getMsgInParts().get(0);
      Assert.assertTrue((_get_3 instanceof LocalAttributeToSet));
      AttributeToSet _get_4 = p.getMsgInParts().get(2);
      Assert.assertTrue((_get_4 instanceof LocalAttributeToSet));
    };
    new IntegerRange(0, 2).forEach(_function);
  }
  
  @Test
  public void inputProcessesPrecond() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wait until(true) receive (true) {proc.x,this.y,proc.z}.nil + [proc.x := 2]wait until(true) receive (true) {proc.x,this.y,proc.z}.nil");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof InputProcesses));
    final InputProcesses iprocs = ((InputProcesses) result);
    int _length = ((Object[])Conversions.unwrapArray(iprocs.getPreconds(), Object.class)).length;
    boolean _equals = (_length == 2);
    Assert.assertTrue(_equals);
    int _length_1 = ((Object[])Conversions.unwrapArray(iprocs.getInputs(), Object.class)).length;
    boolean _equals_1 = (_length_1 == 2);
    Assert.assertTrue(_equals_1);
    final Consumer<Integer> _function = (Integer i) -> {
      int _length_2 = ((Object[])Conversions.unwrapArray(iprocs.getPreconds().get((i).intValue()).getPrecond(), Object.class)).length;
      boolean _equals_2 = (_length_2 == ((i).intValue() + 1));
      Assert.assertTrue(_equals_2);
      com.sysma.goat.eclipse_plugin.goatComponents.Process _get = iprocs.getInputs().get((i).intValue());
      Assert.assertTrue((_get instanceof InputProcess));
      com.sysma.goat.eclipse_plugin.goatComponents.Process _get_1 = iprocs.getInputs().get((i).intValue());
      final InputProcess p = ((InputProcess) _get_1);
      int _length_3 = ((Object[])Conversions.unwrapArray(p.getPreconds(), Object.class)).length;
      boolean _equals_3 = (_length_3 == 0);
      Assert.assertTrue(_equals_3);
      Expression _rec_pred = p.getRec_pred();
      Assert.assertTrue((_rec_pred instanceof Expression));
      int _length_4 = ((Object[])Conversions.unwrapArray(p.getMsgInParts(), Object.class)).length;
      boolean _equals_4 = (_length_4 == 3);
      Assert.assertTrue(_equals_4);
      AttributeToSet _get_2 = p.getMsgInParts().get(1);
      Assert.assertTrue((_get_2 instanceof ComponentAttributeToSet));
      AttributeToSet _get_3 = p.getMsgInParts().get(0);
      Assert.assertTrue((_get_3 instanceof LocalAttributeToSet));
      AttributeToSet _get_4 = p.getMsgInParts().get(2);
      Assert.assertTrue((_get_4 instanceof LocalAttributeToSet));
      com.sysma.goat.eclipse_plugin.goatComponents.Process _next = p.getNext();
      Assert.assertTrue((_next instanceof ZeroProcess));
    };
    new IntegerRange(0, 1).forEach(_function);
    EObject _get = iprocs.getPreconds().get(0).getPrecond().get(0);
    Assert.assertTrue((_get instanceof Awareness));
    EObject _get_1 = iprocs.getPreconds().get(1).getPrecond().get(1);
    Assert.assertTrue((_get_1 instanceof Awareness));
    EObject _get_2 = iprocs.getPreconds().get(1).getPrecond().get(0);
    Assert.assertTrue((_get_2 instanceof Update));
    Assert.assertNull(iprocs.getNext());
  }
  
  @Test
  public void outputProcess() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wait until(true) send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof OutputProcess));
    final OutputProcess p = ((OutputProcess) result);
    int _length = ((Object[])Conversions.unwrapArray(p.getPrecond().getPrecond(), Object.class)).length;
    boolean _equals = (_length == 1);
    Assert.assertTrue(_equals);
    Expression _send_pred = p.getSend_pred();
    Assert.assertTrue((_send_pred instanceof Expression));
    int _length_1 = ((Object[])Conversions.unwrapArray(p.getMsgOutParts(), Object.class)).length;
    boolean _equals_1 = (_length_1 == 3);
    Assert.assertTrue(_equals_1);
    final Function1<Expression, Boolean> _function = (Expression it) -> {
      return Boolean.valueOf((it instanceof Expression));
    };
    Assert.assertTrue(IterableExtensions.<Expression>forall(p.getMsgOutParts(), _function));
    com.sysma.goat.eclipse_plugin.goatComponents.Process _next = p.getNext();
    Assert.assertTrue((_next instanceof ZeroProcess));
    int _msec = p.getMsec();
    boolean _equals_2 = (_msec == 0);
    Assert.assertTrue(_equals_2);
    Assert.assertNull(p.getOutput());
  }
  
  @Test
  public void outputProcessSleepPrint() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("send {proc.x,this.y,proc.z} @ (receiver.ciao == 1) print(\"Ciao ciao\") sleep(10).nil");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof OutputProcess));
    final OutputProcess p = ((OutputProcess) result);
    int _msec = p.getMsec();
    boolean _equals = (_msec == 10);
    Assert.assertTrue(_equals);
    String _output = p.getOutput();
    boolean _equals_1 = Objects.equal(_output, "Ciao ciao");
    Assert.assertTrue(_equals_1);
  }
  
  @Test
  public void mixedChoiceForbidden() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil + send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertFalse(result.eResource().getErrors().isEmpty());
  }
  
  @Test
  public void inputProcessEmpty() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("receive (true) {}.nil");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof InputProcesses));
    final InputProcesses iprocs = ((InputProcesses) result);
    int _length = ((Object[])Conversions.unwrapArray(iprocs.getPreconds(), Object.class)).length;
    boolean _equals = (_length == 1);
    Assert.assertTrue(_equals);
    int _length_1 = ((Object[])Conversions.unwrapArray(iprocs.getPreconds().get(0).getPrecond(), Object.class)).length;
    boolean _equals_1 = (_length_1 == 0);
    Assert.assertTrue(_equals_1);
    int _length_2 = ((Object[])Conversions.unwrapArray(iprocs.getInputs(), Object.class)).length;
    boolean _equals_2 = (_length_2 == 1);
    Assert.assertTrue(_equals_2);
    com.sysma.goat.eclipse_plugin.goatComponents.Process _get = iprocs.getInputs().get(0);
    Assert.assertTrue((_get instanceof InputProcess));
    com.sysma.goat.eclipse_plugin.goatComponents.Process _get_1 = iprocs.getInputs().get(0);
    final InputProcess p = ((InputProcess) _get_1);
    int _length_3 = ((Object[])Conversions.unwrapArray(p.getPreconds(), Object.class)).length;
    boolean _equals_3 = (_length_3 == 0);
    Assert.assertTrue(_equals_3);
    Expression _rec_pred = p.getRec_pred();
    Assert.assertTrue((_rec_pred instanceof Expression));
    int _length_4 = ((Object[])Conversions.unwrapArray(p.getMsgInParts(), Object.class)).length;
    boolean _equals_4 = (_length_4 == 0);
    Assert.assertTrue(_equals_4);
  }
  
  @Test
  public void outputProcessEmpty() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("send {} @ (true).nil");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof OutputProcess));
    final OutputProcess p = ((OutputProcess) result);
    int _length = ((Object[])Conversions.unwrapArray(p.getPrecond().getPrecond(), Object.class)).length;
    boolean _equals = (_length == 0);
    Assert.assertTrue(_equals);
    Expression _send_pred = p.getSend_pred();
    Assert.assertTrue((_send_pred instanceof Expression));
    int _length_1 = ((Object[])Conversions.unwrapArray(p.getMsgOutParts(), Object.class)).length;
    boolean _equals_1 = (_length_1 == 0);
    Assert.assertTrue(_equals_1);
    com.sysma.goat.eclipse_plugin.goatComponents.Process _next = p.getNext();
    Assert.assertTrue((_next instanceof ZeroProcess));
    int _msec = p.getMsec();
    boolean _equals_2 = (_msec == 0);
    Assert.assertTrue(_equals_2);
    Assert.assertNull(p.getOutput());
  }
  
  @Test
  public void sequence() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("send {} @ (true).receive (proc.x > 3) {proc.a}.([proc.s := 8] send {} @ (false).nil)");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
  }
  
  @Test
  public void if_() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil }");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof IfProcesses));
    final IfProcesses ifp = ((IfProcesses) result);
    int _length = ((Object[])Conversions.unwrapArray(ifp.getBranches(), Object.class)).length;
    boolean _equals = (_length == 1);
    Assert.assertTrue(_equals);
    com.sysma.goat.eclipse_plugin.goatComponents.Process _get = ifp.getBranches().get(0);
    final IfBranchProcess branch = ((IfBranchProcess) _get);
    int _length_1 = ((Object[])Conversions.unwrapArray(branch.getCond().getPrecond(), Object.class)).length;
    boolean _equals_1 = (_length_1 == 1);
    Assert.assertTrue(_equals_1);
    com.sysma.goat.eclipse_plugin.goatComponents.Process _then = branch.getThen();
    final OutputProcess p = ((OutputProcess) _then);
    int _length_2 = ((Object[])Conversions.unwrapArray(p.getPrecond().getPrecond(), Object.class)).length;
    boolean _equals_2 = (_length_2 == 0);
    Assert.assertTrue(_equals_2);
    Expression _send_pred = p.getSend_pred();
    Assert.assertTrue((_send_pred instanceof Expression));
    int _length_3 = ((Object[])Conversions.unwrapArray(p.getMsgOutParts(), Object.class)).length;
    boolean _equals_3 = (_length_3 == 3);
    Assert.assertTrue(_equals_3);
    final Function1<Expression, Boolean> _function = (Expression it) -> {
      return Boolean.valueOf((it instanceof Expression));
    };
    Assert.assertTrue(IterableExtensions.<Expression>forall(p.getMsgOutParts(), _function));
    com.sysma.goat.eclipse_plugin.goatComponents.Process _next = p.getNext();
    Assert.assertTrue((_next instanceof ZeroProcess));
    int _msec = p.getMsec();
    boolean _equals_4 = (_msec == 0);
    Assert.assertTrue(_equals_4);
    Assert.assertNull(p.getOutput());
  }
  
  @Test
  public void if_ElseIf() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } else if wait until(true) { send {proc.x,this.y,proc.z} @ (receiver.ciao == 1).nil } ");
    final com.sysma.goat.eclipse_plugin.goatComponents.Process result = this.encapsulateProcess(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof IfProcesses));
    final IfProcesses ifp = ((IfProcesses) result);
    int _length = ((Object[])Conversions.unwrapArray(ifp.getBranches(), Object.class)).length;
    boolean _equals = (_length == 2);
    Assert.assertTrue(_equals);
    final Consumer<com.sysma.goat.eclipse_plugin.goatComponents.Process> _function = (com.sysma.goat.eclipse_plugin.goatComponents.Process br) -> {
      final IfBranchProcess branch = ((IfBranchProcess) br);
      int _length_1 = ((Object[])Conversions.unwrapArray(branch.getCond().getPrecond(), Object.class)).length;
      boolean _equals_1 = (_length_1 == 1);
      Assert.assertTrue(_equals_1);
      com.sysma.goat.eclipse_plugin.goatComponents.Process _then = branch.getThen();
      final OutputProcess p = ((OutputProcess) _then);
      int _length_2 = ((Object[])Conversions.unwrapArray(p.getPrecond().getPrecond(), Object.class)).length;
      boolean _equals_2 = (_length_2 == 0);
      Assert.assertTrue(_equals_2);
      Expression _send_pred = p.getSend_pred();
      Assert.assertTrue((_send_pred instanceof Expression));
      int _length_3 = ((Object[])Conversions.unwrapArray(p.getMsgOutParts(), Object.class)).length;
      boolean _equals_3 = (_length_3 == 3);
      Assert.assertTrue(_equals_3);
      final Function1<Expression, Boolean> _function_1 = (Expression it) -> {
        return Boolean.valueOf((it instanceof Expression));
      };
      Assert.assertTrue(IterableExtensions.<Expression>forall(p.getMsgOutParts(), _function_1));
      com.sysma.goat.eclipse_plugin.goatComponents.Process _next = p.getNext();
      Assert.assertTrue((_next instanceof ZeroProcess));
      int _msec = p.getMsec();
      boolean _equals_4 = (_msec == 0);
      Assert.assertTrue(_equals_4);
      Assert.assertNull(p.getOutput());
    };
    ifp.getBranches().forEach(_function);
  }
  
  private Preconditions encapsulatePrecondition(final CharSequence pre) {
    try {
      Preconditions _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("proc P = ");
        _builder.append(pre);
        _builder.append(" send {} @ (true).nil");
        _builder.newLineIfNotEmpty();
        final Model result = this.parseHelper.parse(_builder);
        Assert.assertNotNull(result);
        com.sysma.goat.eclipse_plugin.goatComponents.Process _proc = result.getProcesses().get(0).getProc();
        _xblockexpression = ((OutputProcess) _proc).getPrecond();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void awareness() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wait until(proc.x > 0)");
    final Preconditions result = this.encapsulatePrecondition(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    int _length = ((Object[])Conversions.unwrapArray(result.getPrecond(), Object.class)).length;
    boolean _equals = (_length == 1);
    Assert.assertTrue(_equals);
    EObject _get = result.getPrecond().get(0);
    Assert.assertTrue((_get instanceof Awareness));
    EObject _get_1 = result.getPrecond().get(0);
    Expression _pred = ((Awareness) _get_1).getPred();
    Assert.assertTrue((_pred instanceof Comparison));
  }
  
  @Test
  public void update() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[proc.x := 4]");
    final Preconditions result = this.encapsulatePrecondition(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    int _length = ((Object[])Conversions.unwrapArray(result.getPrecond(), Object.class)).length;
    boolean _equals = (_length == 1);
    Assert.assertTrue(_equals);
    EObject _get = result.getPrecond().get(0);
    Assert.assertTrue((_get instanceof Update));
  }
  
  @Test
  public void mixPreconds() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[proc.x := 4] wait until(proc.f > this.g && proc.h <= 8) [proc.h := 9, proc.z:= this.q]");
    final Preconditions result = this.encapsulatePrecondition(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    int _length = ((Object[])Conversions.unwrapArray(result.getPrecond(), Object.class)).length;
    boolean _equals = (_length == 3);
    Assert.assertTrue(_equals);
    EObject _get = result.getPrecond().get(0);
    Assert.assertTrue((_get instanceof Update));
    EObject _get_1 = result.getPrecond().get(1);
    Assert.assertTrue((_get_1 instanceof Awareness));
    EObject _get_2 = result.getPrecond().get(2);
    Assert.assertTrue((_get_2 instanceof Update));
    EObject _get_3 = result.getPrecond().get(0);
    int _length_1 = ((Object[])Conversions.unwrapArray(((Update) _get_3).getVars(), Object.class)).length;
    boolean _equals_1 = (_length_1 == 1);
    Assert.assertTrue(_equals_1);
    EObject _get_4 = result.getPrecond().get(2);
    int _length_2 = ((Object[])Conversions.unwrapArray(((Update) _get_4).getVars(), Object.class)).length;
    boolean _equals_2 = (_length_2 == 2);
    Assert.assertTrue(_equals_2);
  }
}
