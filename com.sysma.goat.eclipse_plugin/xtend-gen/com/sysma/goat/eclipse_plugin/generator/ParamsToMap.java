package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.goatInfrastructure.Param;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public final class ParamsToMap {
  public static Map<String, String> of(final List<Param> p) {
    final Function1<Param, String> _function = (Param it) -> {
      return it.getName();
    };
    final Function1<Param, String> _function_1 = (Param it) -> {
      return it.getValue();
    };
    return IterableExtensions.<Param, String, String>toMap(p, _function, _function_1);
  }
}
