package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ColorAdjustEffectExample extends Application {
	
	@Override
	public void start(Stage stage) {
		//creating an image
		Image image = new Image("http://www.tutorialspoint.com/green/images/logo.png");
		
		//setting the image view
		ImageView imageView = new ImageView(image);
		//setting position of the image
		imageView.setX(100);
		imageView.setY(70);
		//setting the fit height and width of the image viewe
		imageView.setFitHeight(200);
		imageView.setFitWidth(400);
		//setting the preserve ratio of the image view
		imageView.setPreserveRatio(true);
		
		//instantiating the color adjust class
		ColorAdjust colorAdjust = new ColorAdjust();
		//setting the contrast value
		colorAdjust.setContrast(0.4);
		//setting the hue value
		colorAdjust.setHue(-0.05);
		//setting the brightness value
		colorAdjust.setBrightness(0.9);
		//setting the saturation value
		colorAdjust.setSaturation(0.8);
		
		//applying color adjust effect to the image view node
		imageView.setEffect(colorAdjust);
		
		Group root = new Group(imageView);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Color Adjust Effect Example");
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
