package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.VLineTo;
import javafx.stage.Stage;

public class VLineToExample extends Application {
	
	@Override
	public void start (Stage stage) {
		//creating an object of the path class
		Path path = new Path();
		//Moving to the starting point
		MoveTo moveTo = new MoveTo(100,100);
		//instantiating the VLineTo class
		VLineTo vLineTo = new VLineTo(250);
		//adding the path elements to Observable list of the path class
		path.getElements().add(moveTo);
		path.getElements().add(vLineTo);
		//creating group object
		Group root = new Group(path);
		//creating scene object
		Scene scene = new Scene(root, 600,300);
		//setting title to the stage
		stage.setTitle("Drawing a Vertical Line");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents to the stage
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
