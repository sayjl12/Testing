package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.stage.Stage;

public class QuadCurveToExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//creating a path object
		Path path = new Path();
		//moving to the starting point
		MoveTo moveTo = new MoveTo(100.0,150.0);
		//instantiating the class QuadCurve
		QuadCurveTo quadCurveTo = new QuadCurveTo();
		quadCurveTo.setX(500.0f); 
	    quadCurveTo.setY(220.0f); 
	    quadCurveTo.setControlX(250.0f);  
	    quadCurveTo.setControlY(0.0f);
		//adding the path elements to observable list of the path class
		path.getElements().add(moveTo);
		path.getElements().add(quadCurveTo);
		//creating a group object
		Group root = new Group(path);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Drawing a cubic through a specified path");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying contents to the stage
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
