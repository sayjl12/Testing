package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class HLineToExample extends Application {
	
	@Override
	public void start (Stage stage) {
		//creating an object of the path class
		Path path = new Path();
		//moving to the starting point
		MoveTo moveTo = new MoveTo(100,150);
		//instantiating the HLineTo class
		HLineTo hLineTo = new HLineTo(10);
		//adding the path elements to Observable list of the path class
		path.getElements().add(moveTo);
		path.getElements().add(hLineTo);
		//creating a group object
		Group root = new Group (path);
		//creating a scene object
		Scene scene = new Scene(root,300,300);
		//setting title to the stage
		stage.setTitle("Drawing a horizontal line");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents of the stage
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
