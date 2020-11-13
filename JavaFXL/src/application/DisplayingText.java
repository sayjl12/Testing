package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayingText extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//creating a text object
		Text text = new Text();
		//setting font to the text
		text.setFont(new Font(45));
		//setting the position of the text
		text.setX(75);
		text.setY(150);
		//setting the text to be added
		text.setText("Welcome to JavaFX");
		//creating a group object
		Group root = new Group();
		//retrieving the observable list object
		ObservableList list = root.getChildren();
		//setting the text object as a node to the group object
		list.add(text);
		//creating a scene object
		Scene scene = new Scene (root,600,300);
		//setting title to the stage
		primaryStage.setTitle("Sample Application");
		//adding scene to the stage
		primaryStage.setScene(scene);
		//displaying the contents of the stage
		primaryStage.show();
		
	}
	
	public static void main (String args[]) {
		launch(args);
	}

}
