package EventHandling;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EventFiltersExample extends Application {
	
	@Override
	public void start(Stage stage) {
		Circle circle = new Circle();
		circle.setCenterX(300.0f);
		circle.setCenterY(135.0f);
		circle.setRadius(25.0f);
		circle.setFill(Color.BROWN);
		circle.setStrokeWidth(20);
		
		Text text = new Text("Click on the circle to change its color");
		text.setFont(Font.font(null,FontWeight.BOLD,15));
		text.setFill(Color.CRIMSON);
		text.setX(150);
		text.setY(50);
		
		//creating mouse event handler
		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Hello World");
				circle.setFill(Color.DARKSLATEBLUE);
			}
		};
		
		circle.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler);
		
		Group root = new Group(circle,text);
		Scene scene = new Scene(root,600,300);
		scene.setFill(Color.LAVENDER);
		stage.setTitle("Event Filters Example");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}
