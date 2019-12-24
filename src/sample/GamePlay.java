package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class GamePlay {

    @FXML
    Button quit;

    public void quitClicked(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../sample/MainMenu.fxml"));
        Stage stage = (Stage) quit.getScene().getWindow();
        stage.getScene().setRoot(root);
    }
}
