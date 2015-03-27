package de.emsw.e4.test.mnemonic;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;

public class AppLifeCycle {
	
	@PostContextCreate
	public void postContextCreate(IEclipseContext context) {
	}
	
}
