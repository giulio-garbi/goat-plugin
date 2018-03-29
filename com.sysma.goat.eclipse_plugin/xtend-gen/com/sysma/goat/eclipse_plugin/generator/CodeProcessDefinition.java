package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeProcessBlock;
import com.sysma.goat.eclipse_plugin.generator.LocalVariableMap;
import com.sysma.goat.eclipse_plugin.goatComponents.PDPBlock;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessBlock;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CodeProcessDefinition {
  private final ProcessDefinition pdef;
  
  public CodeProcessDefinition(final ProcessDefinition pdef) {
    this.pdef = pdef;
  }
  
  public CharSequence getCode() {
    CharSequence _xifexpression = null;
    EObject _block = this.pdef.getBlock();
    if ((_block instanceof ProcessBlock)) {
      CharSequence _xblockexpression = null;
      {
        LocalVariableMap localVariablesMap = new LocalVariableMap("locvar");
        CharSequence procReference = "p";
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("func ");
        String _process_func_name = this.getProcess_func_name();
        _builder.append(_process_func_name);
        _builder.append("(wg *sync.WaitGroup, ");
        _builder.append(localVariablesMap.name);
        _builder.append(" *map[string]interface{}, ");
        _builder.append(procReference);
        _builder.append(" *goat.Process) continuationProcess{");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EObject _block_1 = this.pdef.getBlock();
        CharSequence _code = new CodeProcessBlock(((ProcessBlock) _block_1), localVariablesMap, procReference).getCode();
        _builder.append(_code, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return nil");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _xblockexpression = _builder;
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EObject _block_1 = this.pdef.getBlock();
      if ((_block_1 instanceof PDPBlock)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("var ");
        String _process_func_name = this.getProcess_func_name();
        _builder.append(_process_func_name);
        _builder.append(" []continuationProcess = unroll(");
        EObject _block_2 = this.pdef.getBlock();
        final Function1<ProcessDefinition, String> _function = (ProcessDefinition it) -> {
          return new CodeProcessDefinition(it).getProcess_func_name();
        };
        String _join = IterableExtensions.join(ListExtensions.<ProcessDefinition, String>map(((PDPBlock) _block_2).getProcs(), _function), ", ");
        _builder.append(_join);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _xifexpression_1 = _builder;
      } else {
        _xifexpression_1 = "";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String getProcess_func_name() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pr_");
    String _name = this.pdef.getName();
    _builder.append(_name);
    return _builder.toString();
  }
}
