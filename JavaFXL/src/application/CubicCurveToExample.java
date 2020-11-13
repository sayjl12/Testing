package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class CubicCurveToExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//creating a path object
		Path path = new Path();
		//moving to the starting point
		MoveTo moveTo = new MoveTo(100,150);
		//instantiating the class CubicCurve
		CubicCurveTo cubicCurveTo = new CubicCurveTo(400,40,175,250,500,150);
		//setting properties of the class CubicCurve
		cubicCurveTo.setControlX1(400.0f); 
	    cubicCurveTo.setControlY1(40.0f); 
	    cubicCurveTo.setControlX2(175.0f); 
	    cubicCurveTo.setControlY2(250.0f);       
	    cubicCurveTo.setX(500.0f); 
	    cubicCurveTo.setY(150.0f); 	      
		//adding the path elements to Observable list of the path class
		path.getElements().add(moveTo);
		path.getElements().add(cubicCurveTo);
		//creating a group object
		Group root = new Group(path);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Drawing a cuboc through a specified path");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents of the stage
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
