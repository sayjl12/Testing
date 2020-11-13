package Text;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextFontExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Text text = new Text("Hi how are you");
		text.setX(50);
		text.setY(50);
		
		//setting font to the text
		text.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.REGULAR,20));
		//FontWeight.BLACK, FontWeight.BOLD, FontWeight.EXTRA_BOLD, FontWeight.EXTRA_LIGHT, LIGHT, MEDIUM, NORMAL, SEMI_BOLD, THIN
		//FontPosture.REGULAR and FontPosture.ITALIC
		
		Group root = new Group(text);
		Scene scene = new Scene(root, 600,300);
		stage.setTitle("Setting Font to the Text");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
