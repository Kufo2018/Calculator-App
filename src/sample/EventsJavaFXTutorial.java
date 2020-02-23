package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EventsJavaFXTutorial extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        try {
            // BorderPane root = new BorderPane();
            Parent root = FXMLLoader.load(getClass().getResource(
                    "Events.fxml"
            ));

            Scene scene = new Scene(root, 400, 400);
            scene.getStylesheets().add(
                    getClass().getResource("application.css")
                            .toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void generateRandom(ActionEvent actionEvent){
//        Random random = new Random();
//        int myRandom = random.nextInt(50) + 1;
//        System.out.print(myRandom);
//    }
}
