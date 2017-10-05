package com.sysma.goat.eclipse_plugin.generator

import java.util.Map
import com.sysma.goat.eclipse_plugin.goatInfrastructure.SingleServer

class CodeSingleServer {
	val SingleServer ssrv;
	val Map<String, String> params;
	
	new(SingleServer ssrv){
		this.ssrv = ssrv
		this.params = ParamsToMap.of(ssrv.params)
	}
	
	def getCode(){
		val timeout = params.get('timeout')?:0;
		'''
			package main
			import (
				"github.com/giulio-garbi/goat/goat"
				"fmt"
			)
			
			func main(){
				«/*IF !ssrv.external*/»
				term := make(chan struct{})
				goat.RunCentralServer(«params.get('port')», term, «timeout»)
				fmt.Println("Started")
				<- term
				fmt.Println("Terminated")
				«/*ENDIF*/»
			}
		'''
	}
	
	def String getServerAddress(){
		//if (ssrv.external) {
		//	params.get('address')
		//} else {
			"127.0.0.1:"+params.get('port')
		//}
	}
}