package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeAttribute;
import com.sysma.goat.eclipse_plugin.generator.CodeInputOutputProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.generator.CodePreconditionProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeReceivePred;
import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.generator.LocalBackupAttributes;
import com.sysma.goat.eclipse_plugin.generator.StdoutStringHelper;
import com.sysma.goat.eclipse_plugin.goatComponents.AttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.LocalAttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CodeInputProcess implements CodeInputOutputProcess {
  private InputProcess actualInput;
  
  private final CodePreconditionProcess precond;
  
  public CodeInputProcess(final InputProcess p, final Preconditions precond) {
    this.actualInput = p;
    CodePreconditionProcess _codePreconditionProcess = new CodePreconditionProcess(precond);
    this.precond = _codePreconditionProcess;
  }
  
  private static String getMessageVar() {
    return "msg";
  }
  
  private static String getLocalBackupMap() {
    return "locVarBak";
  }
  
  private CharSequence getSetupMessageParts(final String componentAttributesMap) {
    CharSequence _xblockexpression = null;
    {
      final int nbrParts = ((Object[])Conversions.unwrapArray(this.actualInput.getMsgInParts(), Object.class)).length;
      final Function1<AttributeToSet, CodeAttribute> _function = (AttributeToSet it) -> {
        String _localVariablesMap = CodeModel.getLocalVariablesMap();
        return new CodeAttribute(it, componentAttributesMap, _localVariablesMap);
      };
      final List<CodeAttribute> attributes = ListExtensions.<AttributeToSet, CodeAttribute>map(this.actualInput.getMsgInParts(), _function);
      final Function1<AttributeToSet, Boolean> _function_1 = (AttributeToSet it) -> {
        return Boolean.valueOf((it instanceof LocalAttributeToSet));
      };
      final Function1<AttributeToSet, LocalBackupAttributes> _function_2 = (AttributeToSet it) -> {
        String _localBackupMap = CodeInputProcess.getLocalBackupMap();
        return new LocalBackupAttributes(((LocalAttributeToSet) it), _localBackupMap);
      };
      final Iterable<LocalBackupAttributes> attributesToBackup = IterableExtensions.<AttributeToSet, LocalBackupAttributes>map(IterableExtensions.<AttributeToSet>filter(this.actualInput.getMsgInParts(), _function_1), _function_2);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if (!");
      String _messageVar = CodeInputProcess.getMessageVar();
      _builder.append(_messageVar);
      _builder.append(".IsLong(");
      _builder.append(nbrParts);
      _builder.append(")){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("attrsWrap.Rollback()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return false");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      {
        for(final LocalBackupAttributes locAttr : attributesToBackup) {
          _builder.append("if ");
          CharSequence _exists = locAttr.original.exists();
          _builder.append(_exists);
          _builder.append("{");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          CharSequence _assign = locAttr.backup.assign(locAttr.original.read());
          _builder.append(_assign, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.newLine();
      {
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, nbrParts, true);
        for(final Integer i : _doubleDotLessThan) {
          CodeAttribute _get = attributes.get((i).intValue());
          StringConcatenation _builder_1 = new StringConcatenation();
          String _messageVar_1 = CodeInputProcess.getMessageVar();
          _builder_1.append(_messageVar_1);
          _builder_1.append(".Get(");
          _builder_1.append(i);
          _builder_1.append(")");
          CharSequence _assign_1 = _get.assign(_builder_1);
          _builder.append(_assign_1);
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private static CharSequence getRollbackLocalVars() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for lv, val := range ");
    String _localBackupMap = CodeInputProcess.getLocalBackupMap();
    _builder.append(_localBackupMap);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _localVariablesMap = CodeModel.getLocalVariablesMap();
    _builder.append(_localVariablesMap, "\t");
    _builder.append("[lv] = val");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence getBranchCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("func(attrs *goat.Attributes, ");
    String _messageVar = CodeInputProcess.getMessageVar();
    _builder.append(_messageVar);
    _builder.append(" goat.Tuple)bool{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _localBackupMap = CodeInputProcess.getLocalBackupMap();
    _builder.append(_localBackupMap, "\t");
    _builder.append(" := map[string]interface{}{}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("_ = ");
    String _localBackupMap_1 = CodeInputProcess.getLocalBackupMap();
    _builder.append(_localBackupMap_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("attrsWrap := goat.AttributesWrapper{}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attrsWrap.Init(attrs)");
    _builder.newLine();
    {
      if ((this.precond != null)) {
        _builder.append("\t");
        _builder.append("if (!");
        CharSequence _preconditionCode = this.precond.getPreconditionCode(CodeInputProcess.getLocalBackupMap(), "attrsWrap");
        _builder.append(_preconditionCode, "\t");
        _builder.append("()){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("attrsWrap.Rollback()");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return false");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    CharSequence _setupMessageParts = this.getSetupMessageParts("attrsWrap");
    _builder.append(_setupMessageParts, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if (");
    Expression _rec_pred = this.actualInput.getRec_pred();
    String _localVariablesMap = CodeModel.getLocalVariablesMap();
    CharSequence _code = new CodeReceivePred(_rec_pred, "attrsWrap", _localVariablesMap).getCode();
    _builder.append(_code, "\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      String _output = this.actualInput.getOutput();
      boolean _tripleNotEquals = (_output != null);
      if (_tripleNotEquals) {
        _builder.append("\t\t");
        _builder.append("fmt.Println(");
        String _convertString = StdoutStringHelper.convertString(this.actualInput.getOutput(), "attrsWrap", CodeModel.getLocalVariablesMap());
        _builder.append(_convertString, "\t\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("attrsWrap.Commit()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _rollbackLocalVars = CodeInputProcess.getRollbackLocalVars();
    _builder.append(_rollbackLocalVars, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("attrsWrap.Rollback()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
  
  @Override
  public CharSequence getThenCode() {
    return CodeTree.convert(this.actualInput.getNext()).getCode();
  }
}
