package com.sysma.goat.eclipse_plugin.ui;

import com.sysma.goat.eclipse_plugin.ui.StreamCopier;
import java.io.InputStream;
import java.io.OutputStream;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class RunComponent {
  private final IPath filePath;
  
  private final IPath projectPath;
  
  private final IOConsole console;
  
  public RunComponent(final IPath projectPath, final IPath filePath, final IOConsole console) {
    this.filePath = filePath;
    this.projectPath = projectPath;
    this.console = console;
  }
  
  public void launch() {
    final IOConsoleOutputStream stdout = this.console.newOutputStream();
    final IOConsoleOutputStream stderr = this.console.newOutputStream();
    final IOConsoleInputStream stdin = this.console.getInputStream();
    stderr.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
    stdin.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_GREEN));
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          final ProcessBuilder pb = new ProcessBuilder();
          final IPath srvGoDir = RunComponent.this.projectPath.makeAbsolute().append("src-gen").append("component");
          pb.directory(srvGoDir.toFile());
          final IPath srvGo = RunComponent.this.filePath.removeFileExtension().addFileExtension("go");
          boolean _exists = srvGoDir.append(srvGo).toFile().exists();
          if (_exists) {
            final String srvGoFname = srvGo.toString();
            pb.command("go", "run", srvGoFname);
            final Process proc = pb.start();
            OutputStream _outputStream = proc.getOutputStream();
            StreamCopier _streamCopier = new StreamCopier(stdin, _outputStream);
            new Thread(_streamCopier).start();
            InputStream _inputStream = proc.getInputStream();
            StreamCopier _streamCopier_1 = new StreamCopier(_inputStream, stdout);
            new Thread(_streamCopier_1).start();
            InputStream _errorStream = proc.getErrorStream();
            StreamCopier _streamCopier_2 = new StreamCopier(_errorStream, stderr);
            new Thread(_streamCopier_2).start();
          } else {
            String _string = RunComponent.this.filePath.toString();
            String _plus = (_string + " was not generated. Please save the file and retry.");
            stderr.write(_plus);
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    }).start();
  }
}
