package com.sysma.goat.eclipse_plugin.validation;

import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.goatComponents.And;
import com.sysma.goat.eclipse_plugin.goatComponents.Awareness;
import com.sysma.goat.eclipse_plugin.goatComponents.Comparison;
import com.sysma.goat.eclipse_plugin.goatComponents.Concatenate;
import com.sysma.goat.eclipse_plugin.goatComponents.Equality;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncParam;
import com.sysma.goat.eclipse_plugin.goatComponents.FunctionCall;
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage;
import com.sysma.goat.eclipse_plugin.goatComponents.InputProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.Minus;
import com.sysma.goat.eclipse_plugin.goatComponents.MulOrDiv;
import com.sysma.goat.eclipse_plugin.goatComponents.Not;
import com.sysma.goat.eclipse_plugin.goatComponents.Or;
import com.sysma.goat.eclipse_plugin.goatComponents.OutputProcess;
import com.sysma.goat.eclipse_plugin.goatComponents.Plus;
import com.sysma.goat.eclipse_plugin.typing.ExpressionTyping;
import com.sysma.goat.eclipse_plugin.validation.AbstractGoatComponentsValidator;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ExpressionTypingValidator extends AbstractGoatComponentsValidator {
  @Inject
  @Override
  public void register(final EValidatorRegistrar registrar) {
  }
  
  private void expectedType(final Expression expr, final ExpressionTyping.ExprType typ, final EReference at) {
    boolean _matchable = ExpressionTyping.matchable(ExpressionTyping.typeOf(expr), typ);
    boolean _not = (!_matchable);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Expected a ");
      String _goType = ExpressionTyping.goType(typ);
      _builder.append(_goType);
      _builder.append(" expression");
      this.error(_builder.toString(), at);
    }
  }
  
  private boolean expected2Types(final Expression expr, final ExpressionTyping.ExprType typ, final ExpressionTyping.ExprType typ2, final EReference at) {
    boolean _xifexpression = false;
    if (((!ExpressionTyping.matchable(ExpressionTyping.typeOf(expr), typ)) && (!ExpressionTyping.matchable(ExpressionTyping.typeOf(expr), typ2)))) {
      boolean _xblockexpression = false;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Expected a ");
        String _goType = ExpressionTyping.goType(typ);
        _builder.append(_goType);
        _builder.append(" or ");
        String _goType_1 = ExpressionTyping.goType(typ2);
        _builder.append(_goType_1);
        _builder.append(" expression");
        this.error(_builder.toString(), at);
        _xblockexpression = true;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = false;
    }
    return _xifexpression;
  }
  
  private void sameType(final Expression expr1, final Expression expr2, final EReference at2) {
    final ExpressionTyping.ExprType type1 = ExpressionTyping.typeOf(expr1);
    final ExpressionTyping.ExprType type2 = ExpressionTyping.typeOf(expr2);
    boolean _matchable = ExpressionTyping.matchable(type1, type2);
    boolean _not = (!_matchable);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Expected a ");
      String _goType = ExpressionTyping.goType(type1);
      _builder.append(_goType);
      _builder.append(" expression");
      this.error(_builder.toString(), at2);
    }
  }
  
  @Check
  public void checkTypeReceivePredicate(final InputProcess iproc) {
    this.expectedType(iproc.getRec_pred(), ExpressionTyping.ExprType.BOOL, GoatComponentsPackage.eINSTANCE.getInputProcess_Rec_pred());
  }
  
  @Check
  public void checkTypeSendPredicate(final OutputProcess oproc) {
    this.expectedType(oproc.getSend_pred(), ExpressionTyping.ExprType.BOOL, GoatComponentsPackage.eINSTANCE.getOutputProcessPart_Send_pred());
  }
  
  @Check
  public void checkTypeAwareness(final Awareness awr) {
    this.expectedType(awr.getPred(), ExpressionTyping.ExprType.BOOL, GoatComponentsPackage.eINSTANCE.getAwareness_Pred());
  }
  
  @Check
  public Object checkTypes(final Expression expr) {
    Object _switchResult = null;
    boolean _matched = false;
    if (expr instanceof And) {
      _matched=true;
      this.expectedType(((And)expr).getLeft(), ExpressionTyping.ExprType.BOOL, GoatComponentsPackage.eINSTANCE.getAnd_Left());
      this.expectedType(((And)expr).getRight(), ExpressionTyping.ExprType.BOOL, GoatComponentsPackage.eINSTANCE.getAnd_Right());
    }
    if (!_matched) {
      if (expr instanceof Or) {
        _matched=true;
        this.expectedType(((Or)expr).getLeft(), ExpressionTyping.ExprType.BOOL, GoatComponentsPackage.eINSTANCE.getOr_Left());
        this.expectedType(((Or)expr).getRight(), ExpressionTyping.ExprType.BOOL, GoatComponentsPackage.eINSTANCE.getOr_Right());
      }
    }
    if (!_matched) {
      if (expr instanceof Not) {
        _matched=true;
        this.expectedType(((Not)expr).getExpression(), ExpressionTyping.ExprType.BOOL, GoatComponentsPackage.eINSTANCE.getNot_Expression());
      }
    }
    if (!_matched) {
      if (expr instanceof Equality) {
        _matched=true;
        this.sameType(((Equality)expr).getLeft(), ((Equality)expr).getRight(), GoatComponentsPackage.eINSTANCE.getEquality_Right());
      }
    }
    if (!_matched) {
      if (expr instanceof Comparison) {
        _matched=true;
        final boolean errL = this.expected2Types(((Comparison)expr).getLeft(), ExpressionTyping.ExprType.INT, ExpressionTyping.ExprType.STRING, GoatComponentsPackage.eINSTANCE.getComparison_Left());
        final boolean errR = this.expected2Types(((Comparison)expr).getRight(), ExpressionTyping.ExprType.INT, ExpressionTyping.ExprType.STRING, GoatComponentsPackage.eINSTANCE.getComparison_Right());
        if (((!errL) && (!errR))) {
          this.sameType(((Comparison)expr).getLeft(), ((Comparison)expr).getRight(), GoatComponentsPackage.eINSTANCE.getComparison_Right());
        }
      }
    }
    if (!_matched) {
      if (expr instanceof Plus) {
        _matched=true;
        this.expectedType(((Plus)expr).getLeft(), ExpressionTyping.ExprType.INT, GoatComponentsPackage.eINSTANCE.getPlus_Left());
        this.expectedType(((Plus)expr).getRight(), ExpressionTyping.ExprType.INT, GoatComponentsPackage.eINSTANCE.getPlus_Right());
      }
    }
    if (!_matched) {
      if (expr instanceof Concatenate) {
        _matched=true;
        _switchResult = null;
      }
    }
    if (!_matched) {
      if (expr instanceof Minus) {
        _matched=true;
        this.expectedType(((Minus)expr).getLeft(), ExpressionTyping.ExprType.INT, GoatComponentsPackage.eINSTANCE.getMinus_Left());
        this.expectedType(((Minus)expr).getRight(), ExpressionTyping.ExprType.INT, GoatComponentsPackage.eINSTANCE.getMinus_Right());
      }
    }
    if (!_matched) {
      if (expr instanceof MulOrDiv) {
        _matched=true;
        this.expectedType(((MulOrDiv)expr).getLeft(), ExpressionTyping.ExprType.INT, GoatComponentsPackage.eINSTANCE.getMulOrDiv_Left());
        this.expectedType(((MulOrDiv)expr).getRight(), ExpressionTyping.ExprType.INT, GoatComponentsPackage.eINSTANCE.getMulOrDiv_Right());
      }
    }
    if (!_matched) {
      if (expr instanceof FunctionCall) {
        _matched=true;
        int _length = ((Object[])Conversions.unwrapArray(((FunctionCall)expr).getFunction().getParams(), Object.class)).length;
        int _length_1 = ((Object[])Conversions.unwrapArray(((FunctionCall)expr).getParams(), Object.class)).length;
        boolean okTypes = (_length == _length_1);
        if (okTypes) {
          int _length_2 = ((Object[])Conversions.unwrapArray(((FunctionCall)expr).getParams(), Object.class)).length;
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_2, true);
          for (final Integer i : _doubleDotLessThan) {
            okTypes = (okTypes && ExpressionTyping.matchable(
              ExpressionTyping.typeOf(((FunctionCall)expr).getFunction().getParams().get((i).intValue()).getType()), 
              ExpressionTyping.typeOf(((FunctionCall)expr).getParams().get((i).intValue()))));
          }
        }
        if ((!okTypes)) {
          final Function1<FuncParam, String> _function = (FuncParam it) -> {
            return ExpressionTyping.goType(ExpressionTyping.typeOf(it.getType()));
          };
          final String exp = IterableExtensions.join(ListExtensions.<FuncParam, String>map(((FunctionCall)expr).getFunction().getParams(), _function), ", ");
          final Function1<Expression, String> _function_1 = (Expression it) -> {
            return ExpressionTyping.goType(ExpressionTyping.typeOf(it));
          };
          final String got = IterableExtensions.join(ListExtensions.<Expression, String>map(((FunctionCall)expr).getParams(), _function_1), ", ");
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Expected (");
          _builder.append(exp);
          _builder.append(") as arguments but got (");
          _builder.append(got);
          _builder.append(")");
          this.error(_builder.toString(), GoatComponentsPackage.eINSTANCE.getFunctionCall_Params());
        }
      }
    }
    return _switchResult;
  }
}
