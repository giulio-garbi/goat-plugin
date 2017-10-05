package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeComponentDefinition;
import com.sysma.goat.eclipse_plugin.generator.CodeFunction;
import com.sysma.goat.eclipse_plugin.generator.CodeProcessDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.Model;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessDefinition;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class CodeModel {
  private final String packageName;
  
  private final String mainFuncName;
  
  private final List<CodeProcessDefinition> processes;
  
  private final Iterable<CodeComponentDefinition> components;
  
  private final Iterable<CodeFunction> functions;
  
  public final static String runFuncName = "run";
  
  public CodeModel(final Model model) {
    this.packageName = "main";
    this.mainFuncName = "main";
    final Function1<ProcessDefinition, CodeProcessDefinition> _function = (ProcessDefinition it) -> {
      return new CodeProcessDefinition(it);
    };
    this.processes = ListExtensions.<ProcessDefinition, CodeProcessDefinition>map(model.getProcesses(), _function);
    final Function1<Pair<Integer, ComponentDefinition>, CodeComponentDefinition> _function_1 = (Pair<Integer, ComponentDefinition> pair) -> {
      ComponentDefinition _value = pair.getValue();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("comp_");
      Integer _key = pair.getKey();
      _builder.append(_key);
      return new CodeComponentDefinition(_value, CodeModel.runFuncName, _builder);
    };
    this.components = IterableExtensions.<Pair<Integer, ComponentDefinition>, CodeComponentDefinition>map(IterableExtensions.<ComponentDefinition>indexed(model.getComponents()), _function_1);
    final Function1<FuncDefinition, CodeFunction> _function_2 = (FuncDefinition it) -> {
      return new CodeFunction(it);
    };
    this.functions = ListExtensions.<FuncDefinition, CodeFunction>map(model.getFunctions(), _function_2);
  }
  
  public static String getGoatProcessReference() {
    return "p";
  }
  
  public CharSequence getCode() {
    return this.getCode((-1));
  }
  
  public CharSequence getTestCode(final int timeout) {
    return this.getCode(timeout);
  }
  
  public CharSequence getCode(final int timeout) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import (");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"github.com/giulio-garbi/goat/goat\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"strings\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"fmt\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"strconv\"");
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("type continuationProcess func(map[string]interface{}, *goat.Process) continuationProcess");
    _builder.newLine();
    _builder.newLine();
    {
      for(final CodeFunction func : this.functions) {
        CharSequence _code = func.getCode();
        _builder.append(_code);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      for(final CodeProcessDefinition c_pdef : this.processes) {
        CharSequence _code_1 = c_pdef.getCode();
        _builder.append(_code_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("func ");
    _builder.append(CodeModel.runFuncName);
    _builder.append("(proc continuationProcess, locAttr map[string]interface{}) (func(*goat.Process)){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return func(p *goat.Process){");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("for currp := proc; currp != nil; currp = currp(locAttr, p){}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("func ");
    _builder.append(this.mainFuncName);
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//Needed to avoid golang errors \"imported and not used\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("_ = func(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fmt.Println(strings.Join([]string{},\"\"))");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("strconv.Atoi(\"\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("term := make(chan struct{})");
    _builder.newLine();
    {
      if ((timeout >= 0)) {
        _builder.append("\t");
        _builder.append("goat.RunCentralServer(17654, term, ");
        _builder.append(timeout, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final CodeComponentDefinition cdef : this.components) {
        _builder.append("\t");
        CharSequence _componentDeclaration = cdef.getComponentDeclaration();
        _builder.append(_componentDeclaration, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final CodeComponentDefinition cdef_1 : this.components) {
        _builder.append("\t");
        CharSequence _code_2 = cdef_1.getCode();
        _builder.append(_code_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("<- term");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
