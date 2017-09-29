package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.goatComponents.AttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentAttributeToSet;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeAttribute {
  private final String attribute;
  
  private final boolean comp;
  
  private final String componentMap;
  
  private final String localMap;
  
  public CodeAttribute(final AttributeToSet a, final String componentMap, final String localMap) {
    this.attribute = a.getAttribute();
    this.comp = (a instanceof ComponentAttributeToSet);
    this.componentMap = componentMap;
    this.localMap = localMap;
  }
  
  public CodeAttribute(final String attrName, final boolean comp, final String componentMap, final String localMap) {
    this.attribute = attrName;
    this.comp = comp;
    this.componentMap = componentMap;
    this.localMap = localMap;
  }
  
  public CharSequence assign(final CharSequence value) {
    CharSequence _xifexpression = null;
    if (this.comp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.componentMap);
      _builder.append(".Set(\"");
      _builder.append(this.attribute);
      _builder.append("\", ");
      _builder.append(value);
      _builder.append(")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(this.localMap);
      _builder_1.append("[\"");
      _builder_1.append(this.attribute);
      _builder_1.append("\"] = ");
      _builder_1.append(value);
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence getName() {
    CharSequence _xifexpression = null;
    if (this.comp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("this.");
      _builder.append(this.attribute);
      _xifexpression = _builder;
    } else {
      _xifexpression = this.attribute;
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
    if (this.comp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.componentMap);
      _builder.append(".GetValue(\"");
      _builder.append(this.attribute);
      _builder.append("\")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(this.localMap);
      _builder_1.append("[\"");
      _builder_1.append(this.attribute);
      _builder_1.append("\"]");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence exists() {
    CharSequence _xifexpression = null;
    if (this.comp) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.componentMap);
      _builder.append(".Has(\"");
      _builder.append(this.attribute);
      _builder.append("\")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("func()bool{_, has:= ");
      _builder_1.append(this.localMap);
      _builder_1.append("[\"");
      _builder_1.append(this.attribute);
      _builder_1.append("\"]; return has}()");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
}
