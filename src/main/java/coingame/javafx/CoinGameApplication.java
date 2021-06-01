package coingame.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CoinGameApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/start.fxml"));
        stage.setTitle("Coins Game");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
