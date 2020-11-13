package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SepiaToneEffectExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Image image = new Image("http://www.tutorialspoint.com/images/tp-logo.gif");
		ImageView imageView = new ImageView(image);
		imageView.setX(150);
		imageView.setY(0);
		imageView.setFitHeight(300);
		imageView.setFitWidth(300);
		
		SepiaTone sepiaTone = new SepiaTone();
		sepiaTone.setLevel(0.8);
		imageView.setEffect(sepiaTone);
		
		Group root = new Group(imageView);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Sepia Tone Effect");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
