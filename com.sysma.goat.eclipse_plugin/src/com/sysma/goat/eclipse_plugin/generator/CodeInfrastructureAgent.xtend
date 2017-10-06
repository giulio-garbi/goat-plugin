package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatInfrastructure.Infrastructure
import com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer

class CodeInfrastructureAgent {
	val Infrastructure infr
	
	new (Infrastructure infr){
		this.infr = infr
	}
	
	def getCode(){
		switch(infr){
			SingleServer:{
				val params = ParamsToMap.of(infr.params)
				//TODO support external infrastructures
				val address = '''127.0.0.1:«params.get("port")»'''
				'''goat.NewSingleServerAgent("«address»")'''
			}
			default:
				""
		}
	}
}