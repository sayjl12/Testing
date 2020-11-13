package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GaussianBlurEffectExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Text text = new Text();
		text.setFont(Font.font(null,FontWeight.BOLD,40));
		text.setX(60);
		text.setY(150);
		text.setText("Welcome to JavaFX");
		text.setFill(Color.DARKSEAGREEN);
		
		GaussianBlur gaussianBlur = new GaussianBlur();
		gaussianBlur.setRadius(10.5);
		
		text.setEffect(gaussianBlur);
		
		Group root = new Group(text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Gaussian Blur Effect");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
