package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Calculator App");

        try {
            // BorderPane root = new BorderPane();
            Parent root = FXMLLoader.load(getClass().getResource(
                    "Calculator.fxml"
            ));

            Scene scene = new Scene(root, 400, 400);
            scene.getStylesheets().add(
                    getClass().getResource("calculator.css")
                            .toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
