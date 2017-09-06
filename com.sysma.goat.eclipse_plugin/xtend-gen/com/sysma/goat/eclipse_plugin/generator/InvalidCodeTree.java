package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeTree;

@SuppressWarnings("all")
public class InvalidCodeTree extends CodeTree {
  @Override
  public CharSequence getCode() {
    return "@ERR@";
  }
}
