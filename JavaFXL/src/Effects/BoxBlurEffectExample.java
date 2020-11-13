package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BoxBlurEffectExample extends Application {
	@Override
	public void start(Stage stage) {
		Text text = new Text();
		text.setFont(Font.font(null,FontWeight.BOLD,40));
		text.setX(60);
		text.setY(150);
		text.setText("Welcome to JavaFX");
		text.setFill(Color.DARKSEAGREEN);
		
		BoxBlur boxblur = new BoxBlur();
		boxblur.setWidth(8.0);
		boxblur.setHeight(3.0);
		boxblur.setIterations(3);
		
		text.setEffect(boxblur);
		
		Group root = new Group(text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Box Blur Effect");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
