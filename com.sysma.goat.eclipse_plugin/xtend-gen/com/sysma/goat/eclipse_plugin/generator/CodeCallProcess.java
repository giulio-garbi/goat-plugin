package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeAttribute;
import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.generator.CodeProcessDefinition;
import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.generator.CodeValue;
import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.Value;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class CodeCallProcess extends CodeTree {
  private final CallProcess call;
  
  public CodeCallProcess(final CallProcess p) {
    this.call = p;
  }
  
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = this.call.getParams().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _paramPassingMap = CodeModel.getParamPassingMap();
        _builder.append(_paramPassingMap);
        _builder.append(" = map[string]string{}");
        _builder.newLineIfNotEmpty();
        {
          int _length = ((Object[])Conversions.unwrapArray(this.call.getParams(), Object.class)).length;
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
          for(final Integer idx : _doubleDotLessThan) {
            String _paramPassingMap_1 = CodeModel.getParamPassingMap();
            _builder.append(_paramPassingMap_1);
            _builder.append("[\"");
            String _get = this.call.getProcname().getParams().get((idx).intValue());
            _builder.append(_get);
            _builder.append("\"] = ");
            Value _get_1 = this.call.getParams().get((idx).intValue());
            String _localVariablesMap = CodeModel.getLocalVariablesMap();
            CharSequence _code = new CodeValue(_get_1, "@ERR@", _localVariablesMap).getCode();
            _builder.append(_code);
            _builder.newLineIfNotEmpty();
          }
        }
        {
          int _length_1 = ((Object[])Conversions.unwrapArray(this.call.getParams(), Object.class)).length;
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _length_1, true);
          for(final Integer idx_1 : _doubleDotLessThan_1) {
            String _get_2 = this.call.getProcname().getParams().get((idx_1).intValue());
            StringConcatenation _builder_1 = new StringConcatenation();
            String _paramPassingMap_2 = CodeModel.getParamPassingMap();
            _builder_1.append(_paramPassingMap_2);
            _builder_1.append("[\"");
            String _get_3 = this.call.getProcname().getParams().get((idx_1).intValue());
            _builder_1.append(_get_3);
            _builder_1.append("\"]");
            CharSequence _assignProcessParameter = CodeAttribute.assignProcessParameter(_get_2, _builder_1);
            _builder.append(_assignProcessParameter);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("goto ");
    ProcessDefinition _procname = this.call.getProcname();
    _builder.append(new CodeProcessDefinition(_procname).process_goto_label);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
