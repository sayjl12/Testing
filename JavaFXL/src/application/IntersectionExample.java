package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class IntersectionExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//drawing circle1
		Circle circle1 = new Circle();
		circle1.setCenterX(250.0);
		circle1.setCenterY(135.0);
		circle1.setRadius(100.0);
		circle1.setFill(Color.DARKSLATEBLUE);
		
		//drawing circle2
		Circle circle2 = new Circle();
		circle2.setCenterX(350.0);
		circle2.setCenterY(135.0);
		circle2.setRadius(100.0);
		circle2.setFill(Color.BLUE);
		
		Shape shape = Shape.intersect(circle1,circle2);
		shape.setFill(Color.ORANGE);
		
		Group root = new Group(shape);
		Scene scene = new Scene(root, 600,300);
		stage.setScene(scene);
		stage.setTitle("Intersection Example");
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
	
}
