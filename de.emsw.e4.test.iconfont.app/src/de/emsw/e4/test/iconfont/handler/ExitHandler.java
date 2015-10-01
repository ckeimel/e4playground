 
package de.emsw.e4.test.iconfont.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.fx.ui.services.restart.RestartService;

public class ExitHandler {
	
	@Execute
	public void execute(RestartService restartService) {
		restartService.shutdown();
	}
		
}