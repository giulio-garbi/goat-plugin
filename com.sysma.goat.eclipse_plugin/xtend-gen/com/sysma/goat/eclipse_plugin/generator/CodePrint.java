package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeAttribute;
import com.sysma.goat.eclipse_plugin.generator.CodeProcessDefinition;
import com.sysma.goat.eclipse_plugin.goatComponents.AttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.PrintFormattedStatement;
import com.sysma.goat.eclipse_plugin.goatComponents.PrintStatement;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.math.NumberUtils;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class CodePrint {
  public static CharSequence of(final PrintStatement pstat, final String componentAttr, final String localAttr, final List<AttributeToSet> message) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (pstat instanceof PrintFormattedStatement) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("fmt.Println(");
      String _convertString = CodePrint.convertString(((PrintFormattedStatement)pstat).getToPrint(), componentAttr, CodeProcessDefinition.getLocalVariablesMap(), message);
      _builder.append(_convertString);
      _builder.append(")");
      _switchResult = _builder;
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  private static String escape(final String escapedSequence, final String componentAttr, final String localAttr, final List<AttributeToSet> message) {
    int _length = escapedSequence.length();
    boolean _equals = (_length == 0);
    if (_equals) {
      return "\"$\"";
    } else {
      boolean _isDigits = NumberUtils.isDigits(escapedSequence);
      if (_isDigits) {
        final int tupleIdx = Integer.parseInt(escapedSequence);
        int _length_1 = ((Object[])Conversions.unwrapArray(message, Object.class)).length;
        boolean _greaterEqualsThan = (tupleIdx >= _length_1);
        if (_greaterEqualsThan) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\"<invalid tuple index>\"");
          return _builder.toString();
        } else {
          AttributeToSet _get = message.get(tupleIdx);
          final CodeAttribute attribCode = new CodeAttribute(_get, componentAttr, localAttr);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("fmt.Sprintf(\"%s: %v\",\"");
          CharSequence _name = attribCode.getName();
          _builder_1.append(_name);
          _builder_1.append("\", ");
          CharSequence _read = attribCode.read();
          _builder_1.append(_read);
          return _builder_1.toString();
        }
      } else {
        String attrName = "";
        boolean compLevel = false;
        boolean _startsWith = escapedSequence.startsWith("this.");
        if (_startsWith) {
          compLevel = true;
          attrName = escapedSequence.substring(5);
        } else {
          compLevel = false;
          attrName = escapedSequence;
        }
        final CodeAttribute attribCode_1 = new CodeAttribute(attrName, compLevel, componentAttr, localAttr);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("fmt.Sprintf(\"%v\",");
        CharSequence _read_1 = attribCode_1.read();
        _builder_2.append(_read_1);
        _builder_2.append(")");
        return _builder_2.toString();
      }
    }
  }
  
  private static String convertString(final String text, final String componentAttr, final String localAttr, final List<AttributeToSet> message) {
    ArrayList<String> outTokens = new ArrayList<String>();
    String escapedSequence = null;
    String actualString = "";
    char[] _charArray = text.toCharArray();
    for (final char ch : _charArray) {
      char _charAt = "$".charAt(0);
      boolean _equals = (ch == _charAt);
      if (_equals) {
        if ((escapedSequence == null)) {
          escapedSequence = "";
          outTokens.add((("\"" + actualString) + "\""));
        } else {
          outTokens.add(CodePrint.escape(escapedSequence, componentAttr, localAttr, message));
          escapedSequence = null;
        }
        actualString = "";
      } else {
        if ((escapedSequence == null)) {
          String _actualString = actualString;
          actualString = (_actualString + Character.valueOf(ch));
        } else {
          String _escapedSequence = escapedSequence;
          escapedSequence = (_escapedSequence + Character.valueOf(ch));
        }
      }
    }
    if ((escapedSequence == null)) {
      outTokens.add((("\"" + actualString) + "\""));
    } else {
      outTokens.add(CodePrint.escape(escapedSequence, componentAttr, localAttr, message));
    }
    return String.join(" + ", outTokens);
  }
}
