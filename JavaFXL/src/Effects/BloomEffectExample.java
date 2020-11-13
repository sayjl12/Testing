package Effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BloomEffectExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Text text = new Text();
		text.setFont(Font.font(null,FontWeight.BOLD,40));
		text.setX(60);
		text.setY(150);
		text.setText("Welcome to JavaFX");
		text.setFill(Color.DARKSEAGREEN);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(50.0);
		rectangle.setY(80.0);
		rectangle.setWidth(500.0);
		rectangle.setHeight(120.0);
		rectangle.setFill(Color.TEAL);
		
		Bloom bloom = new Bloom();
		bloom.setThreshold(0.1);
		text.setEffect(bloom);
		
		Group root = new Group(rectangle,text);
		Scene scene = new Scene(root,600,300);
		stage.setTitle("Bloom Effect Example");
		stage.setScene(scene);
		stage.show();
	
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
