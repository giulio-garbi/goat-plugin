package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeInputProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcesses;
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class CodeInputProcesses extends CodeTree {
  private final Iterable<CodeInputProcess> inputs;
  
  private final String varForChoice;
  
  private final static String messageVar = "msg";
  
  private static int progressiveVarForChoice = 0;
  
  public CodeInputProcesses(final InputProcesses iprocs) {
    int _length = ((Object[])Conversions.unwrapArray(iprocs.getInputs(), Object.class)).length;
    final Function1<Integer, CodeInputProcess> _function = (Integer it) -> {
      com.sysma.goat.eclipse_plugin.goatComponents.Process _get = iprocs.getInputs().get((it).intValue());
      Preconditions _get_1 = iprocs.getPreconds().get((it).intValue());
      return new CodeInputProcess(((InputProcess) _get), _get_1);
    };
    this.inputs = IterableExtensions.<Integer, CodeInputProcess>map(new ExclusiveRange(0, _length, true), _function);
    int _plusPlus = CodeInputProcesses.progressiveVarForChoice++;
    String _plus = ("inputs_choice_" + Integer.valueOf(_plusPlus));
    this.varForChoice = _plus;
  }
  
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var ");
    _builder.append(this.varForChoice);
    _builder.append(" int");
    _builder.newLineIfNotEmpty();
    String _goatProcessReference = CodeModel.getGoatProcessReference();
    _builder.append(_goatProcessReference);
    _builder.append(".Receive(func(attrs *goat.Attributes) bool{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return true");
    _builder.newLine();
    _builder.append("}, func(attrs *goat.Attributes, ");
    _builder.append(CodeInputProcesses.messageVar);
    _builder.append(" string)bool{");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Pair<Integer, CodeInputProcess>> _indexed = IterableExtensions.<CodeInputProcess>indexed(this.inputs);
      for(final Pair<Integer, CodeInputProcess> input : _indexed) {
        _builder.append("\t");
        _builder.append("if(");
        CharSequence _branchCode = input.getValue().getBranchCode();
        _builder.append(_branchCode, "\t");
        _builder.append("(attrs, ");
        _builder.append(CodeInputProcesses.messageVar, "\t");
        _builder.append(")){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(this.varForChoice, "\t\t");
        _builder.append(" = ");
        Integer _key = input.getKey();
        _builder.append(_key, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return true");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return false");
    _builder.newLine();
    _builder.append("})");
    _builder.newLine();
    _builder.newLine();
    _builder.append("switch(");
    _builder.append(this.varForChoice);
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Pair<Integer, CodeInputProcess>> _indexed_1 = IterableExtensions.<CodeInputProcess>indexed(this.inputs);
      for(final Pair<Integer, CodeInputProcess> input_1 : _indexed_1) {
        _builder.append("\t");
        _builder.append("case ");
        Integer _key_1 = input_1.getKey();
        _builder.append(_key_1, "\t");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _thenCode = input_1.getValue().getThenCode();
        _builder.append(_thenCode, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("panic(\"Invalid branch!\")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getCodeForIf() {
    CharSequence _xblockexpression = null;
    {
      int _length = ((Object[])Conversions.unwrapArray(this.inputs, Object.class)).length;
      boolean _notEquals = (_length != 1);
      if (_notEquals) {
        throw new IllegalArgumentException("The if branches support only single inputs");
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("goat.ThenReceive(");
      CharSequence _branchCode = IterableExtensions.<CodeInputProcess>head(this.inputs).getBranchCode();
      _builder.append(_branchCode);
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence getCodeForFirstThen() {
    return IterableExtensions.<CodeInputProcess>head(this.inputs).getThenCode();
  }
}
