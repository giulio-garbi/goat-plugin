package com.sysma.goat.eclipse_plugin.generator;

import com.sysma.goat.eclipse_plugin.generator.CodeAttribute;
import com.sysma.goat.eclipse_plugin.generator.CodeModel;
import com.sysma.goat.eclipse_plugin.generator.CodeReceivePred;
import com.sysma.goat.eclipse_plugin.generator.CodeValue;
import com.sysma.goat.eclipse_plugin.generator.LocalBackupAttributes;
import com.sysma.goat.eclipse_plugin.goatComponents.AttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.Awareness;
import com.sysma.goat.eclipse_plugin.goatComponents.Expression;
import com.sysma.goat.eclipse_plugin.goatComponents.LocalAttributeToSet;
import com.sysma.goat.eclipse_plugin.goatComponents.Preconditions;
import com.sysma.goat.eclipse_plugin.goatComponents.Update;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CodePreconditionProcess {
  private final List<EObject> preconds;
  
  public CodePreconditionProcess(final Preconditions p) {
    this.preconds = p.getPrecond();
  }
  
  public CodePreconditionProcess(final Awareness awr) {
    this.preconds = Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(awr));
  }
  
  public CharSequence getPreconditionCode(final String localBackupMap, final String componentMap) {
    CharSequence _xblockexpression = null;
    {
      final HashSet<LocalAttributeToSet> locVarsToBackupNames = new HashSet<LocalAttributeToSet>();
      final Function1<EObject, Boolean> _function = (EObject it) -> {
        return Boolean.valueOf((it instanceof Update));
      };
      final Consumer<EObject> _function_1 = (EObject it) -> {
        final Function1<AttributeToSet, Boolean> _function_2 = (AttributeToSet it_1) -> {
          return Boolean.valueOf((it_1 instanceof LocalAttributeToSet));
        };
        final Consumer<AttributeToSet> _function_3 = (AttributeToSet it_1) -> {
          locVarsToBackupNames.add(((LocalAttributeToSet) it_1));
        };
        IterableExtensions.<AttributeToSet>filter(((Update) it).getVars(), _function_2).forEach(_function_3);
      };
      IterableExtensions.<EObject>filter(this.preconds, _function).forEach(_function_1);
      final Function1<LocalAttributeToSet, LocalBackupAttributes> _function_2 = (LocalAttributeToSet it) -> {
        return new LocalBackupAttributes(it, localBackupMap);
      };
      final Iterable<LocalBackupAttributes> locVarsToBackup = IterableExtensions.<LocalAttributeToSet, LocalBackupAttributes>map(locVarsToBackupNames, _function_2);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("func()bool{");
      _builder.newLine();
      {
        for(final LocalBackupAttributes locAttr : locVarsToBackup) {
          _builder.append("\t");
          _builder.append("if ");
          CharSequence _exists = locAttr.original.exists();
          _builder.append(_exists, "\t");
          _builder.append("{");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          CharSequence _assign = locAttr.backup.assign(locAttr.original.read());
          _builder.append(_assign, "\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.append("if !(func()bool{");
      _builder.newLine();
      {
        for(final EObject prec : this.preconds) {
          {
            if ((prec instanceof Update)) {
              {
                int _length = ((Object[])Conversions.unwrapArray(((Update)prec).getVals(), Object.class)).length;
                ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
                for(final Integer i : _doubleDotLessThan) {
                  _builder.append("\t\t");
                  AttributeToSet _get = ((Update)prec).getVars().get((i).intValue());
                  String _localVariablesMap = CodeModel.getLocalVariablesMap();
                  Expression _get_1 = ((Update)prec).getVals().get((i).intValue());
                  String _localVariablesMap_1 = CodeModel.getLocalVariablesMap();
                  CharSequence _assign_1 = new CodeAttribute(_get, componentMap, _localVariablesMap).assign(new CodeValue(_get_1, componentMap, _localVariablesMap_1).getCode());
                  _builder.append(_assign_1, "\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
            } else {
              if ((prec instanceof Awareness)) {
                _builder.append("\t\t");
                _builder.append("if !(");
                Expression _pred = ((Awareness) prec).getPred();
                String _localVariablesMap_2 = CodeModel.getLocalVariablesMap();
                CharSequence _code = new CodeReceivePred(_pred, componentMap, _localVariablesMap_2).getCode();
                _builder.append(_code, "\t\t");
                _builder.append("){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("return false");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
          _builder.append("\t\t");
          _builder.newLine();
        }
      }
      _builder.append("\t\t");
      _builder.append("return true");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}()){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("for lv, val := range ");
      _builder.append(localBackupMap, "\t\t");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String _localVariablesMap_3 = CodeModel.getLocalVariablesMap();
      _builder.append(_localVariablesMap_3, "\t\t\t");
      _builder.append("[lv] = val");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return false");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("} else {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return true");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
