package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeIfProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.IfBranchProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.IfProcesses;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class CodeIfProcesses extends CodeTree {
  private static int progressiveIfBranch = 0;
  
  private final String branchChoiceVar;
  
  private final List<CodeIfProcess> branches;
  
  public CodeIfProcesses(final IfProcesses ifb) {
    int _plusPlus = CodeIfProcesses.progressiveIfBranch++;
    String _plus = ("ifb_var_" + Integer.valueOf(_plusPlus));
    this.branchChoiceVar = _plus;
    final Function1<com.sysma.goat.eclipse_plugin.goatComponents.Process, CodeIfProcess> _function = (com.sysma.goat.eclipse_plugin.goatComponents.Process it) -> {
      return new CodeIfProcess(((IfBranchProcess) it));
    };
    this.branches = ListExtensions.<com.sysma.goat.eclipse_plugin.goatComponents.Process, CodeIfProcess>map(ifb.getBranches(), _function);
  }
  
  @Override
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var ");
    _builder.append(this.branchChoiceVar);
    _builder.append(" int");
    _builder.newLineIfNotEmpty();
    _builder.append("p.SendOrReceive(func(attr *goat.Attributes, receiving bool) goat.SendReceive{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("lbm := map[string]string{}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attrWrap := goat.AttributesWrapper{}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attrWrap.Init(attr)");
    _builder.newLine();
    {
      Iterable<Pair<Integer, CodeIfProcess>> _indexed = IterableExtensions.<CodeIfProcess>indexed(this.branches);
      for(final Pair<Integer, CodeIfProcess> branch : _indexed) {
        _builder.append("\t");
        _builder.append("if(receiving == ");
        boolean _isReceivingBranch = branch.getValue().isReceivingBranch();
        _builder.append(_isReceivingBranch, "\t");
        _builder.append(" && ");
        CharSequence _conditionCode = branch.getValue().getConditionCode("lbm", "attrWrap");
        _builder.append(_conditionCode, "\t");
        _builder.append("()){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(this.branchChoiceVar, "\t\t");
        _builder.append(" = ");
        Integer _key = branch.getKey();
        _builder.append(_key, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("attrWrap.Commit()");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        CharSequence _branchCode = branch.getValue().getBranchCode();
        _builder.append(_branchCode, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("lbm = map[string]string{}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("attrWrap.Rollback()");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return goat.ThenFail()");
    _builder.newLine();
    _builder.append("})");
    _builder.newLine();
    _builder.newLine();
    _builder.append("switch ");
    _builder.append(this.branchChoiceVar);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Pair<Integer, CodeIfProcess>> _indexed_1 = IterableExtensions.<CodeIfProcess>indexed(this.branches);
      for(final Pair<Integer, CodeIfProcess> branch_1 : _indexed_1) {
        _builder.append("\t");
        _builder.append("case ");
        Integer _key_1 = branch_1.getKey();
        _builder.append(_key_1, "\t");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _thenCode = branch_1.getValue().getThenCode();
        _builder.append(_thenCode, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("panic(\"Invalid branch!\")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
