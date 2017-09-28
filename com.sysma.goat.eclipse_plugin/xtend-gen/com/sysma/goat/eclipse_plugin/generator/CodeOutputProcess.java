package com.sysma.goat.eclipse_plugin.generator;

import com.google.common.base.Objects;
import com.sysma.goat.eclipse_plugin.generator.CodeInputOutputProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.generator.CodePreconditionProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeSendPred;
import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.generator.CodeValue;
import com.sysma.goat.eclipse_plugin.generator.StdoutStringHelper;
import com.sysma.goat.eclipse_plugin.goatComponents.BoolConstant;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;
import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CodeOutputProcess extends CodeTree implements CodeInputOutputProcess {
  private final OutputProcess proc;
  
  private final boolean isRealOutput;
  
  private final CodePreconditionProcess precond;
  
  public CodeOutputProcess(final OutputProcess p) {
    final Expression sPred = p.getSend_pred();
    this.proc = p;
    Preconditions _precond = p.getPrecond();
    CodePreconditionProcess _codePreconditionProcess = new CodePreconditionProcess(((Preconditions) _precond));
    this.precond = _codePreconditionProcess;
    this.isRealOutput = ((!(sPred instanceof BoolConstant)) || (!Objects.equal(((BoolConstant) sPred).getValue(), "false")));
  }
  
  private static String getMessageVar() {
    return "msg";
  }
  
  private static String getLocalBackupMap() {
    return "locVarBak";
  }
  
  private CharSequence getSetupMessageParts(final String componentAttributesMap) {
    StringConcatenation _builder = new StringConcatenation();
    String _messageVar = CodeOutputProcess.getMessageVar();
    _builder.append(_messageVar);
    _builder.append(" := goat.NewTuple(");
    final Function1<Expression, CharSequence> _function = (Expression part) -> {
      String _localVariablesMap = CodeModel.getLocalVariablesMap();
      return new CodeValue(part, componentAttributesMap, _localVariablesMap).getCode();
    };
    String _join = IterableExtensions.join(ListExtensions.<Expression, CharSequence>map(this.proc.getMsgOutParts(), _function), ",");
    _builder.append(_join);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getCode() {
    CharSequence _xifexpression = null;
    if (this.isRealOutput) {
      StringConcatenation _builder = new StringConcatenation();
      String _goatProcessReference = CodeModel.getGoatProcessReference();
      _builder.append(_goatProcessReference);
      _builder.append(".Send(func(attrs *goat.Attributes) (goat.Tuple, goat.Predicate, bool){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _localBackupMap = CodeOutputProcess.getLocalBackupMap();
      _builder.append(_localBackupMap, "\t");
      _builder.append(" := map[string]interface{}{}");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("_ = ");
      String _localBackupMap_1 = CodeOutputProcess.getLocalBackupMap();
      _builder.append(_localBackupMap_1, "\t");
      _builder.newLineIfNotEmpty();
      {
        if ((this.precond != null)) {
          _builder.append("\t");
          _builder.append("if (!");
          CharSequence _preconditionCode = this.precond.getPreconditionCode(CodeOutputProcess.getLocalBackupMap(), "attrs");
          _builder.append(_preconditionCode, "\t");
          _builder.append("()){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return goat.NewTuple(), goat.False{}, false");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      CharSequence _setupMessageParts = this.getSetupMessageParts("attrs");
      _builder.append(_setupMessageParts, "\t");
      _builder.newLineIfNotEmpty();
      {
        String _output = this.proc.getOutput();
        boolean _tripleNotEquals = (_output != null);
        if (_tripleNotEquals) {
          _builder.append("\t");
          _builder.append("fmt.Println(");
          String _convertString = StdoutStringHelper.convertString(this.proc.getOutput(), "attrs", CodeModel.getLocalVariablesMap());
          _builder.append(_convertString, "\t");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("return ");
      String _messageVar = CodeOutputProcess.getMessageVar();
      _builder.append(_messageVar, "\t");
      _builder.append(", ");
      Expression _send_pred = this.proc.getSend_pred();
      String _localVariablesMap = CodeModel.getLocalVariablesMap();
      CharSequence _code = new CodeSendPred(_send_pred, _localVariablesMap).getCode();
      _builder.append(_code, "\t");
      _builder.append(", true");
      _builder.newLineIfNotEmpty();
      _builder.append("})");
      _builder.newLine();
      CharSequence _thenCode = this.getThenCode();
      _builder.append(_thenCode);
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      {
        if ((this.precond != null)) {
          String _goatProcessReference_1 = CodeModel.getGoatProcessReference();
          _builder_1.append(_goatProcessReference_1);
          _builder_1.append(".WaitUntilTrue(func(attrs *goat.Attributes)bool{");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          String _localBackupMap_2 = CodeOutputProcess.getLocalBackupMap();
          _builder_1.append(_localBackupMap_2, "\t");
          _builder_1.append(" := map[string]interface{}{}");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("_ = ");
          String _localBackupMap_3 = CodeOutputProcess.getLocalBackupMap();
          _builder_1.append(_localBackupMap_3, "\t");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("ok :=  ");
          CharSequence _preconditionCode_1 = this.precond.getPreconditionCode(CodeOutputProcess.getLocalBackupMap(), "attrs");
          _builder_1.append(_preconditionCode_1, "\t");
          _builder_1.append("()");
          _builder_1.newLineIfNotEmpty();
          {
            String _output_1 = this.proc.getOutput();
            boolean _tripleNotEquals_1 = (_output_1 != null);
            if (_tripleNotEquals_1) {
              _builder_1.append("\t");
              _builder_1.append("if (ok){");
              _builder_1.newLine();
              _builder_1.append("\t");
              _builder_1.append("\t");
              _builder_1.append("fmt.Println(");
              String _convertString_1 = StdoutStringHelper.convertString(this.proc.getOutput(), "attrs", CodeModel.getLocalVariablesMap());
              _builder_1.append(_convertString_1, "\t\t");
              _builder_1.append(")");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("\t");
              _builder_1.append("}");
              _builder_1.newLine();
            }
          }
          _builder_1.append("\t");
          _builder_1.append("return ok");
          _builder_1.newLine();
          _builder_1.append("})");
          _builder_1.newLine();
          _builder_1.newLine();
        }
      }
      CharSequence _thenCode_1 = this.getThenCode();
      _builder_1.append(_thenCode_1);
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence getBranchCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("func(attrs *goat.Attributes) (goat.Tuple, goat.Predicate, bool){");
    _builder.newLine();
    _builder.append("\t");
    String _localBackupMap = CodeOutputProcess.getLocalBackupMap();
    _builder.append(_localBackupMap, "\t");
    _builder.append(" := map[string]interface{}{}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("_ = ");
    String _localBackupMap_1 = CodeOutputProcess.getLocalBackupMap();
    _builder.append(_localBackupMap_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("attrsWrap := goat.AttributeWrapper{}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attrsWrap.Init(attrs)");
    _builder.newLine();
    {
      if ((this.precond != null)) {
        _builder.append("\t");
        _builder.append("if (!");
        CharSequence _preconditionCode = this.precond.getPreconditionCode(CodeOutputProcess.getLocalBackupMap(), "attrsWrap");
        _builder.append(_preconditionCode, "\t");
        _builder.append("()){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("attrsWrap.Rollback()");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return goat.NewTuple(), goat.False{}, false");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      String _output = this.proc.getOutput();
      boolean _tripleNotEquals = (_output != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("fmt.Println(");
        String _convertString = StdoutStringHelper.convertString(this.proc.getOutput(), "attrsWrap", CodeModel.getLocalVariablesMap());
        _builder.append(_convertString, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if (this.isRealOutput) {
        _builder.append("\t");
        CharSequence _setupMessageParts = this.getSetupMessageParts("attrsWrap");
        _builder.append(_setupMessageParts, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("attrsWrap.Commit()");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return ");
        String _messageVar = CodeOutputProcess.getMessageVar();
        _builder.append(_messageVar, "\t");
        _builder.append(", ");
        Expression _send_pred = this.proc.getSend_pred();
        String _localVariablesMap = CodeModel.getLocalVariablesMap();
        CharSequence _code = new CodeSendPred(_send_pred, _localVariablesMap).getCode();
        _builder.append(_code, "\t");
        _builder.append(", true");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("attrsWrap.Commit()");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return goat.NewTuple(), goat.False{}, true");
        _builder.newLine();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence getCodeForIf() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("func(attrs *goat.Attributes) goat.SendReceive{");
    _builder.newLine();
    _builder.append("\t");
    String _localBackupMap = CodeOutputProcess.getLocalBackupMap();
    _builder.append(_localBackupMap, "\t");
    _builder.append(" := map[string]interface{}{}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("_ = ");
    String _localBackupMap_1 = CodeOutputProcess.getLocalBackupMap();
    _builder.append(_localBackupMap_1, "\t");
    _builder.newLineIfNotEmpty();
    {
      if ((this.precond != null)) {
        _builder.append("\t");
        _builder.append("if (!");
        CharSequence _preconditionCode = this.precond.getPreconditionCode(CodeOutputProcess.getLocalBackupMap(), "attrs");
        _builder.append(_preconditionCode, "\t");
        _builder.append("()){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return goat.ThenFail()");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      String _output = this.proc.getOutput();
      boolean _tripleNotEquals = (_output != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("fmt.Println(");
        String _convertString = StdoutStringHelper.convertString(this.proc.getOutput(), "attrs", CodeModel.getLocalVariablesMap());
        _builder.append(_convertString, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if (this.isRealOutput) {
        _builder.append("\t");
        CharSequence _setupMessageParts = this.getSetupMessageParts("attrs");
        _builder.append(_setupMessageParts, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return goat.ThenSend(");
        String _messageVar = CodeOutputProcess.getMessageVar();
        _builder.append(_messageVar, "\t");
        _builder.append(", ");
        Expression _send_pred = this.proc.getSend_pred();
        String _localVariablesMap = CodeModel.getLocalVariablesMap();
        CharSequence _code = new CodeSendPred(_send_pred, _localVariablesMap).getCode();
        _builder.append(_code, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("return goat.ThenSend(goat.NewTuple(), goat.False{})");
        _builder.newLine();
      }
    }
    _builder.append("}(attr)");
    return _builder;
  }
  
  @Override
  public CharSequence getThenCode() {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _msec = this.proc.getMsec();
      boolean _greaterThan = (_msec > 0);
      if (_greaterThan) {
        String _goatProcessReference = CodeModel.getGoatProcessReference();
        _builder.append(_goatProcessReference);
        _builder.append(".Sleep(");
        int _msec_1 = this.proc.getMsec();
        _builder.append(_msec_1);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence _code = CodeTree.convert(this.proc.getNext()).getCode();
    _builder.append(_code);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
