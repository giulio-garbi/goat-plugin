package com.sysma.goat.eclipse_plugin.tests.generator

import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import java.util.List
import com.google.inject.Inject
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import com.sysma.goat.eclipse_plugin.goatComponents.Model
import org.eclipse.xtext.testing.util.ParseHelper
import com.sysma.goat.eclipse_plugin.generator.CodeModel
import com.google.common.io.Files
import java.io.File
import java.io.InputStreamReader
import com.google.common.io.CharStreams
import com.google.common.base.Charsets

@InjectWith(GoatComponentsInjectorProvider)
class GeneratorTestHelper {
    @Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	static class GoCompilerErrorsException extends Exception{
		new(String file, List<String> issues){
			super("Errors while compiling: "+file+"\n"+issues.join("\n"))
		}
	}
	
	static class GoRunErrorsException extends Exception{
		new(String file){
			super("Errors while running "+file)
		}
	}
	
	def void compileAndRun(CharSequence goatCode, (String,String)=>void acceptor){
		// compile to Go
		val model = goatCode.parse
		model.assertNoErrors
		val code = new CodeModel(model).getTestCode(100)
		val dir = Files.createTempDir
		val gofile = new File(dir, "code.go")
		Files.write(code.toString.getBytes, gofile)
		
		// compile Go code to executable
		val exefile = new File(dir, "code")
		val goCompiler = new ProcessBuilder("go","build","-o",exefile.path,gofile.path)
		val goCompilerProcess = goCompiler.start
		for (var quit = false; !quit;) {
			try{
				if(goCompilerProcess.waitFor != 0){
					throw new GoCompilerErrorsException(gofile.path, CharStreams.readLines(new InputStreamReader(goCompilerProcess.errorStream)))
				} 
				quit = true
			} catch (InterruptedException x){}
		}
		exefile.executable = true
		
		val goRun = new ProcessBuilder(exefile.path)
		val outfile = new File(dir, "out.txt")
		val errfile = new File(dir, "err.txt")
		goRun.redirectError(errfile)
		goRun.redirectOutput(outfile)
		val goRunProcess = goRun.start
		for (var quit = false; !quit;) {
			try{
				if(goRunProcess.waitFor != 0){
					throw new GoRunErrorsException(gofile.path)
				} 
				quit = true
			} catch (InterruptedException x){}
		}
		
		acceptor.apply(Files.toString(outfile, Charsets.UTF_8),Files.toString(errfile, Charsets.UTF_8))
		
		gofile.delete
		exefile.delete
		errfile.delete
		outfile.delete
		dir.delete
	}
}