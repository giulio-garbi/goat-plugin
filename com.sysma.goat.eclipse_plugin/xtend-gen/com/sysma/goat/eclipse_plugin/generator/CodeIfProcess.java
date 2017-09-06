package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeInputProcesses;
import com.sysma.goat.eclipse_plugin.generator.CodeOutputProcess;
import com.sysma.goat.eclipse_plugin.generator.CodePreconditionProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.IfBranchProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcesses;
import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions;

@SuppressWarnings("all")
public class CodeIfProcess {
  private final IfBranchProcess process;
  
  private boolean isOutput;
  
  private CodeInputProcesses c_iproc;
  
  private CodeOutputProcess c_oproc;
  
  public CodeIfProcess(final IfBranchProcess process) {
    this.process = process;
    final com.sysma.goat.eclipse_plugin.goatComponents.Process then = process.getThen();
    boolean _matched = false;
    if (then instanceof InputProcesses) {
      _matched=true;
      this.isOutput = false;
      com.sysma.goat.eclipse_plugin.goatComponents.Process _then = process.getThen();
      CodeInputProcesses _codeInputProcesses = new CodeInputProcesses(((InputProcesses) _then));
      this.c_iproc = _codeInputProcesses;
    }
    if (!_matched) {
      if (then instanceof OutputProcess) {
        _matched=true;
        this.isOutput = true;
        com.sysma.goat.eclipse_plugin.goatComponents.Process _then = process.getThen();
        CodeOutputProcess _codeOutputProcess = new CodeOutputProcess(((OutputProcess) _then));
        this.c_oproc = _codeOutputProcess;
      }
    }
    if (!_matched) {
      this.isOutput = false;
    }
  }
  
  public CharSequence getBranchCode() {
    CharSequence _xifexpression = null;
    if (this.isOutput) {
      _xifexpression = this.c_oproc.getCodeForIf();
    } else {
      _xifexpression = this.c_iproc.getCodeForIf();
    }
    return _xifexpression;
  }
  
  public boolean isReceivingBranch() {
    return (!this.isOutput);
  }
  
  public CharSequence getConditionCode(final String localVar, final String attrVar) {
    Preconditions _cond = this.process.getCond();
    return new CodePreconditionProcess(_cond).getPreconditionCode(localVar, attrVar);
  }
  
  public CharSequence getThenCode() {
    CharSequence _xifexpression = null;
    if (this.isOutput) {
      _xifexpression = this.c_oproc.getThenCode();
    } else {
      _xifexpression = this.c_iproc.getCodeForFirstThen();
    }
    return _xifexpression;
  }
}
