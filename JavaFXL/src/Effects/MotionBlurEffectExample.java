package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.MotionBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MotionBlurEffectExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Text text = new Text();
		text.setFont(Font.font(null,FontWeight.BOLD,40));
		text.setX(60);
		text.setY(150);
		text.setText("Welcome to JavaFX");
		text.setFill(Color.DARKSEAGREEN);
		
		MotionBlur motionBlur = new MotionBlur();
		motionBlur.setRadius(10.5);
		motionBlur.setAngle(45);
		text.setEffect(motionBlur);
		
		Group root = new Group(text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Motion Blur Effect");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
