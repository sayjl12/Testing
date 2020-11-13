package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.Shadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShadowEffectExample extends Application {
	@Override 
	public void start(Stage stage) {
		Text text = new Text();
		text.setFont(Font.font(null,FontWeight.BOLD,40));
		text.setX(60);
		text.setY(50);
		text.setText("Welcome to JavaFX");
		text.setFill(Color.DARKSEAGREEN);
		
		Circle circle = new Circle();
		circle.setCenterX(300.0f);
		circle.setCenterY(160.0f);
		circle.setRadius(100.0f);
		
		Shadow shadow = new Shadow();
		shadow.setBlurType(BlurType.GAUSSIAN);
		shadow.setColor(Color.ROSYBROWN);
		shadow.setHeight(5);
		shadow.setWidth(5);
		shadow.setRadius(5);
		
		text.setEffect(shadow);
		circle.setEffect(shadow);
		
		Group root = new Group(circle,text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Shadow Effect");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
