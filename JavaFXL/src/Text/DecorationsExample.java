package Text;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DecorationsExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Text text1 = new Text("Hi how are you");
		text1.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.ITALIC,20));
		text1.setX(50);
		text1.setY(50);
		text1.setStrikethrough(true);
		
		Text text2 = new Text("Welcome to JavaFX");
		text2.setFont(Font.font("verdana",FontWeight.EXTRA_BOLD,FontPosture.REGULAR,20));
		text2.setX(50);
		text2.setY(150);
		text2.setUnderline(true);
		
		Group root = new Group(text1, text2);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Decorations Example");
		stage.setScene(scene);
		stage.show();
				
	}
	
	public static void main(String args[]) {
		launch(args);
		
	}

}
