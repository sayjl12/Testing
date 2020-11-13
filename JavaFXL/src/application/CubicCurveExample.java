package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

public class CubicCurveExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//drawing a cubic curve
		CubicCurve cubicCurve = new CubicCurve();
		//setting the properties to cubic curve
		cubicCurve.setStartX(100.0f);
		cubicCurve.setStartY(150.0f);
		cubicCurve.setControlX1(400.0f);
		cubicCurve.setControlY1(40.0f);
		cubicCurve.setControlX2(175.0f);
		cubicCurve.setControlY2(250.0f);
		cubicCurve.setEndX(500.0f);
		cubicCurve.setEndY(150.0f);
		//creating a group object
		Group root = new Group(cubicCurve);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Drawing a Cubic Curve");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents of the stage
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
