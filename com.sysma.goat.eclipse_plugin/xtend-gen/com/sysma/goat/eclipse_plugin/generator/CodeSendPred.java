package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeExpression;
import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;

@SuppressWarnings("all")
public class CodeSendPred extends CodeTree {
  private final Expression pred;
  
  private final String localAttributes;
  
  public CodeSendPred(final Expression pred, final String localAttributes) {
    this.pred = pred;
    this.localAttributes = localAttributes;
  }
  
  @Override
  public CharSequence getCode() {
    return CodeExpression.getOutputPredicate(this.pred, this.localAttributes);
  }
}
