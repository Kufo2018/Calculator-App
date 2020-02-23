package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;


public class Controller {

    @FXML
    private Label myMessage;

    public void generateRandom(ActionEvent actionEvent) {
        Random random = new Random();
        int myRandom = random.nextInt(50) + 1;
        myMessage.setText(Integer.toString(myRandom));

        System.out.print(myRandom);
    }
}
