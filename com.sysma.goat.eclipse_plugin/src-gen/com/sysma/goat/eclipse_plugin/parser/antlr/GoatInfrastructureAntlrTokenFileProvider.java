/*
 * generated by Xtext 2.12.0
 */
package com.sysma.goat.eclipse_plugin.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GoatInfrastructureAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/sysma/goat/eclipse_plugin/parser/antlr/internal/InternalGoatInfrastructure.tokens");
	}
}
