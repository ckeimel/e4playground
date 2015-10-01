package de.emsw.e4.test.iconfont.ui;

import javax.annotation.PostConstruct;

import org.eclipse.fx.ui.controls.image.FontIcon;
import org.eclipse.fx.ui.controls.image.FontIconView;

import at.bestolution.efxclipse.icons.fontawsome.AwesomeIcons;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class FontIconToolControl {
	
	@PostConstruct
	public void postConstruct(HBox root) {
		FontIconView fontIconView = new FontIconView();
		fontIconView.setFont(Font.font("FontAwesome"));
		fontIconView.setIcon(FontIcon.create(AwesomeIcons.FA_BOMB.getName()));
		
		Button button = new Button(AwesomeIcons.FA_BOMB.getName(), fontIconView);
		root.getChildren().add(button);
	}
	
}