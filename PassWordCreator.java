// Algorithm:
// Create the stage GUI for how the PassWordCreator will look
// Make sure information is being taken from PassWordPane
// Launch application 

import javafx.scene.Scene;
import javafx.stage.Stage;

public class PassWordCreator extends Application
{
     //  Launches the password creator application.
    
        public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new PassWordPane(), 300, 150);
    // Takes information from PassWordPane and uses it
        primaryStage.setTitle("Password Creator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    // Puts everything together to excecute the program
    {
        launch(args);
    }
}

