package coingame.javafx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.tinylog.Logger;

import java.io.IOException;

public class StartController {
    @FXML
    TextField playerName;

    @FXML
    private void initialize(){
        playerName.setText(System.getProperty("user.name"));
    }

    /**
     * Takes the player to the next scene after the play button is clicked
     * */
    @FXML
    private void handlePlayButton(ActionEvent event) throws IOException {
        /**
         * logs the name of the player that was entered
         * */
        Logger.info("Player Name: {}", playerName.getText());

        /**
         * Loads the scenes of the game.fxml
         * */
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
        Parent root = fxmlLoader.load();
        GameController gameController = fxmlLoader.<GameController>getController();
        gameController.setName(playerName.getText());
        Stage stage = (Stage) ( (Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }
}
