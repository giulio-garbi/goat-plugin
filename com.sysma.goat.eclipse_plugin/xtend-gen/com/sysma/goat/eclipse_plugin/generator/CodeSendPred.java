package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeTree;
import com.sysma.goat.eclipse_plugin.generator.CodeValue;
import com.sysma.goat.eclipse_plugin.goatComponents.And;
import com.sysma.goat.eclipse_plugin.goatComponents.EqualityTest;
import com.sysma.goat.eclipse_plugin.goatComponents.Immediate;
import com.sysma.goat.eclipse_plugin.goatComponents.Not;
import com.sysma.goat.eclipse_plugin.goatComponents.Pred;
import com.sysma.goat.eclipse_plugin.goatComponents.Predicate;
import com.sysma.goat.eclipse_plugin.goatComponents.RecAttribute;
import com.sysma.goat.eclipse_plugin.goatComponents.Value;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CodeSendPred extends CodeTree {
  private final Pred pred;
  
  private final String localAttributes;
  
  public CodeSendPred(final Pred pred, final String localAttributes) {
    this.pred = pred;
    this.localAttributes = localAttributes;
  }
  
  @Override
  public CharSequence getCode() {
    return this.toCode(this.pred);
  }
  
  private String toCode(final Pred pred) {
    String _switchResult = null;
    boolean _matched = false;
    if (pred instanceof Predicate) {
      _matched=true;
      String _xblockexpression = null;
      {
        final Function1<Pred, String> _function = (Pred it) -> {
          return this.toCode(it);
        };
        final List<String> codedOr = ListExtensions.<Pred, String>map(((Predicate)pred).getOr(), _function);
        String _xifexpression = null;
        int _length = ((Object[])Conversions.unwrapArray(codedOr, Object.class)).length;
        boolean _greaterThan = (_length > 1);
        if (_greaterThan) {
          String _xblockexpression_1 = null;
          {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("goat.Or{");
            String _get = codedOr.get(0);
            _builder.append(_get);
            _builder.append(", ");
            String _get_1 = codedOr.get(1);
            _builder.append(_get_1);
            _builder.append("}");
            String orCode = _builder.toString();
            Iterable<String> _tail = IterableExtensions.<String>tail(IterableExtensions.<String>tail(codedOr));
            for (final String corPart : _tail) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("goat.Or{");
              _builder_1.append(orCode);
              _builder_1.append(", ");
              _builder_1.append(corPart);
              _builder_1.append("}");
              orCode = _builder_1.toString();
            }
            _xblockexpression_1 = orCode;
          }
          _xifexpression = _xblockexpression_1;
        } else {
          _xifexpression = codedOr.get(0);
        }
        _xblockexpression = _xifexpression;
      }
      _switchResult = _xblockexpression;
    }
    if (!_matched) {
      if (pred instanceof And) {
        _matched=true;
        String _xblockexpression = null;
        {
          final Function1<Pred, String> _function = (Pred it) -> {
            return this.toCode(it);
          };
          final List<String> codedAnd = ListExtensions.<Pred, String>map(((And)pred).getAnd(), _function);
          String _xifexpression = null;
          int _length = ((Object[])Conversions.unwrapArray(codedAnd, Object.class)).length;
          boolean _greaterThan = (_length > 1);
          if (_greaterThan) {
            String _xblockexpression_1 = null;
            {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("goat.And{");
              String _get = codedAnd.get(0);
              _builder.append(_get);
              _builder.append(", ");
              String _get_1 = codedAnd.get(1);
              _builder.append(_get_1);
              _builder.append("}");
              String andCode = _builder.toString();
              Iterable<String> _tail = IterableExtensions.<String>tail(IterableExtensions.<String>tail(codedAnd));
              for (final String candPart : _tail) {
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("goat.And{");
                _builder_1.append(andCode);
                _builder_1.append(", ");
                _builder_1.append(candPart);
                _builder_1.append("}");
                andCode = _builder_1.toString();
              }
              _xblockexpression_1 = andCode;
            }
            _xifexpression = _xblockexpression_1;
          } else {
            _xifexpression = codedAnd.get(0);
          }
          _xblockexpression = _xifexpression;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (pred instanceof Not) {
        _matched=true;
        String _xifexpression = null;
        boolean _isNeg = ((Not)pred).isNeg();
        if (_isNeg) {
          String _code = this.toCode(((Not)pred).getTerm());
          String _plus = ("goat.Not{" + _code);
          _xifexpression = (_plus + "}");
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
          _xifexpression = "goat.True{}";
        } else {
          _xifexpression = "goat.False{}";
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
          String op1 = ((RecAttribute) _op1).getIdent();
          Value _op2 = ((EqualityTest)pred).getOp2();
          CharSequence op2 = new CodeValue(_op2, "@ERR@", this.localAttributes).getCode();
          String _switchResult_1 = null;
          String _operand = ((EqualityTest)pred).getOperand();
          if (_operand != null) {
            switch (_operand) {
              case "=":
                _switchResult_1 = "Equal";
                break;
              case "!=":
                _switchResult_1 = "NotEqual";
                break;
              case "<":
                _switchResult_1 = "Lower";
                break;
              case "<=":
                _switchResult_1 = "LowerEqual";
                break;
              case ">":
                _switchResult_1 = "Greater";
                break;
              case ">=":
                _switchResult_1 = "GreaterImm";
                break;
            }
          }
          final String opName = _switchResult_1;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("goat.");
          _builder.append(opName);
          _builder.append("Imm{\"");
          _builder.append(op1);
          _builder.append("\", ");
          _builder.append(op2);
          _builder.append("}");
          _xblockexpression = _builder.toString();
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
