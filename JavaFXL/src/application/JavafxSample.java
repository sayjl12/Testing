package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class JavafxSample extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Creating a Group Object
		Group root = new Group();
		//Creating a Scene by passing the group object, width and height
		Scene scene = new Scene(root,600,300);
		//setting color to the scene
		scene.setFill(Color.BROWN);
		//setting the title to Stage
		primaryStage.setTitle("Sample Application");
		//adding the scene to Stage
		primaryStage.setScene(scene);
		//displaying the contents of the stage
		primaryStage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
