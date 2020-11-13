package Animations;

import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StrokeTransitionExample extends Application {
	@Override
	public void start(Stage stage) {
		Circle circle = new Circle();
		circle.setCenterX(300.0f);
		circle.setCenterY(135.0f);
		circle.setRadius(100.0f);
		circle.setFill(Color.BROWN);
		circle.setStrokeWidth(5);
		
		StrokeTransition strokeTransition = new StrokeTransition(Duration.millis(1000));
		strokeTransition.setShape(circle);
		strokeTransition.setFromValue(Color.BLUEVIOLET);
		strokeTransition.setToValue(Color.CORAL);
		strokeTransition.setCycleCount(50);
		strokeTransition.setAutoReverse(false);
		strokeTransition.play();
		
		Group root = new Group(circle);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Fill Transition");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
