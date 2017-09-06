package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.goatComponents.FuncAnd;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncBlock;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncEqualityTest;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncIfElse;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncImmediate;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncMemoryRef;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncNot;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncParam;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncPred;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncPredicate;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncReturn;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncStatement;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncString;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarAssign;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarDeclaration;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CodeFunction {
  private final FuncDefinition definition;
  
  public CodeFunction(final FuncDefinition fdef) {
    this.definition = fdef;
  }
  
  public CharSequence getCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("func f_");
    String _name = this.definition.getName();
    _builder.append(_name);
    _builder.append("(");
    final Function1<FuncParam, String> _function = (FuncParam it) -> {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _name_1 = it.getName();
      _builder_1.append(_name_1);
      _builder_1.append(" string");
      return _builder_1.toString();
    };
    String _join = IterableExtensions.join(ListExtensions.<FuncParam, String>map(this.definition.getParams(), _function), ",");
    _builder.append(_join);
    _builder.append(") string ");
    CharSequence _makeCode = this.makeCode(this.definition.getBlk());
    _builder.append(_makeCode);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence makeCode(final Object item) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (item instanceof FuncBlock) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      final Function1<FuncStatement, CharSequence> _function = (FuncStatement it) -> {
        return this.makeCode(it);
      };
      String _join = IterableExtensions.join(ListExtensions.<FuncStatement, CharSequence>map(((FuncBlock)item).getStatements(), _function), "\n");
      _builder.append(_join, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (item instanceof FuncVarAssign) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = ((FuncVarAssign)item).getVar().getName();
        _builder.append(_name);
        _builder.append(" = ");
        CharSequence _makeCode = this.makeCode(((FuncVarAssign)item).getVal());
        _builder.append(_makeCode);
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (item instanceof FuncIfElse) {
        _matched=true;
        int _length = ((Object[])Conversions.unwrapArray(((FuncIfElse)item).getThen(), Object.class)).length;
        final Function1<Integer, String> _function = (Integer i) -> {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("if (");
          CharSequence _makeCode = this.makeCode(((FuncIfElse)item).getTest().get((i).intValue()));
          _builder.append(_makeCode);
          _builder.append(") ");
          CharSequence _makeCode_1 = this.makeCode(((FuncIfElse)item).getThen().get((i).intValue()));
          _builder.append(_makeCode_1);
          return _builder.toString();
        };
        String _join = IterableExtensions.join(IterableExtensions.<Integer, String>map(new ExclusiveRange(0, _length, true), _function), "else ");
        CharSequence _xifexpression = null;
        FuncBlock _elseBranch = ((FuncIfElse)item).getElseBranch();
        boolean _tripleNotEquals = (_elseBranch != null);
        if (_tripleNotEquals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("else ");
          CharSequence _makeCode = this.makeCode(((FuncIfElse)item).getElseBranch());
          _builder.append(_makeCode);
          _xifexpression = _builder;
        } else {
          _xifexpression = "";
        }
        _switchResult = (_join + _xifexpression);
      }
    }
    if (!_matched) {
      if (item instanceof FuncReturn) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("return ");
        CharSequence _makeCode = this.makeCode(((FuncReturn)item).getVal());
        _builder.append(_makeCode);
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (item instanceof FuncVarDeclaration) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("var ");
        String _name = ((FuncVarDeclaration)item).getName();
        _builder.append(_name);
        _builder.append(" = ");
        CharSequence _makeCode = this.makeCode(((FuncVarDeclaration)item).getVal());
        _builder.append(_makeCode);
        _builder.newLineIfNotEmpty();
        _builder.append("_ = ");
        String _name_1 = ((FuncVarDeclaration)item).getName();
        _builder.append(_name_1);
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (item instanceof FuncString) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\"");
        String _imm = ((FuncString)item).getImm();
        _builder.append(_imm);
        _builder.append("\"");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (item instanceof FuncMemoryRef) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = ((FuncMemoryRef)item).getRef().getName();
        _builder.append(_name);
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (item instanceof FuncPredicate) {
        _matched=true;
        final Function1<FuncPred, CharSequence> _function = (FuncPred it) -> {
          return this.makeCode(it);
        };
        _switchResult = IterableExtensions.join(ListExtensions.<FuncPred, CharSequence>map(((FuncPredicate)item).getOr(), _function), " || ");
      }
    }
    if (!_matched) {
      if (item instanceof FuncAnd) {
        _matched=true;
        final Function1<FuncPred, CharSequence> _function = (FuncPred it) -> {
          return this.makeCode(it);
        };
        _switchResult = IterableExtensions.join(ListExtensions.<FuncPred, CharSequence>map(((FuncAnd)item).getAnd(), _function), " && ");
      }
    }
    if (!_matched) {
      if (item instanceof FuncNot) {
        _matched=true;
        CharSequence _xifexpression = null;
        boolean _isNeg = ((FuncNot)item).isNeg();
        if (_isNeg) {
          CharSequence _makeCode = this.makeCode(((FuncNot)item).getTerm());
          _xifexpression = ("!" + _makeCode);
        } else {
          _xifexpression = this.makeCode(((FuncNot)item).getTerm());
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (item instanceof FuncImmediate) {
        _matched=true;
        String _xifexpression = null;
        boolean _isIsTrue = ((FuncImmediate)item).isIsTrue();
        if (_isIsTrue) {
          _xifexpression = "true";
        } else {
          _xifexpression = "false";
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (item instanceof FuncEqualityTest) {
        _matched=true;
        CharSequence _switchResult_1 = null;
        String _operand = ((FuncEqualityTest)item).getOperand();
        if (_operand != null) {
          switch (_operand) {
            case "=":
              StringConcatenation _builder = new StringConcatenation();
              CharSequence _makeCode = this.makeCode(((FuncEqualityTest)item).getOp1());
              _builder.append(_makeCode);
              _builder.append(" == ");
              CharSequence _makeCode_1 = this.makeCode(((FuncEqualityTest)item).getOp2());
              _builder.append(_makeCode_1);
              _switchResult_1 = _builder;
              break;
            case "!=":
              StringConcatenation _builder_1 = new StringConcatenation();
              CharSequence _makeCode_2 = this.makeCode(((FuncEqualityTest)item).getOp1());
              _builder_1.append(_makeCode_2);
              _builder_1.append(" != ");
              CharSequence _makeCode_3 = this.makeCode(((FuncEqualityTest)item).getOp2());
              _builder_1.append(_makeCode_3);
              _switchResult_1 = _builder_1;
              break;
            default:
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("func ()bool{");
              _builder_2.newLine();
              _builder_2.append("\t");
              _builder_2.append("o1, err := strconv.Atoi(");
              CharSequence _makeCode_4 = this.makeCode(((FuncEqualityTest)item).getOp1());
              _builder_2.append(_makeCode_4, "\t");
              _builder_2.append(")");
              _builder_2.newLineIfNotEmpty();
              _builder_2.append("\t");
              _builder_2.append("if err != nil {");
              _builder_2.newLine();
              _builder_2.append("\t\t");
              _builder_2.append("panic(\"Not an integer number\")");
              _builder_2.newLine();
              _builder_2.append("\t");
              _builder_2.append("}");
              _builder_2.newLine();
              _builder_2.append("\t");
              _builder_2.append("o2, err := strconv.Atoi(");
              CharSequence _makeCode_5 = this.makeCode(((FuncEqualityTest)item).getOp2());
              _builder_2.append(_makeCode_5, "\t");
              _builder_2.append(")");
              _builder_2.newLineIfNotEmpty();
              _builder_2.append("\t");
              _builder_2.append("if err != nil {");
              _builder_2.newLine();
              _builder_2.append("\t\t");
              _builder_2.append("panic(\"Not an integer number\")");
              _builder_2.newLine();
              _builder_2.append("\t");
              _builder_2.append("}");
              _builder_2.newLine();
              _builder_2.append("\t");
              _builder_2.append("return o1 ");
              String _operand_1 = ((FuncEqualityTest)item).getOperand();
              _builder_2.append(_operand_1, "\t");
              _builder_2.append(" o2");
              _builder_2.newLineIfNotEmpty();
              _builder_2.append("}()");
              _switchResult_1 = _builder_2;
              break;
          }
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("func ()bool{");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("o1, err := strconv.Atoi(");
          CharSequence _makeCode_4 = this.makeCode(((FuncEqualityTest)item).getOp1());
          _builder_2.append(_makeCode_4, "\t");
          _builder_2.append(")");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("if err != nil {");
          _builder_2.newLine();
          _builder_2.append("\t\t");
          _builder_2.append("panic(\"Not an integer number\")");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("}");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("o2, err := strconv.Atoi(");
          CharSequence _makeCode_5 = this.makeCode(((FuncEqualityTest)item).getOp2());
          _builder_2.append(_makeCode_5, "\t");
          _builder_2.append(")");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("if err != nil {");
          _builder_2.newLine();
          _builder_2.append("\t\t");
          _builder_2.append("panic(\"Not an integer number\")");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("}");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("return o1 ");
          String _operand_1 = ((FuncEqualityTest)item).getOperand();
          _builder_2.append(_operand_1, "\t");
          _builder_2.append(" o2");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("}()");
          _switchResult_1 = _builder_2;
        }
        _switchResult = _switchResult_1;
      }
    }
    return _switchResult;
  }
}
