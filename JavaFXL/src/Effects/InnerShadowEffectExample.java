package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.InnerShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InnerShadowEffectExample extends Application {
	@Override 
	public void start(Stage stage) {
		Text text = new Text();
		text.setFont(Font.font(null,FontWeight.BOLD,40));
		text.setX(60);
		text.setY(50);
		text.setText("Welcome to JavaFX");
		text.setFill(Color.RED);
		
		Circle circle = new Circle();
		circle.setCenterX(300.0f);
		circle.setCenterY(160.0f);
		circle.setRadius(100.0f);
		circle.setFill(Color.CORNFLOWERBLUE);
		
		InnerShadow innerShadow = new InnerShadow();
		innerShadow.setOffsetX(4);
		innerShadow.setOffsetY(4);
		innerShadow.setColor(Color.GRAY);
		
		text.setEffect(innerShadow);
		circle.setEffect(innerShadow);
		
		Group root = new Group(circle,text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Inner Shadow Effect");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
