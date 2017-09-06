package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeCallProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeIfProcesses;
import com.sysma.goat.eclipse_plugin.generator.CodeInputProcesses;
import com.sysma.goat.eclipse_plugin.generator.CodeInterleavingProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeOutputProcess;
import com.sysma.goat.eclipse_plugin.generator.CodeZeroProcess;
import com.sysma.goat.eclipse_plugin.generator.InvalidCodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.CallProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.IfProcesses;
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcesses;
import com.sysma.goat.eclipse_plugin.goatComponents.InterleavingProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.ZeroProcess;

@SuppressWarnings("all")
public abstract class CodeTree {
  public abstract CharSequence getCode();
  
  public static CodeTree convert(final com.sysma.goat.eclipse_plugin.goatComponents.Process p) {
    CodeTree _switchResult = null;
    boolean _matched = false;
    if (p instanceof CallProcess) {
      _matched=true;
      _switchResult = new CodeCallProcess(((CallProcess)p));
    }
    if (!_matched) {
      if (p instanceof IfProcesses) {
        _matched=true;
        _switchResult = new CodeIfProcesses(((IfProcesses)p));
      }
    }
    if (!_matched) {
      if (p instanceof InputProcesses) {
        _matched=true;
        _switchResult = new CodeInputProcesses(((InputProcesses)p));
      }
    }
    if (!_matched) {
      if (p instanceof InterleavingProcess) {
        _matched=true;
        _switchResult = new CodeInterleavingProcess(((InterleavingProcess)p));
      }
    }
    if (!_matched) {
      if (p instanceof OutputProcess) {
        _matched=true;
        _switchResult = new CodeOutputProcess(((OutputProcess)p));
      }
    }
    if (!_matched) {
      if (p instanceof ZeroProcess) {
        _matched=true;
        _switchResult = new CodeZeroProcess();
      }
    }
    if (!_matched) {
      _switchResult = new InvalidCodeTree();
    }
    return _switchResult;
  }
}
