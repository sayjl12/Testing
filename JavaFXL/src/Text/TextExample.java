package Text;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextExample extends Application {
	
	@Override
	public void start (Stage stage) {
		//creating a text object
		Text text = new Text("Hello how are you");
		text.setText("Hi there");
		text.setX(50);
		text.setY(50);
		
		Group root = new Group(text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Writing Text");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
