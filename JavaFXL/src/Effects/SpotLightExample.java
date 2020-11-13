package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SpotLightExample extends Application {
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
		
		Light.Spot light = new Light.Spot();
		light.setColor(Color.GRAY);
		light.setX(70);
		light.setY(55);
		light.setZ(45);
		
		Lighting lighting = new Lighting();
		lighting.setLight(light);
		
		text.setEffect(lighting);
		circle.setEffect(lighting);
		
		Group root = new Group(circle,text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Spot Light Effect");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}
