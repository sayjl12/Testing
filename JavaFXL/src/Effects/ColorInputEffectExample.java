package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorInputEffectExample extends Application {
	
	@Override 
	public void start(Stage stage) {
		Rectangle rectangle = new Rectangle();
		
		//instantiating the color input class
		ColorInput colorInput = new ColorInput();
		//setting the coordinates of the color input
		colorInput.setX(50);
		colorInput.setY(140);
		//setting the height and width of the region of the color input
		colorInput.setHeight(50);
		colorInput.setWidth(400);
		//setting the color 
		colorInput.setPaint(Color.CHOCOLATE);
		
		//applying color adjust effect to the rectangle
		rectangle.setEffect(colorInput);
		
		Group root = new Group(rectangle);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Color Input Effect Example");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
