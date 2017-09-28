package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeExpression;
import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;

@SuppressWarnings("all")
public class CodeReceivePred extends CodeTree {
  private final Expression pred;
  
  private final String componentAttributes;
  
  private final String localAttributes;
  
  public CodeReceivePred(final Expression pred, final String componentAttributes, final String localAttributes) {
    this.pred = pred;
    this.componentAttributes = componentAttributes;
    this.localAttributes = localAttributes;
  }
  
  @Override
  public CharSequence getCode() {
    return CodeExpression.getExpressionWithAttributes(this.pred, this.localAttributes, this.componentAttributes);
  }
}
