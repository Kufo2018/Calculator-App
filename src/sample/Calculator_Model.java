package sample;

public class Calculator_Model {

    public float calculate(long numberOne, long
            numberTwo, String operator) {

        switch (operator) {
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return numberOne * numberTwo;
            case "/":
                if (numberTwo == 0)
                    return 0;
                return numberOne / numberTwo;
            default:
                return 0;
        }


    }

}
