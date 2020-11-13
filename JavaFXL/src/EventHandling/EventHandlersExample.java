package EventHandling;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EventHandlersExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Box box = new Box();
		box.setWidth(150.0);
		box.setHeight(150.0);
		box.setDepth(100.0);
		
		box.setTranslateX(350);
		box.setTranslateY(150);
		box.setTranslateZ(50);
		
		Text text = new Text("Type any letter to rotate the box, and clicked on the box to stop the rotation");
		text.setFont(Font.font(null,FontWeight.BOLD,15));
		text.setFill(Color.CRIMSON);
		text.setX(20);
		text.setY(50);
		
		PhongMaterial material = new PhongMaterial();
		material.setDiffuseColor(Color.DARKSLATEBLUE);
		box.setMaterial(material);
		
		RotateTransition rotateTransition = new RotateTransition();
		rotateTransition.setDuration(Duration.millis(1000));
		rotateTransition.setNode(box);
		rotateTransition.setAxis(Rotate.Y_AXIS);
		rotateTransition.setByAngle(360);
		rotateTransition.setCycleCount(50);
		rotateTransition.setAutoReverse(false);
		
		TextField textField = new TextField();
		textField.setLayoutX(50);
		textField.setLayoutY(100);
		
		EventHandler<KeyEvent> eventHandlerTextField = new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				rotateTransition.play();
			}
		};
		
		textField.addEventHandler(KeyEvent.KEY_TYPED,eventHandlerTextField);
		
		EventHandler<javafx.scene.input.MouseEvent> eventHandlerBox = new EventHandler<javafx.scene.input.MouseEvent>() {
			@Override
			public void handle(javafx.scene.input.MouseEvent e) {
				rotateTransition.stop();
			}
		};
		
		box.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED,eventHandlerBox);
		
		Group root = new Group(box,textField,text);
		Scene scene = new Scene(root,600,300);
		
		PerspectiveCamera camera = new PerspectiveCamera(false);
		camera.setTranslateX(0);
		camera.setTranslateY(0);
		camera.setTranslateZ(0);
		scene.setCamera(camera);
		
		stage.setTitle("Event Handlers Example");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
