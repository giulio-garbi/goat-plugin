package com.sysma.goat.eclipse_plugin.validation;

import com.sysma.goat.eclipse_plugin.goatComponents.FuncBlock;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncIfElse;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncReturn;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncStatement;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarAssign;
import com.sysma.goat.eclipse_plugin.goatComponents.FuncVarDeclaration;
import com.sysma.goat.eclipse_plugin.goatComponents.GoStringFunction;
import com.sysma.goat.eclipse_plugin.goatComponents.GoatComponentsPackage;
import com.sysma.goat.eclipse_plugin.validation.AbstractGoatComponentsValidator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FunctionValidator extends AbstractGoatComponentsValidator {
  @Check
  public void checkCallArgumentsCount(final GoStringFunction call) {
    if ((((call.getFuncname() != null) && (call.getParams() != null)) && 
      (((Object[])Conversions.unwrapArray(call.getParams(), Object.class)).length != ((Object[])Conversions.unwrapArray(call.getFuncname().getParams(), Object.class)).length))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("A call to ");
      String _name = call.getFuncname().getName();
      _builder.append(_name);
      _builder.append(" expects ");
      int _length = ((Object[])Conversions.unwrapArray(call.getFuncname().getParams(), Object.class)).length;
      _builder.append(_length);
      _builder.append(" arguments");
      this.error(_builder.toString(), 
        GoatComponentsPackage.eINSTANCE.getGoStringFunction_Params());
    }
  }
  
  @Check
  public void checkMustReturn(final FuncDefinition fdef) {
    boolean _isAlwaysReturning = this.isAlwaysReturning(fdef);
    boolean _not = (!_isAlwaysReturning);
    if (_not) {
      this.error("Functions must always return a string", 
        GoatComponentsPackage.eINSTANCE.getFuncDefinition_Blk());
    }
  }
  
  public boolean isAlwaysReturning(final Object x) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (x instanceof FuncDefinition) {
      _matched=true;
      _switchResult = this.isAlwaysReturning(((FuncDefinition)x).getBlk());
    }
    if (!_matched) {
      if (x instanceof FuncBlock) {
        _matched=true;
        final Function1<FuncStatement, Boolean> _function = (FuncStatement it) -> {
          return Boolean.valueOf(this.isAlwaysReturning(it));
        };
        _switchResult = IterableExtensions.<FuncStatement>exists(((FuncBlock)x).getStatements(), _function);
      }
    }
    if (!_matched) {
      if (x instanceof FuncVarDeclaration) {
        _matched=true;
      }
      if (!_matched) {
        if (x instanceof FuncVarAssign) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = false;
      }
    }
    if (!_matched) {
      if (x instanceof FuncIfElse) {
        _matched=true;
        _switchResult = (IterableExtensions.<FuncBlock>forall(((FuncIfElse)x).getThen(), ((Function1<FuncBlock, Boolean>) (FuncBlock it) -> {
          return Boolean.valueOf(this.isAlwaysReturning(it));
        })) && ((((FuncIfElse)x).getElseBranch() != null) && 
          this.isAlwaysReturning(((FuncIfElse)x).getElseBranch())));
      }
    }
    if (!_matched) {
      if (x instanceof FuncReturn) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
}
