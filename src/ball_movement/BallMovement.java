package ball_movement;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * **
 * <code>BallMovement<code> move the circle to left, right, up and down
 * @author ttran1214
 *
 */
public class BallMovement extends Application {
	private CirclePane circle = new CirclePane();
	
    
	Button leftButton = new Button("Left");
	Button rightButton = new Button("Right");
	Button upButton = new Button("Up");
	Button downButton = new Button("Down");
	
	/**
	 * set up elements in stage, layout, scene and
	 * move the circle to left, right, up and down 
	 */
	public void start(Stage stage) throws Exception {
		HBox box = new HBox();
		box.getChildren().add(leftButton);
		box.getChildren().add(rightButton);
		box.getChildren().add(upButton);
		box.getChildren().add(downButton);
		box.setSpacing(5);
		box.setAlignment(Pos.BOTTOM_CENTER);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(circle);
		pane.setBottom(box);
		
		Scene scene = new Scene(pane, 400, 250);
		
		stage.show();
		stage.setTitle("Ball Movement");
		stage.setScene(scene);
		
		leftButton.setOnAction(e -> circle.left());
		rightButton.setOnAction(c-> circle.right());
		upButton.setOnAction(u -> circle.up());
		downButton.setOnAction(d -> circle.down());
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
	class CirclePane extends StackPane {
		/**
		 * Create circle with radius 50
		 */
		  private Circle circ = new Circle(50);
		  
		  /**
		   * Set the circle have white color with black layer
		   */
		  public CirclePane() 
		  {
		    getChildren().add(circ);
		    circ.setStroke(Color.BLACK);
		    circ.setFill(Color.WHITE);
		  }
		  
		  /**
		   * move the circle to the left
		   */
		  public void left() 
		  {
		      circ.setTranslateX(circ.getTranslateX() - 5);
		  }
		  /**
		   * move the circle to the right
		   */
		  public void right() 
		  {
		      circ.setTranslateX(circ.getTranslateX() + 5);
		  }
		  /**
		   * move the circle up
		   */
		  public void up() 
		  {
		      circ.setTranslateY(circ.getTranslateY() - 5);
		  }
		  /**
		   * move the circle down
		   */
		  public void down() 
		  {
		      circ.setTranslateY(circ.getTranslateY() + 5);
		  }

}
