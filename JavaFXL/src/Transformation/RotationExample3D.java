package Transformation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class RotationExample3D extends Application {
	@Override
	public void start(Stage stage) {
		Box box = new Box();
		box.setWidth(150.0);
		box.setHeight(150.0);
		box.setDepth(150.0);
		
		Translate translate = new Translate();
		translate.setX(400);
		translate.setY(150);
		translate.setZ(25);
		
		Rotate rxBox = new Rotate(0,0,0,0,Rotate.X_AXIS);
		Rotate ryBox = new Rotate(0,0,0,0,Rotate.Y_AXIS);
		Rotate rzBox = new Rotate(0,0,0,0,Rotate.Z_AXIS);
		rxBox.setAngle(30);
		ryBox.setAngle(50);
		rzBox.setAngle(30);
		box.getTransforms().addAll(translate,rxBox,ryBox,rzBox);
		
		Group root = new Group(box);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Rotation in 3D");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
