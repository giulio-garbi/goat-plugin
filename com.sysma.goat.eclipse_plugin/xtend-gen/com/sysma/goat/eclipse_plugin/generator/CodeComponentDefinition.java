package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class CodeComponentDefinition extends CodeTree {
  private final ComponentDefinition cdef;
  
  private final CharSequence mainFunc;
  
  private final CharSequence compName;
  
  public CodeComponentDefinition(final ComponentDefinition cdef, final CharSequence mainFunc, final CharSequence compName) {
    this.cdef = cdef;
    this.mainFunc = mainFunc;
    this.compName = compName;
  }
  
  public CharSequence getComponentDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.compName);
    _builder.append(" := goat.NewComponentWithAttributes(goat.NewSingleServerAgent(\"");
    String _address = this.cdef.getAddress();
    _builder.append(_address);
    _builder.append("\"),  map[string]string{");
    _builder.newLineIfNotEmpty();
    {
      int _length = ((Object[])Conversions.unwrapArray(this.cdef.getEnv().getAttrs(), Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for(final Integer i : _doubleDotLessThan) {
        _builder.append("\t");
        _builder.append("\"");
        String _get = this.cdef.getEnv().getAttrs().get((i).intValue());
        _builder.append(_get, "\t");
        _builder.append("\" : \"");
        String _get_1 = this.cdef.getEnv().getVals().get((i).intValue());
        _builder.append(_get_1, "\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("})");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("goat.NewProcess(");
    _builder.append(this.compName);
    _builder.append(").Run(func(p *goat.Process){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(this.mainFunc, "\t");
    _builder.append("(\"");
    String _name = this.cdef.getProc().getName();
    _builder.append(_name, "\t");
    _builder.append("\", map[string]string{");
    _builder.newLineIfNotEmpty();
    {
      int _length = ((Object[])Conversions.unwrapArray(this.cdef.getParams(), Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for(final Integer i : _doubleDotLessThan) {
        _builder.append("\t\t");
        _builder.append("\"");
        String _get = this.cdef.getProc().getParams().get((i).intValue());
        _builder.append(_get, "\t\t");
        _builder.append("\" : \"");
        String _get_1 = this.cdef.getParams().get((i).intValue());
        _builder.append(_get_1, "\t\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}, p)");
    _builder.newLine();
    _builder.append("})");
    return _builder;
  }
}
