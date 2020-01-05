package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class ExitComfirm {
    @FXML
    Button yes,no;

    public void yesClicked(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void noClicked(ActionEvent actionEvent) throws IOException {
        Stage dialog = (Stage) no.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../sample/GamePlay.fxml"));

        Parent root1 = dialog.getOwner().getScene().getRoot();
        root1.setEffect(null);
        Window root2 = dialog.getOwner();
        root2.getScene().setRoot(root);
        dialog.close();
    }

}
