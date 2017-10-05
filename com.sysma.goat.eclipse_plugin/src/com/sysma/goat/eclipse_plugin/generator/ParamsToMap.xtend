package com.sysma.goat.eclipse_plugin.generator

import java.util.Map
import com.sysma.goat.eclipse_plugin.goatInfrastructure.Param
import java.util.List

final class ParamsToMap {
	def static Map<String, String> of(List<Param> p){
		return p.toMap([it.name],[it.value]);
	}
}