package Transformation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class ScalingExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Circle circle1 = new Circle(300,150,50);
		circle1.setFill(Color.BLUE);
		circle1.setStrokeWidth(20);
		
		Circle circle2 = new Circle(300,150,50);
		circle2.setFill(Color.BURLYWOOD);
		circle2.setStrokeWidth(20);
		
		Scale scale = new Scale();
		scale.setX(1.5);
		scale.setY(1.5);
		scale.setPivotX(300);
		scale.setPivotY(150);
		
		circle1.getTransforms().addAll(scale);
		
		Group root = new Group(circle1, circle2);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Scaling Transformation");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
