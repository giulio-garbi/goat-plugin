package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeExpression;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;

@SuppressWarnings("all")
public class CodeValue {
  private final Expression value;
  
  private final String componentAttr;
  
  private final String localAttr;
  
  public CodeValue(final Expression value, final String componentAttr, final String localAttr) {
    this.componentAttr = componentAttr;
    this.localAttr = localAttr;
    this.value = value;
  }
  
  public CharSequence getCode() {
    return CodeExpression.getExpressionWithAttributes(this.value, this.localAttr, this.componentAttr);
  }
}
