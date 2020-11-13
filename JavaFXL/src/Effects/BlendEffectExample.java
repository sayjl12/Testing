package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BlendEffectExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Circle circle = new Circle();
		circle.setCenterX(75.0);
		circle.setCenterY(75.0);
		circle.setRadius(30.0);
		circle.setFill(Color.BROWN);
		
		Blend blend = new Blend();
		
		//preparing the to input object
		ColorInput topInput = new ColorInput(35,30,75,40,Color.BLUEVIOLET);
		
		//setting the top input to the blend object
		blend.setTopInput(topInput);
		//setting the blend mode
		blend.setMode(BlendMode.SRC_OVER);
		//blendMode https://www.tutorialspoint.com/javafx/blend_effect.htm
		
		circle.setEffect(blend);
		
		Group root = new Group(circle);
		Scene scene = new Scene(root,300,150);
		stage.setTitle("Blend Example");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
