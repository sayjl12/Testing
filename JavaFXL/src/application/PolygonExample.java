package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PolygonExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//creating a polygon
		Polygon polygon = new Polygon();
		//adding coordinates to the polygon
		polygon.getPoints().addAll(new Double[] {
				300.0, 50.0, 
		        450.0, 150.0, 
		        300.0, 250.0, 
		        150.0, 150.0, 	
		});
		//creating a group object
		Group root = new Group(polygon);
		//creating scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Drawing a Polygon");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents of the stage
		stage.show();
		
	}
	
	public static void main (String args[]) {
		launch(args);
	}

}
