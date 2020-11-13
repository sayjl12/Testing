package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GlowEffectExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Image image = new Image("http://www.tutorialspoint.com/green/images/logo.png");
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(200);
		imageView.setFitHeight(200);
		imageView.setX(100);
		imageView.setY(100);
		imageView.setPreserveRatio(true);
		
		Glow glow = new Glow();
		glow.setLevel(0.9);
		imageView.setEffect(glow);

		Group root = new Group(imageView);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Glow Effect Example");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
