package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeTree;

@SuppressWarnings("all")
public class CodeZeroProcess extends CodeTree {
  @Override
  public CharSequence getCode() {
    return "return nil";
  }
}
