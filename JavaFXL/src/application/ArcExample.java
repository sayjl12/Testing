package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

public class ArcExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//drawing an arc
		Arc arc = new Arc();
		//setting the properties of the arc
		arc.setCenterX(300.0);
		arc.setCenterY(150.0);
		arc.setRadiusX(100.0);
		arc.setRadiusY(100.0);
		arc.setStartAngle(10.0);
		arc.setLength(90.0);
		//creating a group object
		Group root= new Group(arc);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//adding scene to the stage
		stage.setScene(scene);
		//setting title to the stage
		stage.setTitle("Drawing an Arc");
		//displaying the contents to the stage
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
