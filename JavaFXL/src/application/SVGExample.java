package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;

public class SVGExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//creating a SVGPath object
		SVGPath svgPath = new SVGPath();
		String path = "M 100 100 L 300 100 L 200 300 z";
		//setting the SVGPath in the form of string
		svgPath.setContent(path);
		//creating a group object
		Group root = new Group(svgPath);
		//creating a scene object
		Scene scene = new Scene(root,600,300);
		//setting title to the stage
		stage.setTitle("Drawing a Sphere");
		//adding scene to the stage
		stage.setScene(scene);
		//displaying the contents to the stage
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
