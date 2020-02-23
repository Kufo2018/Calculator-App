package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Calculator_Controller {

    @FXML
    private Label result;
    private long numberOne = 0;
    private String operator = "";
    private Boolean start = true;
    private Calculator_Model calculatorModel = new Calculator_Model();

    @FXML
    public void processNumbers(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }

        // Gets the text value of the button clicked and assigns to a variable
        String value = ((Button) event.getSource()).getText();

        // This is necessary when entering a value with multiple digits
        // This also makes sense cos we'd need to display numbers and
        // their operators at the same time
        result.setText(result.getText() + value);
    }

    @FXML
    public void processOperator(ActionEvent event) {

        // Gets the text value of the button clicked and assigns to a variable
        String value = ((Button) event.getSource()).getText();
        if (!value.equals("=")) {
            if (!operator.isEmpty()) {
                return;
            }
            operator = value;

            // Saves the first value in variable numberOne
            numberOne = Long.parseLong(result.getText());
            System.out.println(numberOne);
            result.setText("");
        } else {
            if (operator.isEmpty()) {
                return;
            }

            // Saves the second value in a variable numberTwo
            long numberTwo = Long.parseLong(result.getText());
            float output = calculatorModel.calculate(numberOne, numberTwo, operator);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }


}
