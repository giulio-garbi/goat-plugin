package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeProcessDefinition;
import com.sysma.goat.eclipse_plugin.generator.LocalVariableMap;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessSpawn;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CodeProcessSpawn {
  private final ProcessSpawn proc;
  
  private final LocalVariableMap locvars;
  
  private final CharSequence processRef;
  
  public CodeProcessSpawn(final ProcessSpawn proc, final LocalVariableMap locvars, final CharSequence processRef) {
    this.proc = proc;
    this.locvars = locvars;
    this.processRef = processRef;
  }
  
  public CharSequence getCode() {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("unroll(");
      final Function1<ProcessDefinition, String> _function = (ProcessDefinition it) -> {
        return new CodeProcessDefinition(it).getProcess_func_name();
      };
      String _join = IterableExtensions.join(ListExtensions.<ProcessDefinition, String>map(this.proc.getBlk().getProcs(), _function), ", ");
      _builder.append(_join);
      _builder.append(")...");
      final String unroll = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(this.processRef);
      _builder_1.append(".Spawn(runWith(wg, ");
      CharSequence _copy = this.locvars.copy();
      _builder_1.append(_copy);
      _builder_1.append(", ");
      _builder_1.append(unroll);
      _builder_1.append(")...)");
      _xblockexpression = _builder_1;
    }
    return _xblockexpression;
  }
}
