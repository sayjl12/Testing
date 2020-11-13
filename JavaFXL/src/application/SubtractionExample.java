package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class SubtractionExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Circle circle1 = new Circle();
		circle1.setCenterX(250.0);
		circle1.setCenterY(135.0);
		circle1.setRadius(100.0);
		circle1.setFill(Color.PURPLE);
		
		Circle circle2 = new Circle();
		circle2.setCenterX(350.0);
		circle2.setCenterY(135.0);
		circle2.setRadius(100.0);
		circle2.setFill(Color.PINK);
		
		Shape shape = Shape.subtract(circle1, circle2);
		shape.setFill(Color.VIOLET);
		
		Group root = new Group(shape);
		Scene scene = new Scene(root,600,300);
		stage.setScene(scene);
		stage.setTitle("Subtraction Example");
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
