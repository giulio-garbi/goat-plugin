package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeCallProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.InterleavingProcess;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CodeInterleavingProcess extends CodeTree {
  private final List<CallProcess> subprocesses;
  
  public CodeInterleavingProcess(final InterleavingProcess ip) {
    final Function1<com.sysma.goat.eclipse_plugin.goatComponents.Process, CallProcess> _function = (com.sysma.goat.eclipse_plugin.goatComponents.Process it) -> {
      return ((CallProcess) it);
    };
    this.subprocesses = ListExtensions.<com.sysma.goat.eclipse_plugin.goatComponents.Process, CallProcess>map(ip.getSubProcs(), _function);
  }
  
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<CallProcess> _tail = IterableExtensions.<CallProcess>tail(this.subprocesses);
      for(final CallProcess proc : _tail) {
        String _goatProcessReference = CodeModel.getGoatProcessReference();
        _builder.append(_goatProcessReference);
        _builder.append(".Spawn(func(pr *goat.Process){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("lvars := map[string]interface{}{}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("for k, v := range ");
        String _localVariablesMap = CodeModel.getLocalVariablesMap();
        _builder.append(_localVariablesMap, "\t");
        _builder.append("{");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("lvars[k] = v");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(CodeModel.systemFunction, "\t");
        _builder.append("(\"");
        String _name = proc.getProcname().getName();
        _builder.append(_name, "\t");
        _builder.append("\", lvars , pr)");
        _builder.newLineIfNotEmpty();
        _builder.append("})");
        _builder.newLine();
      }
    }
    _builder.newLine();
    CallProcess _head = IterableExtensions.<CallProcess>head(this.subprocesses);
    CharSequence _code = new CodeCallProcess(_head).getCode();
    _builder.append(_code);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
