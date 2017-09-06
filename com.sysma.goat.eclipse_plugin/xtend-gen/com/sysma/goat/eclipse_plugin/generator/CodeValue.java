package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeAttribute;
import com.sysma.goat.eclipse_plugin.goatComponents.Attribute;
import com.sysma.goat.eclipse_plugin.goatComponents.AttributeValue;
import com.sysma.goat.eclipse_plugin.goatComponents.GoStringFunction;
import com.sysma.goat.eclipse_plugin.goatComponents.ImmediateValue;
import com.sysma.goat.eclipse_plugin.goatComponents.Value;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CodeValue {
  private final Value value;
  
  private final String componentAttr;
  
  private final String localAttr;
  
  public CodeValue(final Value value, final String componentAttr, final String localAttr) {
    this.componentAttr = componentAttr;
    this.localAttr = localAttr;
    this.value = value;
  }
  
  public CharSequence getCode() {
    CharSequence _switchResult = null;
    final Value value = this.value;
    boolean _matched = false;
    if (value instanceof AttributeValue) {
      _matched=true;
      Attribute _attr = ((AttributeValue)this.value).getAttr();
      _switchResult = new CodeAttribute(_attr, this.componentAttr, this.localAttr).read();
    }
    if (!_matched) {
      if (value instanceof ImmediateValue) {
        _matched=true;
        String _imm = ((ImmediateValue)this.value).getImm();
        String _plus = ("\"" + _imm);
        _switchResult = (_plus + "\"");
      }
    }
    if (!_matched) {
      if (value instanceof GoStringFunction) {
        _matched=true;
        String _name = ((GoStringFunction)this.value).getFuncname().getName();
        String _plus = ("f_" + _name);
        String _plus_1 = (_plus + "(");
        final Function1<Value, CharSequence> _function = (Value it) -> {
          return new CodeValue(it, this.componentAttr, this.localAttr).getCode();
        };
        String _join = String.join(", ", ListExtensions.<Value, CharSequence>map(((GoStringFunction)this.value).getParams(), _function));
        String _plus_2 = (_plus_1 + _join);
        _switchResult = (_plus_2 + ")");
      }
    }
    if (!_matched) {
      _switchResult = "@ERR@";
    }
    return _switchResult;
  }
}
