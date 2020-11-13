package Animations;

import javafx.animation.PauseTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PauseTransitionExample extends Application {
	@Override
	public void start(Stage stage) {
		Circle circle = new Circle();
		circle.setCenterX(150.0f);
		circle.setCenterY(135.0f);
		circle.setRadius(50.0f);
		circle.setFill(Color.BROWN);
		circle.setStrokeWidth(20);
		
		PauseTransition pauseTransition = new PauseTransition();
		pauseTransition.setDuration(Duration.millis(1000));
		
		TranslateTransition translateTransition = new TranslateTransition();
		translateTransition.setDuration(Duration.millis(1000));
		translateTransition.setNode(circle);
		translateTransition.setByX(300);
		translateTransition.setCycleCount(5);
		translateTransition.setAutoReverse(false);
		
		ScaleTransition scaleTransition = new ScaleTransition();
		scaleTransition.setDuration(Duration.millis(1000));
		scaleTransition.setNode(circle);
		scaleTransition.setByY(1.5);
		scaleTransition.setByX(1.5);
		scaleTransition.setCycleCount(5);
		scaleTransition.setAutoReverse(false);
		
		SequentialTransition sequentialTransition = new SequentialTransition(circle,
				translateTransition,pauseTransition,scaleTransition);
		sequentialTransition.play();
		
		Group root = new Group(circle);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Pause Transition");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
