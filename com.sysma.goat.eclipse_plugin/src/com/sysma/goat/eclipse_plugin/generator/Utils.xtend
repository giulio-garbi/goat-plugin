package com.sysma.goat.eclipse_plugin.generator

import com.sysma.goat.eclipse_plugin.goatComponents.ProcessStatement
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessSpawn
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessCall
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessLoop
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessSend
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessReceive
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessIf
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessSet
import com.sysma.goat.eclipse_plugin.goatComponents.ProcessWaitFor
import java.net.InetAddress
import com.google.common.net.HostAndPort
import java.util.List

class Utils{
	def static getImportPath(){
		'''"github.com/giulio-garbi/goat/goat"'''
	}
	
	def static getCode(ProcessStatement stmt, LocalVariableMap locvars, CharSequence processRef){
		switch(stmt){
			ProcessSpawn:
				new CodeProcessSpawn(stmt, locvars, processRef).code
			ProcessCall:
				new CodeProcessCall(stmt).code
			ProcessLoop:
				new CodeProcessLoop(stmt, locvars, processRef).code
			ProcessSend:
				new CodeProcessSend(stmt, locvars, processRef).code
			ProcessReceive:
				new CodeProcessReceive(stmt, locvars, processRef).code
			ProcessIf:
				new CodeProcessIf(stmt, locvars, processRef).code
			ProcessSet:
				new CodeProcessSet(stmt, locvars, processRef).code
			ProcessWaitFor:
				new CodeProcessWaitFor(stmt, locvars, processRef).code
			default:
				throw new UnsupportedOperationException("not implemented")
		}
	}
	
	def static utilityFunctions(){
		'''
		
		func unroll(items ...interface{}) []continuationProcess {
			if len(items) == 0 {
				return []continuationProcess{}
			} else if len(items) == 1 {
			    if x, isElem := items[0].(continuationProcess); isElem {
			        return []continuationProcess{x}
			    } else if x, isElem := items[0].(func(*sync.WaitGroup, *map[string]interface{}, *goat.Process) continuationProcess); isElem {
					return []continuationProcess{x}
				} else if x, isV := items[0].([]continuationProcess); isV {
				xv := make([]interface{}, len(x))
				for i, v := range(x) {
					xv[i] = v
				}
			        return unroll(xv...)
			    } else {
			        panic(".")
			    }
			} else {
			    out := []continuationProcess{}
			    for _, itI := range items {
				    out = append(out, unroll(itI)...)
				}
				return out
			}
		}
		
		func runWith(wg *sync.WaitGroup, vars *map[string]interface{}, pfuncs ...continuationProcess) []func(*goat.Process){
		    wg.Add(len(pfuncs))
		    funcs := make([]func(*goat.Process), len(pfuncs))
		    for i, pfunc := range pfuncs {
				funcs[i] = func(w *sync.WaitGroup, v *map[string]interface{}, pf continuationProcess) func(p *goat.Process) {
					return func(p *goat.Process){
						for fnc := pf; fnc != nil; fnc = fnc(w, v, p) {}
						w.Done()
					}
				}(wg, mapCopy(vars), pfunc)
			}
			return funcs
		}
		
		func mapCopy(x *map[string]interface{}) *map[string]interface{}{
			cx := map[string]interface{}{}
			for k,v := range *x {
				cx[k] = v
			}
			return &cx
		}
		
		func getValue(x *map[string]interface{}, k string) interface{}{
			v, _ := (*x)[k]
			return v
		}
		
		func has(x *map[string]interface{}, k string) bool{
			_, h := (*x)[k]
			return h
		}
		
		func cast_int(x interface{}) int {
			return x.(int)
		}
		
		func cast_string(x interface{}) string {
			return x.(string)
		}
		
		func cast_bool(x interface{}) bool {
			return x.(bool)
		}
		
		func cast_tuple(x interface{}) goat.Tuple {
			return x.(goat.Tuple)
		}
		
		func cast_tuple_ptr(x interface{}) *goat.Tuple {
			return x.(*goat.Tuple)
		}
		'''
	}
	
	def static isLocalAddress(String address){
		val ad = InetAddress.getByName(HostAndPort.fromString(address).host)
		ad.isLoopbackAddress
	}
	
	def static getPortNumber(String address){
		HostAndPort.fromString(address).port
	}
	
	def static goList(List<String> strings){
		'''[]string{«strings.map['''"«it»"'''].join(", ")»}'''
	}
}