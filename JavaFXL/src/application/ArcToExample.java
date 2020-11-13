package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class ArcToExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//creating an object of the class path
		Path path = new Path();
		//moving to the starting point
		MoveTo moveTo = new MoveTo(250,250);
		//instantiating the arcTo class
		ArcTo arcTo = new ArcTo();
		arcTo.setX(300.0);
		arcTo.setY(50.0);
		arcTo.setRadiusX(50.0);
		arcTo.setRadiusY(50.0);
		//adding the path elements to Observable list of the path class
		path.getElements().add(moveTo);
		path.getElements().add(arcTo);
		//creating a group object
		Group root = new Group(path);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Drawing an arc through a path");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents of the stage
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
