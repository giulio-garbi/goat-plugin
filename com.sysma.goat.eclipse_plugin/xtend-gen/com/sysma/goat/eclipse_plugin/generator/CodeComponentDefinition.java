package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeExpression;
import com.sysma.goat.eclipse_plugin.generator.CodeInfrastructureAgent;
import com.sysma.goat.eclipse_plugin.generator.CodeProcessBlock;
import com.sysma.goat.eclipse_plugin.generator.LocalVariableMap;
import com.sysma.goat.eclipse_plugin.goatComponents.ComponentDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessBlock;
import com.sysma.goat.eclipse_plugin.goatInfrastructure.Infrastructure;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class CodeComponentDefinition {
  private final ComponentDefinition cdef;
  
  private final CharSequence mainFunc;
  
  private final CharSequence compName;
  
  public CodeComponentDefinition(final ComponentDefinition cdef, final CharSequence runFunc, final CharSequence compName) {
    this.cdef = cdef;
    this.mainFunc = runFunc;
    this.compName = compName;
  }
  
  public CharSequence getComponentDeclaration(final Infrastructure infr) {
    CharSequence _xblockexpression = null;
    {
      final CharSequence infrCode = new CodeInfrastructureAgent(infr).getCode();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.compName);
      _builder.append(" := goat.NewComponentWithAttributes(");
      _builder.append(infrCode);
      _builder.append(",  map[string]interface{}{");
      _builder.newLineIfNotEmpty();
      {
        int _length = ((Object[])Conversions.unwrapArray(this.cdef.getEnv().getAttrs(), Object.class)).length;
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
        for(final Integer i : _doubleDotLessThan) {
          _builder.append("\t");
          _builder.append("\"");
          String _get = this.cdef.getEnv().getAttrs().get((i).intValue());
          _builder.append(_get, "\t");
          _builder.append("\" : ");
          CharSequence _expressionWithoutAttributes = CodeExpression.getExpressionWithoutAttributes(this.cdef.getEnv().getVals().get((i).intValue()));
          _builder.append(_expressionWithoutAttributes, "\t");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("})");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence getCode() {
    CharSequence _xblockexpression = null;
    {
      ProcessBlock _block = this.cdef.getBlock();
      LocalVariableMap _localVariableMap = new LocalVariableMap("locvar");
      final CharSequence fncCode = new CodeProcessBlock(_block, _localVariableMap, "p").getCodeAsFunction();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("goat.NewProcess(");
      _builder.append(this.compName);
      _builder.append(").Run(");
      _builder.append(this.mainFunc);
      _builder.append("(&wg, ");
      _builder.append(fncCode);
      _builder.append(", &(map[string]interface{}{})))");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
