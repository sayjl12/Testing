package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//drawing a circle
		Circle circle = new Circle();
		//setting the properties of the circle
		circle.setCenterX(300.0f);
		circle.setCenterY(135.0f);
		circle.setRadius(100.0f);
		//creating a group object
		Group root = new Group(circle);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Drawing a Circle");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents of the stage
		stage.show();
	}
	
	public static void main (String args[]) {
		launch(args);
	}

}
