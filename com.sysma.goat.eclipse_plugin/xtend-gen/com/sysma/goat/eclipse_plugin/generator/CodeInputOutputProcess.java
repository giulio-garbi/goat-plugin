package com.sysma.goat.eclipse_plugin.generator;

@SuppressWarnings("all")
public interface CodeInputOutputProcess {
  public abstract CharSequence getBranchCode();
  
  public abstract CharSequence getThenCode();
}
