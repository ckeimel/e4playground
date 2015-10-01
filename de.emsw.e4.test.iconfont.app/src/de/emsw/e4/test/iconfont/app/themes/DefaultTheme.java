package de.emsw.e4.test.iconfont.app.themes;

import org.eclipse.fx.ui.theme.AbstractTheme;

public class DefaultTheme extends AbstractTheme {
	public DefaultTheme() {
		super("theme.default", "Default theme", DefaultTheme.class.getClassLoader().getResource("css/default.css"));
	}
}
