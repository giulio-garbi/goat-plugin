package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.ParamsToMap;
import com.sysma.goat.eclipse_plugin.goatInfrastructure.Infrastructure;
import com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeInfrastructureAgent {
  private final Infrastructure infr;
  
  public CodeInfrastructureAgent(final Infrastructure infr) {
    this.infr = infr;
  }
  
  public CharSequence getCode() {
    CharSequence _switchResult = null;
    final Infrastructure infr = this.infr;
    boolean _matched = false;
    if (infr instanceof SingleServer) {
      _matched=true;
      CharSequence _xblockexpression = null;
      {
        final Map<String, String> params = ParamsToMap.of(((SingleServer)this.infr).getParams());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("127.0.0.1:");
        String _get = params.get("port");
        _builder.append(_get);
        final String address = _builder.toString();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("goat.NewSingleServerAgent(\"");
        _builder_1.append(address);
        _builder_1.append("\")");
        _xblockexpression = _builder_1;
      }
      _switchResult = _xblockexpression;
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
}
