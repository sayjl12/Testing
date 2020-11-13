package Animations;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TranslateTransitionExample extends Application {
	@Override
	public void start(Stage stage) {
		Circle circle = new Circle();
		circle.setCenterX(300.0f);
		circle.setCenterY(135.0f);
		circle.setRadius(50.0f);
		circle.setFill(Color.LIGHTSKYBLUE);
		circle.setStrokeWidth(20);
		
		TranslateTransition translateTransition = new TranslateTransition();
		translateTransition.setDuration(Duration.millis(1200));
		translateTransition.setNode(circle);
		translateTransition.setByX(600);
		translateTransition.setByY(0);
		translateTransition.setCycleCount(50);
		translateTransition.setAutoReverse(false);
		translateTransition.play();
		
		Group root = new Group(circle);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Translate Transition");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
