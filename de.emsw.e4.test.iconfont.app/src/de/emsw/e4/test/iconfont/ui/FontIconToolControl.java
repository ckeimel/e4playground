package de.emsw.e4.test.iconfont.ui;

import javax.annotation.PostConstruct;

import org.eclipse.fx.ui.controls.image.AwesomeIcons;
import org.eclipse.fx.ui.controls.image.FontIcon;
import org.eclipse.fx.ui.controls.image.FontIconView;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class FontIconToolControl {
	
	@PostConstruct
	public void postConstruct(HBox root) {
		FontIconView fontIconView = new FontIconView();
		fontIconView.setFont(AwesomeIcons.getFont());
		fontIconView.setIcon(FontIcon.create(AwesomeIcons.FA_BOMB.getName()));
		
		Button button = new Button(AwesomeIcons.FA_BOMB.getName(), fontIconView);
		root.getChildren().add(button);
	}
	
}