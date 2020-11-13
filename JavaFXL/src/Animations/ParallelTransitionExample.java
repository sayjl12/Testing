package Animations;

import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ParallelTransitionExample extends Application {
	@Override
	public void start(Stage stage) {
		Rectangle rectangle = new Rectangle();
		rectangle.setX(75.0f);
		rectangle.setY(75.0f);
		rectangle.setHeight(100.0f);
		rectangle.setWidth(100.0f);
		rectangle.setFill(Color.BLUEVIOLET);
		
		Path path = new Path();
		MoveTo moveTo = new MoveTo(100,150);
		CubicCurveTo cubicCurveTo = new CubicCurveTo(400,40,175,250,500,150);
		path.getElements().add(moveTo);
		path.getElements().add(cubicCurveTo);
		
		PathTransition pathTransition = new PathTransition();
		pathTransition.setDuration(Duration.millis(1000));
		pathTransition.setNode(rectangle);
		pathTransition.setPath(path);
		pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathTransition.setCycleCount(5);
		pathTransition.setAutoReverse(false);
		pathTransition.play();
		
		TranslateTransition translateTransition = new TranslateTransition();
		translateTransition.setDuration(Duration.millis(1000));
		translateTransition.setNode(rectangle);
		translateTransition.setByX(300);
		translateTransition.setCycleCount(5);
		translateTransition.setAutoReverse(false);
		
		ScaleTransition scaleTransition = new ScaleTransition();
		scaleTransition.setDuration(Duration.millis(1000));
		scaleTransition.setNode(rectangle);
		scaleTransition.setByY(1.5);
		scaleTransition.setByX(1.5);
		scaleTransition.setCycleCount(5);
		scaleTransition.setAutoReverse(false);
		
		ParallelTransition parallelTransition = new ParallelTransition(rectangle,
				pathTransition,translateTransition,scaleTransition);
		parallelTransition.play();
		
		Group root = new Group(rectangle);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Parallel Transition");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
