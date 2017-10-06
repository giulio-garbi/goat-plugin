/**
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.tests.parser;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.goatComponents.And;
import com.sysma.goat.eclipse_plugin.goatComponents.BoolConstant;
import com.sysma.goat.eclipse_plugin.goatComponents.Comparison;
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentAttributeRef;
import com.sysma.goat.eclipse_plugin.goatComponents.Concatenate;
import com.sysma.goat.eclipse_plugin.goatComponents.Equality;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncParam;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncReturn;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncStatement;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarDeclaration;
import com.sysma.goat.eclipse_plugin.goatComponents.FunctionCall;
import com.sysma.goat.eclipse_plugin.goatComponents.IntConstant;
import com.sysma.goat.eclipse_plugin.goatComponents.LRef;
import com.sysma.goat.eclipse_plugin.goatComponents.LocalAttributeRef;
import com.sysma.goat.eclipse_plugin.goatComponents.LocalVarRef;
import com.sysma.goat.eclipse_plugin.goatComponents.Minus;
import com.sysma.goat.eclipse_plugin.goatComponents.Model;
import com.sysma.goat.eclipse_plugin.goatComponents.MulOrDiv;
import com.sysma.goat.eclipse_plugin.goatComponents.Not;
import com.sysma.goat.eclipse_plugin.goatComponents.Or;
import com.sysma.goat.eclipse_plugin.goatComponents.Plus;
import com.sysma.goat.eclipse_plugin.goatComponents.RecAttributeRef;
import com.sysma.goat.eclipse_plugin.goatComponents.StringConstant;
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(GoatComponentsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  private Expression encapsulateExpression(final CharSequence expr) {
    try {
      Expression _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("infrastructure infr");
        _builder.newLine();
        _builder.newLine();
        _builder.append("function int ciao(int i, string s, bool b, int ii, string ss, bool bb){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("var j = 0");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return ");
        _builder.append(expr, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        final Model result = this.parseHelper.parse(_builder);
        Assert.assertNotNull(result);
        FuncStatement _get = result.getFunctions().get(0).getBlk().getStatements().get(1);
        _xblockexpression = ((FuncReturn) _get).getVal();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void intConstant() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof IntConstant));
    int _value = ((IntConstant) result).getValue();
    boolean _equals = (_value == 5);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void stringConstant() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"ciao\"");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof StringConstant));
    String _value = ((StringConstant) result).getValue();
    boolean _equals = Objects.equal(_value, "ciao");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void boolConstantTrue() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("true");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof BoolConstant));
    String _value = ((BoolConstant) result).getValue();
    boolean _equals = Objects.equal(_value, "true");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void boolConstantFalse() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("false");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof BoolConstant));
    String _value = ((BoolConstant) result).getValue();
    boolean _equals = Objects.equal(_value, "false");
    Assert.assertTrue(_equals);
  }
  
  public void componentAttribute() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.ca");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof ComponentAttributeRef));
    String _attribute = ((ComponentAttributeRef) result).getAttribute();
    boolean _equals = Objects.equal(_attribute, "ca");
    Assert.assertTrue(_equals);
  }
  
  public void receiverAttribute() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("receiver.ra");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof RecAttributeRef));
    String _attribute = ((RecAttributeRef) result).getAttribute();
    boolean _equals = Objects.equal(_attribute, "ra");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void functionCallWithArguments() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ciao(1,\"x\",true,1,\"x\",false)");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof FunctionCall));
    String _name = ((FunctionCall) result).getFunction().getName();
    boolean _equals = Objects.equal(_name, "ciao");
    Assert.assertTrue(_equals);
    int _length = ((Object[])Conversions.unwrapArray(((FunctionCall) result).getParams(), Object.class)).length;
    boolean _equals_1 = (_length == 6);
    Assert.assertTrue(_equals_1);
  }
  
  @Test
  public void functionCallWithoutArguments() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ciao()");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof FunctionCall));
    String _name = ((FunctionCall) result).getFunction().getName();
    boolean _equals = Objects.equal(_name, "ciao");
    Assert.assertTrue(_equals);
    int _length = ((Object[])Conversions.unwrapArray(((FunctionCall) result).getParams(), Object.class)).length;
    boolean _equals_1 = (_length == 0);
    Assert.assertTrue(_equals_1);
  }
  
  @Test
  public void localAttr() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proc.attr");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof LocalAttributeRef));
    final LocalAttributeRef ref = ((LocalAttributeRef) result);
    String _attribute = ref.getAttribute();
    boolean _equals = Objects.equal(_attribute, "attr");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void funcParam() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("i");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof LocalVarRef));
    final LRef ref = ((LocalVarRef) result).getRef();
    Assert.assertTrue((ref instanceof FuncParam));
    String _name = ((FuncParam) ref).getName();
    boolean _equals = Objects.equal(_name, "i");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void funcVar() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("j");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof LocalVarRef));
    final LRef ref = ((LocalVarRef) result).getRef();
    Assert.assertTrue((ref instanceof FuncVarDeclaration));
    String _name = ((FuncVarDeclaration) ref).getName();
    boolean _equals = Objects.equal(_name, "j");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void negation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!(b)");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Not));
    Assert.assertNotNull(((Not) result).getExpression());
  }
  
  @Test
  public void brackets() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((5))");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof IntConstant));
    int _value = ((IntConstant) result).getValue();
    boolean _equals = (_value == 5);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void mul() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5 * i");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof MulOrDiv));
    final MulOrDiv mul = ((MulOrDiv) result);
    Expression _left = mul.getLeft();
    Assert.assertTrue((_left instanceof IntConstant));
    Expression _right = mul.getRight();
    Assert.assertTrue((_right instanceof LocalVarRef));
    String _op = mul.getOp();
    boolean _equals = Objects.equal(_op, "*");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void multiMulWithBracketsLeft() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(5 * i) / 6");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof MulOrDiv));
    final MulOrDiv div = ((MulOrDiv) result);
    Expression _left = div.getLeft();
    Assert.assertTrue((_left instanceof MulOrDiv));
    Expression _right = div.getRight();
    Assert.assertTrue((_right instanceof IntConstant));
    String _op = div.getOp();
    boolean _equals = Objects.equal(_op, "/");
    Assert.assertTrue(_equals);
    Expression _left_1 = div.getLeft();
    final MulOrDiv mul = ((MulOrDiv) _left_1);
    Expression _left_2 = mul.getLeft();
    Assert.assertTrue((_left_2 instanceof IntConstant));
    Expression _right_1 = mul.getRight();
    Assert.assertTrue((_right_1 instanceof LocalVarRef));
    String _op_1 = mul.getOp();
    boolean _equals_1 = Objects.equal(_op_1, "*");
    Assert.assertTrue(_equals_1);
  }
  
  @Test
  public void multiMulWithBracketsRight() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("6 / (5 * i)");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof MulOrDiv));
    final MulOrDiv div = ((MulOrDiv) result);
    Expression _right = div.getRight();
    Assert.assertTrue((_right instanceof MulOrDiv));
    Expression _left = div.getLeft();
    Assert.assertTrue((_left instanceof IntConstant));
    String _op = div.getOp();
    boolean _equals = Objects.equal(_op, "/");
    Assert.assertTrue(_equals);
    Expression _right_1 = div.getRight();
    final MulOrDiv mul = ((MulOrDiv) _right_1);
    Expression _left_1 = mul.getLeft();
    Assert.assertTrue((_left_1 instanceof IntConstant));
    Expression _right_2 = mul.getRight();
    Assert.assertTrue((_right_2 instanceof LocalVarRef));
    String _op_1 = mul.getOp();
    boolean _equals_1 = Objects.equal(_op_1, "*");
    Assert.assertTrue(_equals_1);
  }
  
  @Test
  public void plusInt() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5 + i");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Plus));
    final Plus plus = ((Plus) result);
    Expression _left = plus.getLeft();
    Assert.assertTrue((_left instanceof IntConstant));
    Expression _right = plus.getRight();
    Assert.assertTrue((_right instanceof LocalVarRef));
  }
  
  @Test
  public void minus() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5 - i");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Minus));
    final Minus plus = ((Minus) result);
    Expression _left = plus.getLeft();
    Assert.assertTrue((_left instanceof IntConstant));
    Expression _right = plus.getRight();
    Assert.assertTrue((_right instanceof LocalVarRef));
  }
  
  @Test
  public void concatString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"5\" ++ \"i\"");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Concatenate));
    final Concatenate plus = ((Concatenate) result);
    Expression _left = plus.getLeft();
    Assert.assertTrue((_left instanceof StringConstant));
    Expression _right = plus.getRight();
    Assert.assertTrue((_right instanceof StringConstant));
  }
  
  @Test
  public void plusPrecedence() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5 + i * 6");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Plus));
    final Plus plus = ((Plus) result);
    Expression _left = plus.getLeft();
    Assert.assertTrue((_left instanceof IntConstant));
    Expression _right = plus.getRight();
    Assert.assertTrue((_right instanceof MulOrDiv));
    Expression _right_1 = plus.getRight();
    final MulOrDiv mul = ((MulOrDiv) _right_1);
    Expression _left_1 = mul.getLeft();
    Assert.assertTrue((_left_1 instanceof LocalVarRef));
    Expression _right_2 = mul.getRight();
    Assert.assertTrue((_right_2 instanceof IntConstant));
    String _op = mul.getOp();
    boolean _equals = Objects.equal(_op, "*");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void geq() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5 >= 6");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Comparison));
    final Comparison cmp = ((Comparison) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof IntConstant));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof IntConstant));
    String _op = cmp.getOp();
    boolean _equals = Objects.equal(_op, ">=");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void gt() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5 > 6 + 3");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Comparison));
    final Comparison cmp = ((Comparison) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof IntConstant));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof Plus));
    String _op = cmp.getOp();
    boolean _equals = Objects.equal(_op, ">");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void lt() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5 * 8 < 6 + 3");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Comparison));
    final Comparison cmp = ((Comparison) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof MulOrDiv));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof Plus));
    String _op = cmp.getOp();
    boolean _equals = Objects.equal(_op, "<");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void lte() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5 <= 6");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Comparison));
    final Comparison cmp = ((Comparison) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof IntConstant));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof IntConstant));
    String _op = cmp.getOp();
    boolean _equals = Objects.equal(_op, "<=");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void equalInt() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("5 == 6");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Equality));
    final Equality cmp = ((Equality) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof IntConstant));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof IntConstant));
    String _op = cmp.getOp();
    boolean _equals = Objects.equal(_op, "==");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void equalString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"5\" == \"6\"");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Equality));
    final Equality cmp = ((Equality) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof StringConstant));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof StringConstant));
    String _op = cmp.getOp();
    boolean _equals = Objects.equal(_op, "==");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void equalBool() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("true == false");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Equality));
    final Equality cmp = ((Equality) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof BoolConstant));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof BoolConstant));
    String _op = cmp.getOp();
    boolean _equals = Objects.equal(_op, "==");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void comparisonStrongerThanEqual() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("i >= 9 == 5 < 6");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Equality));
    final Equality cmp = ((Equality) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof Comparison));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof Comparison));
    String _op = cmp.getOp();
    boolean _equals = Objects.equal(_op, "==");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void notEqual() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("i != 9");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Equality));
    final Equality cmp = ((Equality) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof LocalVarRef));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof IntConstant));
    String _op = cmp.getOp();
    boolean _equals = Objects.equal(_op, "!=");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void and() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b && true");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof And));
    final And cmp = ((And) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof LocalVarRef));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof BoolConstant));
  }
  
  @Test
  public void or() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b || true");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Or));
    final Or cmp = ((Or) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof LocalVarRef));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof BoolConstant));
  }
  
  @Test
  public void andStrongerThanOr() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("false && b || true && false");
    final Expression result = this.encapsulateExpression(_builder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.eResource().getErrors().isEmpty());
    Assert.assertTrue((result instanceof Or));
    final Or cmp = ((Or) result);
    Expression _left = cmp.getLeft();
    Assert.assertTrue((_left instanceof And));
    Expression _right = cmp.getRight();
    Assert.assertTrue((_right instanceof And));
  }
}
