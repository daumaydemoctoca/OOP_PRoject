package sample;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class GamePlay {

    @FXML
    Button quit;
    @FXML
    ImageView dice1;
    @FXML
    ImageView dice2;
    @FXML
    Button rolldice;

    RollDices d1 = new RollDices();
    RollDices d2 = new RollDices();

    public void rotatedDice1(){
        RotateTransition rt = new RotateTransition(javafx.util.Duration.seconds(0.5),dice1);
        rt.setFromAngle(0);
        rt.setToAngle(360);
        rt.setOnFinished(actionEvent -> {
            dice1.setImage(new Image("file:src/Image/" + d1.Rolldice() + ".png"));
        });rt.play();
    }

    public void rotatedDice2(){
        RotateTransition rt = new RotateTransition(Duration.seconds(0.5),dice2);
        rt.setFromAngle(0);
        rt.setToAngle(360);
        rt.setOnFinished(actionEvent -> {
            dice2.setImage(new Image("file:src/Image/" + d2.Rolldice() + ".png"));
        });rt.play();
    }

    public void clickedRoll(ActionEvent event){
        rotatedDice1();
        rotatedDice2();
    }

    public void quitClicked(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../sample/MainMenu.fxml"));
        Stage stage = (Stage) quit.getScene().getWindow();
        stage.getScene().setRoot(root);
    }
}
