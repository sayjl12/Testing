package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class unionExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//drawing circle1
		Circle circle1 = new Circle();
		//setting the position of the circle1
		circle1.setCenterX(250.0);
		circle1.setCenterY(135.0);
		circle1.setRadius(100.0);
		circle1.setFill(Color.DARKSLATEBLUE);
		
		//drawing circle2
		Circle circle2 = new Circle();
		//setting the position of the circle2
		circle2.setCenterX(350.0);
		circle2.setCenterY(135.0);
		circle2.setRadius(100.0);
		circle2.setFill(Color.BLUE);
		
		//performing union operation on the circle
		Shape shape = Shape.union(circle1, circle2);
		shape.setFill(Color.DARKSLATEBLUE);
		
		//creating a group object
		Group root = new Group(shape);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Union Example");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents to the stage
		stage.show();
	}
	
	public static void main (String args[]) {
		launch(args);
	}

}
