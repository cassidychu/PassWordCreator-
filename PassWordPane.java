// Algorithm:
// Create code that ask for users input
// Ask for users first name
// Ask user to input a 6 digit date 
// Final product will take first 2 letters of users name
// then includes a period, finally ass 1 or 2 random positive numbers
// to the first/second digit of the date keeping the last 4 digits

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import java.util.Random;


public class PassWordPane extends GridPane
// the pane is everything in the program that has been executed in
// the color yellow
{
    private Label result;
    private TextField password;
    private TextField finalProduct;

    //  Creates a GUI that has a labeled text field to 
    //  take users inoput and create a password
    
        public PassWordPane()
    // Creates the main frame for where everything in the program will be executed in the
    // final product such as what will appear in the blue pane
    {
        Font font = new Font(18);
        
        Label name = new Label("Password Creator");
        name.setFont(font);
        GridPane.setHalignment(name, HPos.LEFT);
        
        Label inputLabel = new Label("Your Name:");
        inputLabel.setFont(font);
        GridPane.setHalignment(inputLabel, HPos.RIGHT);
        
        Label outputLabel = new Label("6-Digit Date:");
        outputLabel.setFont(font);
        GridPane.setHalignment(outputLabel, HPos.RIGHT);
        
        result = new Label("result:");
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);
        
        password = new TextField();
        password.setFont(font);
        password.setPrefColumnCount(5);
        password.setAlignment(Pos.CENTER);
        password.setOnAction(this::processPasswordKey);
        // password enter key will generate the action in event
        // processPasswordKey will listen to the event that is generated
        // setOnAction then associates the genertaor with the listener 
        
        finalProduct = new TextField();
        finalProduct.setFont(font);
        finalProduct.setPrefColumnCount(5);
        finalProduct.setAlignment(Pos.CENTER);
        finalProduct.setOnAction(this::processPasswordKey);
        
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: blue");
        
        add(inputLabel, 0, 1);
        add(password, 1, 1);
        add(outputLabel, 0, 2);
        add(finalProduct, 1, 2);
        add (name, 0,0);
        add(result, 0,3);
    }
    
    //  Computes and displays the password when the user
    //  enters their information into the test field
  
    public void processPasswordKey(ActionEvent event)
    // This is the behind the scenes of after the user inputs their data into the
    // textfield which will convert all the info into a final product
    // which consists of the first 2 letters of their name, adds a period, and 
    // changes the first 2 numbers of the date, replacing them with random generated numbers 
    {
        String userName = password.getText();
        userName = userName.substring(0,2);
        String twoDigit = finalProduct.getText();
        twoDigit = twoDigit.substring(2,6);
        int randomNum = 1 + (int) (Math.random()*99);
        String finalProduct = userName + "." + randomNum + twoDigit;
        result.setText(finalProduct);   
    }
}
