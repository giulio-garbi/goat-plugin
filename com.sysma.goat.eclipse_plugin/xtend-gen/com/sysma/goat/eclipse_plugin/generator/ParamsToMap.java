package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.goatInfrastructure.Params;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public final class ParamsToMap {
  public static Map<String, String> of(final Params p) {
    int _length = ((Object[])Conversions.unwrapArray(p.getKeys(), Object.class)).length;
    final ExclusiveRange idxs = new ExclusiveRange(0, _length, true);
    final Function1<Integer, String> _function = (Integer it) -> {
      return p.getKeys().get((it).intValue());
    };
    final Function1<Integer, String> _function_1 = (Integer it) -> {
      return p.getValues().get((it).intValue());
    };
    return IterableExtensions.<Integer, String, String>toMap(idxs, _function, _function_1);
  }
}
