package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.goatComponents.AttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentAttributeToSet;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeAttribute {
  private final AttributeToSet attr;
  
  private final String componentMap;
  
  private final String localMap;
  
  public CodeAttribute(final AttributeToSet a, final String componentMap, final String localMap) {
    this.attr = a;
    this.componentMap = componentMap;
    this.localMap = localMap;
  }
  
  public boolean isComp() {
    return (this.attr instanceof ComponentAttributeToSet);
  }
  
  public CharSequence assign(final CharSequence value) {
    CharSequence _xifexpression = null;
    boolean _isComp = this.isComp();
    if (_isComp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.componentMap);
      _builder.append(".Set(\"");
      String _attribute = this.attr.getAttribute();
      _builder.append(_attribute);
      _builder.append("\", ");
      _builder.append(value);
      _builder.append(")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(this.localMap);
      _builder_1.append("[\"");
      String _attribute_1 = this.attr.getAttribute();
      _builder_1.append(_attribute_1);
      _builder_1.append("\"] = ");
      _builder_1.append(value);
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence assignProcessParameter(final CharSequence param, final CharSequence value) {
    StringConcatenation _builder = new StringConcatenation();
    String _localVariablesMap = CodeModel.getLocalVariablesMap();
    _builder.append(_localVariablesMap);
    _builder.append("[\"");
    _builder.append(param);
    _builder.append("\"] = ");
    _builder.append(value);
    return _builder;
  }
  
  public CharSequence read() {
    CharSequence _xifexpression = null;
    boolean _isComp = this.isComp();
    if (_isComp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.componentMap);
      _builder.append(".GetValue(\"");
      String _attribute = this.attr.getAttribute();
      _builder.append(_attribute);
      _builder.append("\")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(this.localMap);
      _builder_1.append("[\"");
      String _attribute_1 = this.attr.getAttribute();
      _builder_1.append(_attribute_1);
      _builder_1.append("\"]");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence exists() {
    CharSequence _xifexpression = null;
    boolean _isComp = this.isComp();
    if (_isComp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.componentMap);
      _builder.append(".Has(\"");
      String _attribute = this.attr.getAttribute();
      _builder.append(_attribute);
      _builder.append("\")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("func()bool{_, has:= ");
      _builder_1.append(this.localMap);
      _builder_1.append("[\"");
      String _attribute_1 = this.attr.getAttribute();
      _builder_1.append(_attribute_1);
      _builder_1.append("\"]; return has}()");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
}
