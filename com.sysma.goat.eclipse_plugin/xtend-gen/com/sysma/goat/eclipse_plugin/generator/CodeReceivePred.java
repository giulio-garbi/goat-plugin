package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.generator.CodeValue;
import com.sysma.goat.eclipse_plugin.goatComponents.And;
import com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest;
import com.sysma.goat.eclipse_plugin.goatComponents.Immediate;
import com.sysma.goat.eclipse_plugin.goatComponents.Not;
import com.sysma.goat.eclipse_plugin.goatComponents.Pred;
import com.sysma.goat.eclipse_plugin.goatComponents.Predicate;
import com.sysma.goat.eclipse_plugin.goatComponents.Value;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CodeReceivePred extends CodeTree {
  private final Pred pred;
  
  private final String componentAttributes;
  
  private final String localAttributes;
  
  public CodeReceivePred(final Pred pred, final String componentAttributes, final String localAttributes) {
    this.pred = pred;
    this.componentAttributes = componentAttributes;
    this.localAttributes = localAttributes;
  }
  
  @Override
  public CharSequence getCode() {
    return this.toCode(this.pred);
  }
  
  private static CharSequence castToInt(final CharSequence xCode) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("func()int {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("x, err := strconv.Atoi(");
    _builder.append(xCode, "\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if err != nil {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("panic(\"Inequalities expect integers\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return x");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}()");
    return _builder;
  }
  
  private String toCode(final Pred pred) {
    String _switchResult = null;
    boolean _matched = false;
    if (pred instanceof Predicate) {
      _matched=true;
      final Function1<Pred, String> _function = (Pred it) -> {
        String _code = this.toCode(it);
        String _plus = ("(" + _code);
        return (_plus + ")");
      };
      _switchResult = String.join(" || ", ListExtensions.<Pred, String>map(((Predicate)pred).getOr(), _function));
    }
    if (!_matched) {
      if (pred instanceof And) {
        _matched=true;
        final Function1<Pred, String> _function = (Pred it) -> {
          String _code = this.toCode(it);
          String _plus = ("(" + _code);
          return (_plus + ")");
        };
        _switchResult = String.join(" && ", ListExtensions.<Pred, String>map(((And)pred).getAnd(), _function));
      }
    }
    if (!_matched) {
      if (pred instanceof Not) {
        _matched=true;
        String _xifexpression = null;
        boolean _isNeg = ((Not)pred).isNeg();
        if (_isNeg) {
          String _code = this.toCode(((Not)pred).getTerm());
          String _plus = ("!(" + _code);
          _xifexpression = (_plus + ")");
        } else {
          _xifexpression = this.toCode(((Not)pred).getTerm());
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (pred instanceof Immediate) {
        _matched=true;
        String _xifexpression = null;
        boolean _isIsTrue = ((Immediate)pred).isIsTrue();
        if (_isIsTrue) {
          _xifexpression = "true";
        } else {
          _xifexpression = "false";
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (pred instanceof EqualityTest) {
        _matched=true;
        String _xblockexpression = null;
        {
          EObject _op1 = ((EqualityTest)pred).getOp1();
          final CharSequence op1Code = new CodeValue(((Value) _op1), this.componentAttributes, this.localAttributes).getCode();
          Value _op2 = ((EqualityTest)pred).getOp2();
          final CharSequence op2Code = new CodeValue(_op2, this.componentAttributes, this.localAttributes).getCode();
          String _switchResult_1 = null;
          String _operand = ((EqualityTest)pred).getOperand();
          if (_operand != null) {
            switch (_operand) {
              case "=":
                String _plus = (op1Code + " == ");
                _switchResult_1 = (_plus + op2Code);
                break;
              case "!=":
                String _plus_1 = (op1Code + " != ");
                _switchResult_1 = (_plus_1 + op2Code);
                break;
              case "<":
              case ">":
              case "<=":
              case ">=":
                CharSequence _castToInt = CodeReceivePred.castToInt(op1Code);
                String _plus_2 = (_castToInt + " ");
                String _operand_1 = ((EqualityTest)pred).getOperand();
                String _plus_3 = (_plus_2 + _operand_1);
                String _plus_4 = (_plus_3 + " ");
                CharSequence _castToInt_1 = CodeReceivePred.castToInt(op2Code);
                _switchResult_1 = (_plus_4 + _castToInt_1);
                break;
              default:
                _switchResult_1 = "@ERR@";
                break;
            }
          } else {
            _switchResult_1 = "@ERR@";
          }
          _xblockexpression = _switchResult_1;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      _switchResult = "@ERR@";
    }
    return _switchResult;
  }
}
