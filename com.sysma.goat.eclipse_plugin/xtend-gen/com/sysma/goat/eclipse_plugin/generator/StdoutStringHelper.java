package com.sysma.goat.eclipse_plugin.generator;

import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class StdoutStringHelper {
  private static String escape(final String escapedSequence, final String componentAttr, final String localAttr) {
    int _length = escapedSequence.length();
    boolean _equals = (_length == 0);
    if (_equals) {
      return "\"$\"";
    } else {
      boolean _startsWith = escapedSequence.startsWith("this.");
      if (_startsWith) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(componentAttr);
        _builder.append(".GetValue(\"");
        String _substring = escapedSequence.substring(5);
        _builder.append(_substring);
        _builder.append("\")");
        return _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(localAttr);
        _builder_1.append("[\"");
        _builder_1.append(escapedSequence);
        _builder_1.append("\"]");
        return _builder_1.toString();
      }
    }
  }
  
  public static String convertString(final String text, final String componentAttr, final String localAttr) {
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
          outTokens.add(StdoutStringHelper.escape(escapedSequence, componentAttr, localAttr));
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
      outTokens.add(StdoutStringHelper.escape(escapedSequence, componentAttr, localAttr));
    }
    return String.join(" + ", outTokens);
  }
}
