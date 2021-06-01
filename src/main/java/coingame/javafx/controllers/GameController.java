package coingame.javafx.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import org.tinylog.Logger;

public class GameController {
    /**
     * display the name of the player on top
     * display the board on the left
     * display a timer and number of moves made on the right
     * reset button to reset the state of the game
     * finish button to stop the game
     * */

    @FXML
    private Label message;

    @FXML
    private String name;

    @FXML
    private GridPane gameBoard;

    @FXML
    public void initialize(){

        Platform.runLater( ()-> {
            message.setText("Good Luck, "+ name+"!");
        });
    }

    public void setName(String name){
        Logger.info("Setting name to {}",name);
        this.name = name;
    }


    //exits the game when finish button is clicked. -change it later so that it takes to the results scene
    @FXML
    private void handleFinishButton(){
        Platform.exit();
    }

}
