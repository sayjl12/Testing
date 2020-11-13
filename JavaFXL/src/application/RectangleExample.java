package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleExample extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//drawing a rectangle
		Rectangle rectangle = new Rectangle(150.0f,75.0f,300.0f,150.0f);
		//setting the properties of the rectangle
		//rectangle.setX(150.0f);
		//rectangle.setY(75.0f);
		//rectangle.setWidth(300.0f);
		//rectangle.setHeight(150.0f);
		//creating a group object
		Group root = new Group(rectangle);
		//creating a scene object
		Scene scene = new Scene(root, 600, 300);
		//setting title to the stage
		primaryStage.setTitle("Drawing a Rectangle");
		//adding scene to the stage
		primaryStage.setScene(scene);
		//displaying the contents of the stage
		primaryStage.show();
	}
	
	public static void main (String args[]) {
		launch(args);
	}

}
