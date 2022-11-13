
import javafx.application.*; // need this for to run an actual application
import javafx.event.*; // used for events and stuff (in combination with buttons)
import javafx.scene.*; // used for Scene objects (you can make a bunch of them)
import javafx.scene.control.*; // used for buttons and other cool GUI stuff
import javafx.scene.layout.*; // used for the root layout (just use StackPane)
import javafx.scene.paint.Paint;
import javafx.scene.shape.*; // used for 2 dimensional shapes
import javafx.stage.*; // used for defining the stage and stuff (yea that stuff 無)
import javafx.scene.paint.*;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Configure Shapes
        Rectangle rect = new Rectangle(100, 100);
        rect.setSmooth(true);
        rect.setFill();

        // Configure Button
        // Button button1 = new Button("Burn the City");
        // button1.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent arg0) {
        //         System.out.println("Event based programming can be fun for the most part!");
        //     }
        // });

        // Create node hierarchy
        StackPane root = new StackPane();
        // root.getChildren().add(button1);
        root.getChildren().add(rect);

        // Configure stage/scene
        Scene scene = new Scene(root,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("It's time to...");
        primaryStage.show();
    }

    public static void main(String[] args) { Client.launch(); } // entry point forwarding
}