package Text;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StrokeExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Text text = new Text("Hi how are you");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.REGULAR,50));
		text.setFill(Color.BROWN);
		text.setStrokeWidth(2);
		text.setStroke(Color.BLUE);
		
		Group root = new Group(text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Setting stroke to the text");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
