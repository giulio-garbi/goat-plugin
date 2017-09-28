package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeAttribute;
import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.goatComponents.LocalAttributeToSet;

@SuppressWarnings("all")
public class LocalBackupAttributes {
  public final LocalAttributeToSet attribute;
  
  public final CodeAttribute original;
  
  public final CodeAttribute backup;
  
  public LocalBackupAttributes(final LocalAttributeToSet attribute, final String localBackupMap) {
    this.attribute = attribute;
    String _localVariablesMap = CodeModel.getLocalVariablesMap();
    CodeAttribute _codeAttribute = new CodeAttribute(attribute, "", _localVariablesMap);
    this.original = _codeAttribute;
    CodeAttribute _codeAttribute_1 = new CodeAttribute(attribute, "", localBackupMap);
    this.backup = _codeAttribute_1;
  }
}
