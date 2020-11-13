package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawingLine extends Application {
	
	@Override
	public void start (Stage primaryStage) throws Exception {
		//creating a line object
		Line line = new Line();
		//Line line = new Line(100.0,150.0,500.0,150.0)
		//setting the properties to a line
		line.setStartX(100.0);
		line.setStartY(150.0);
		line.setEndX(500.0);
		line.setEndY(150.0);
		//creating a Group
		Group root = new Group(line);
		//creating a Scene
		Scene scene  = new Scene(root,600,300);
		//setting title to the scene
		primaryStage.setTitle("Sample Application");
		//adding scene to the stage
		primaryStage.setScene(scene);
		//displaying the contents of a scene
		primaryStage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
