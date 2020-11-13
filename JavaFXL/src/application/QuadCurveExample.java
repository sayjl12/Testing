package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

public class QuadCurveExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//creating a quadratic curve
		QuadCurve quadCurve = new QuadCurve();
		//adding properties to the Quad Curve
		quadCurve.setStartX(100.0);
		quadCurve.setStartY(220.0f);
		quadCurve.setControlX(250.0f);
		quadCurve.setControlY(0.0f);
		quadCurve.setEndX(500.0f);
		quadCurve.setEndY(220.0f);
		//creating a group object
		Group root = new Group(quadCurve);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//adding scene to the stage
		stage.setScene(scene);
		//setting title to the stage
		stage.setTitle("Drawing a Quad Curve");
		//displaying the contents to the stage
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
