package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RoundedRectangle extends Application {
	
	@Override
	public void start(Stage stage) {
		//drawing a rectangle
		Rectangle rectangle = new Rectangle();
		//setting the properties of the rectangle
		rectangle.setX(150.0f);
		rectangle.setY(75.0f);
		rectangle.setWidth(300.0f);
		rectangle.setHeight(150.0f);
		//setting the height and width of the arc
		rectangle.setArcWidth(30.0);
		rectangle.setArcHeight(20.0);
		//creating a group object
		Group root = new Group(rectangle);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Drawing a Rounded Rectangle");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents of the stage
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
	

}
