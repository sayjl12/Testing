package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ImageInputEffectExample extends Application {
	@Override
	public void start(Stage stage) {
		Image image = new Image("http://www.tutorialspoint.com/green/images/logo.png");
		
		Rectangle rectangle = new Rectangle(); 
		
		ImageInput imageInput = new ImageInput();
		imageInput.setX(150);
		imageInput.setY(100);
		imageInput.setSource(image);
		
		rectangle.setEffect(imageInput);
		
		Group root = new Group(rectangle);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Image Input Effect Example");
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
