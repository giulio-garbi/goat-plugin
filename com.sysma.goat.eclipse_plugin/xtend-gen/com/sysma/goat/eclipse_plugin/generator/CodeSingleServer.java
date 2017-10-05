package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.ParamsToMap;
import com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeSingleServer {
  private final SingleServer ssrv;
  
  private final Map<String, String> params;
  
  public CodeSingleServer(final SingleServer ssrv) {
    this.ssrv = ssrv;
    this.params = ParamsToMap.of(ssrv.getParams());
  }
  
  public CharSequence getCode() {
    CharSequence _xblockexpression = null;
    {
      Object _elvis = null;
      String _get = this.params.get("timeout");
      if (_get != null) {
        _elvis = _get;
      } else {
        _elvis = Integer.valueOf(0);
      }
      final Object timeout = ((Object)_elvis);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package main");
      _builder.newLine();
      _builder.append("import (");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"github.com/giulio-garbi/goat/goat\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"fmt\"");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      _builder.newLine();
      _builder.append("func main(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("term := make(chan struct{})");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("goat.RunCentralServer(");
      String _get_1 = this.params.get("port");
      _builder.append(_get_1, "\t");
      _builder.append(", term, ");
      _builder.append(((Object)timeout), "\t");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("fmt.Println(\"Started\")");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<- term");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("fmt.Println(\"Terminated\")");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String getServerAddress() {
    String _get = this.params.get("port");
    return ("127.0.0.1:" + _get);
  }
}
