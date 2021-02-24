package lab1;

import javafx.application.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class lab1 extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		int width = 400;
		int height = 250;
		
		primaryStage.setResizable(false);
		
		
		Color myRed = Color.rgb(139, 0, 0);
		
		Group root = new Group(); 
		Scene scene = new Scene (root, width, height); 
		
		scene.setFill(myRed);	
		
		Ellipse el1 = new Ellipse (width-95,height/2,80,96);
		el1.setFill(Color.rgb(192,192,192));
		el1.setStroke(Color.WHITE);
		el1.setStrokeWidth(8);
		root.getChildren().add(el1);
		
		Circle c1 = new Circle(width,height/2,70);
		c1.setFill(myRed);
		root.getChildren().add(c1);
		
		Circle c2 = new Circle(width-190,height/2,70);
		c2.setFill(myRed);
		root.getChildren().add(c2);
		
		Rectangle r = new Rectangle((width-280)/2,(height-10)/2,280,10);
		root.getChildren().add(r);
		
		primaryStage.setScene(scene); //
		primaryStage.show();
	}
}