package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeProcessDefinition extends CodeTree {
  public final String procname;
  
  public final String process_goto_label;
  
  private final com.sysma.goat.eclipse_plugin.goatComponents.Process proc;
  
  public CodeProcessDefinition(final ProcessDefinition pdef) {
    this.procname = pdef.getName();
    this.process_goto_label = ("proc_" + this.procname);
    this.proc = pdef.getProc();
  }
  
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Process ");
    _builder.append(this.procname);
    _builder.newLineIfNotEmpty();
    _builder.append(this.process_goto_label);
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _code = CodeTree.convert(this.proc).getCode();
    _builder.append(_code, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
