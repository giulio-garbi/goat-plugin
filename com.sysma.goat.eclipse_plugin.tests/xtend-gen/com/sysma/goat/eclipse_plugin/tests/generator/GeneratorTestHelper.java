package com.sysma.goat.eclipse_plugin.tests.generator;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
import com.google.inject.Inject;
import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.goatComponents.Model;
import com.sysma.goat.eclipse_plugin.tests.GoatComponentsInjectorProvider;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@InjectWith(GoatComponentsInjectorProvider.class)
@SuppressWarnings("all")
public class GeneratorTestHelper {
  public static class GoCompilerErrorsException extends Exception {
    public GoCompilerErrorsException(final String file, final List<String> issues) {
      super(((("Errors while compiling: " + file) + "\n") + IterableExtensions.join(issues, "\n")));
    }
  }
  
  public static class GoRunErrorsException extends Exception {
    public GoRunErrorsException(final String file) {
      super(("Errors while running " + file));
    }
  }
  
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  public void compileAndRun(final CharSequence goatCode, final Procedure2<? super String, ? super String> acceptor) {
    try {
      final Model model = this._parseHelper.parse(goatCode);
      this._validationTestHelper.assertNoErrors(model);
      final CharSequence code = new CodeModel(model).getTestCode(100);
      final File dir = Files.createTempDir();
      final File gofile = new File(dir, "code.go");
      Files.write(code.toString().getBytes(), gofile);
      final File exefile = new File(dir, "code");
      String _path = exefile.getPath();
      String _path_1 = gofile.getPath();
      final ProcessBuilder goCompiler = new ProcessBuilder("go", "build", "-o", _path, _path_1);
      final Process goCompilerProcess = goCompiler.start();
      for (boolean quit = false; (!quit);) {
        try {
          int _waitFor = goCompilerProcess.waitFor();
          boolean _notEquals = (_waitFor != 0);
          if (_notEquals) {
            String _path_2 = gofile.getPath();
            InputStream _errorStream = goCompilerProcess.getErrorStream();
            InputStreamReader _inputStreamReader = new InputStreamReader(_errorStream);
            List<String> _readLines = CharStreams.readLines(_inputStreamReader);
            throw new GeneratorTestHelper.GoCompilerErrorsException(_path_2, _readLines);
          }
          quit = true;
        } catch (final Throwable _t) {
          if (_t instanceof InterruptedException) {
            final InterruptedException x = (InterruptedException)_t;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      exefile.setExecutable(true);
      String _path_2 = exefile.getPath();
      final ProcessBuilder goRun = new ProcessBuilder(_path_2);
      final File outfile = new File(dir, "out.txt");
      final File errfile = new File(dir, "err.txt");
      goRun.redirectError(errfile);
      goRun.redirectOutput(outfile);
      final Process goRunProcess = goRun.start();
      for (boolean quit = false; (!quit);) {
        try {
          int _waitFor = goRunProcess.waitFor();
          boolean _notEquals = (_waitFor != 0);
          if (_notEquals) {
            String _path_3 = gofile.getPath();
            throw new GeneratorTestHelper.GoRunErrorsException(_path_3);
          }
          quit = true;
        } catch (final Throwable _t) {
          if (_t instanceof InterruptedException) {
            final InterruptedException x = (InterruptedException)_t;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      acceptor.apply(Files.toString(outfile, Charsets.UTF_8), Files.toString(errfile, Charsets.UTF_8));
      gofile.delete();
      exefile.delete();
      errfile.delete();
      outfile.delete();
      dir.delete();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
