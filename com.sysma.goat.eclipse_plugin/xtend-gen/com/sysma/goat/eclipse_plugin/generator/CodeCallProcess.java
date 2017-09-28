package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeProcessDefinition;
import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeCallProcess extends CodeTree {
  private final CallProcess call;
  
  public CodeCallProcess(final CallProcess p) {
    this.call = p;
  }
  
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("goto ");
    ProcessDefinition _procname = this.call.getProcname();
    _builder.append(new CodeProcessDefinition(_procname).process_goto_label);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
