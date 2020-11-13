package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class ComplexShape extends Application {
	
	@Override
	public void start (Stage stage) {
		//creating a path
		Path path = new Path();
		//moving to the starting point
		MoveTo moveTo = new MoveTo(108,71);
		//creating 1st line
		LineTo line1 = new LineTo(321,161);
		//creating 2nd line
		LineTo line2 = new LineTo(126,232);
		//creating 3rd line
		LineTo line3 = new LineTo(232,52);
		//creating 4th line
		LineTo line4 = new LineTo(269,250);
		//creating 4th line
		LineTo line5 = new LineTo(108,71);
		//adding all the elements to the path
		path.getElements().add(moveTo);
		path.getElements().addAll(line1,line2,line3,line4,line5);
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
