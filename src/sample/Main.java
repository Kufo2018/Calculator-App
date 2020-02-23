package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("JavaFX Welcome"); // Sets Title at the top left corner

//        GridPane gridPane = new GridPane();
//        gridPane.setAlignment(Pos.CENTER);
//        gridPane.setHgap(10);
//        gridPane.setVgap(10);
//        gridPane.setPadding(new Insets(25, 25, 25, 25));
//
//        final Text actionTarget = new Text();
//        gridPane.add(actionTarget, 1, 6);
//
//        Text sceneTitle = new Text("Welcome");
//        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//        gridPane.add(sceneTitle, 0, 0, 2, 1);
//
//        Label userName = new Label("User Name:");
//        gridPane.add(userName, 0, 1);
//
//        TextField userTextField = new TextField();
//        gridPane.add(userTextField, 1, 1);
//
//        Label passwordText = new Label("Password");
//        gridPane.add(passwordText, 0, 2);
//
//        PasswordField passwordField = new PasswordField();
//        gridPane.add(passwordField, 1, 2);
//
//        Button button = new Button("Login");
//        HBox hBoxBtn = new HBox(10);
//        hBoxBtn.setAlignment(Pos.BOTTOM_RIGHT);
//        hBoxBtn.getChildren().add(button);
//        gridPane.add(button, 1, 4);
//
//        button.setOnAction(actionEvent -> {
//            actionTarget.setFill(Color.FIREBRICK);
//            actionTarget.setText("Sign in button pressed");
//        });

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass()
                    .getResource("test.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Scene scene = new Scene(gridPane, 300, 275);
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}