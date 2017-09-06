package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.goatComponents.Attribute;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeAttribute {
  private final Attribute attr;
  
  private final String componentMap;
  
  private final String localMap;
  
  public CodeAttribute(final Attribute a, final String componentMap, final String localMap) {
    this.attr = a;
    this.componentMap = componentMap;
    this.localMap = localMap;
  }
  
  public CharSequence assign(final CharSequence value) {
    CharSequence _xifexpression = null;
    boolean _isComp = this.attr.isComp();
    if (_isComp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.componentMap);
      _builder.append(".Set(\"");
      String _ident = this.attr.getIdent();
      _builder.append(_ident);
      _builder.append("\", ");
      _builder.append(value);
      _builder.append(")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(this.localMap);
      _builder_1.append("[\"");
      String _ident_1 = this.attr.getIdent();
      _builder_1.append(_ident_1);
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
    boolean _isComp = this.attr.isComp();
    if (_isComp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.componentMap);
      _builder.append(".GetValue(\"");
      String _ident = this.attr.getIdent();
      _builder.append(_ident);
      _builder.append("\")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(this.localMap);
      _builder_1.append("[\"");
      String _ident_1 = this.attr.getIdent();
      _builder_1.append(_ident_1);
      _builder_1.append("\"]");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence exists() {
    CharSequence _xifexpression = null;
    boolean _isComp = this.attr.isComp();
    if (_isComp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.componentMap);
      _builder.append(".Has(\"");
      String _ident = this.attr.getIdent();
      _builder.append(_ident);
      _builder.append("\")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("func()bool{_, has:= ");
      _builder_1.append(this.localMap);
      _builder_1.append("[\"");
      String _ident_1 = this.attr.getIdent();
      _builder_1.append(_ident_1);
      _builder_1.append("\"]; return has}()");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
}
