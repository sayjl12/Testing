package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DropShadowEffectExample extends Application {
	
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
		
		DropShadow dropShadow = new DropShadow();
		dropShadow.setBlurType(BlurType.GAUSSIAN);
		dropShadow.setColor(Color.ROSYBROWN);
		dropShadow.setHeight(5);
		dropShadow.setWidth(5);
		dropShadow.setRadius(5);
		dropShadow.setOffsetX(3);
		dropShadow.setOffsetY(2);
		dropShadow.setSpread(12);
		
		text.setEffect(dropShadow);
		circle.setEffect(dropShadow);
		
		Group root = new Group(circle,text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Drop Shadow Effect");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
