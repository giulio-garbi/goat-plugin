package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeProcessDefinition extends CodeTree {
  public final String procname;
  
  private final com.sysma.goat.eclipse_plugin.goatComponents.Process proc;
  
  public static String getLocalVariablesMap() {
    return "localVars";
  }
  
  public CodeProcessDefinition(final ProcessDefinition pdef) {
    this.procname = pdef.getName();
    this.proc = pdef.getProc();
  }
  
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("func ");
    String _process_func_name = this.getProcess_func_name();
    _builder.append(_process_func_name);
    _builder.append("(");
    String _localVariablesMap = CodeProcessDefinition.getLocalVariablesMap();
    _builder.append(_localVariablesMap);
    _builder.append(" map[string]interface{}, p *goat.Process) continuationProcess{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _code = CodeTree.convert(this.proc).getCode();
    _builder.append(_code, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String getProcess_func_name() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pr_");
    _builder.append(this.procname);
    return _builder.toString();
  }
}
