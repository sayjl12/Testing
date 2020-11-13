package Animations;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionExample1 extends Application {
	@Override
	public void start(Stage stage) {
		Circle circle = new Circle();
		circle.setCenterX(300.0f);
		circle.setCenterY(135.0f);
		circle.setRadius(25.0f);
		circle.setFill(Color.BROWN);
		circle.setStrokeWidth(20);
		
		Path path = new Path();
		MoveTo moveTo = new MoveTo(100,150);
		CubicCurveTo cubicCurveTo = new CubicCurveTo(400,40,175,250,500,150);
		path.getElements().add(moveTo);
		path.getElements().add(cubicCurveTo);
		
		PathTransition pathTransition = new PathTransition();
		pathTransition.setDuration(Duration.millis(1000));
		pathTransition.setNode(circle);
		pathTransition.setPath(path);
		pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathTransition.setCycleCount(50);
		pathTransition.setAutoReverse(false);
		pathTransition.play();
		
		Group root = new Group(circle);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Path Transition");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
