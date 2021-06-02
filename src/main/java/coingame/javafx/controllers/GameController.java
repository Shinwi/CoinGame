package coingame.javafx.controllers;

import javafx.application.Platform;
import javafx.beans.binding.ObjectBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import org.tinylog.Logger;

public class GameController {
    /**
     * d. display the name of the player on top
     * display the board on the left
     * display a timer and number of moves made on the right
     * reset button to reset the state of the game
     *  finish button to stop the game
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

        createBoard();
    }

    //creates the board
    private void createBoard(){
        for(int i=0 ; i<gameBoard.getRowCount() ; i++){
            for(int j=0 ; j<gameBoard.getColumnCount() ; j++){
                var square = createSquare(i,j);
                gameBoard.add(square,j,i);
            }
        }
    }

    //creates Squares
    private StackPane createSquare(int row, int col){
        var square = new StackPane();
        square.getStyleClass().add("square");
       // var coin = new Circle(50);

        return square;
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
