package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class EllipseExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//drawing an ellipse
		Ellipse ellipse = new Ellipse();
		//setting the properties ofthe ellipse
		ellipse.setCenterX(300.0f);
		ellipse.setCenterY(150.0f);
		ellipse.setRadiusX(150.0f);
		ellipse.setRadiusY(75.0f);
		//creating a group object
		Group root = new Group(ellipse);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Drawing an Ellipse");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents of the stage
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
