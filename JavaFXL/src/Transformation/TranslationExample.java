package Transformation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class TranslationExample extends Application {
	@Override
	public void start(Stage stage) {
		Circle circle1 = new Circle(150.0f,135.0f,100.0f);
		circle1.setFill(Color.BROWN);
		circle1.setStrokeWidth(20);
		
		Circle circle2 = new Circle(150.0f,135.0f,100.0f);
		circle2.setFill(Color.CADETBLUE);
		circle2.setStrokeWidth(20);
		
		Translate translate = new Translate();
		translate.setX(300);
		translate.setY(50);
		translate.setZ(100);
		
		circle1.getTransforms().addAll(translate);
		
		Group root = new Group(circle1, circle2);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Translation Transformation");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
