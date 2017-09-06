package com.sysma.goat.eclipse_plugin.generator

import java.util.Map
import com.sysma.goat.eclipse_plugin.goatInfrastructure.Params

final class ParamsToMap {
	def static Map<String, String> of(Params p){
		val idxs = 0..<p.keys.length
		return idxs.toMap([p.keys.get(it)],[p.values.get(it)]);
	}
}