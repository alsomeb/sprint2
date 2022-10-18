package Exercise13;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MathOperator {
    private final List<String> operators = new ArrayList<>(List.of("+", "-", "*", "/"));

    public List<String> getOperators() {
        return operators;
    }


    public boolean isOperator(String correctOperator) {
        switch (correctOperator) {
            case "+", "-", "*", "/" -> {
                return true;
            }
        }
        return false;
    }

    public double calculate(double nr1, double nr2, String operator) throws OperatorNotSupportedException {
        if(isOperator(operator)){
            switch (operator) {
                case "+" -> {
                    return nr1 + nr2;
                }
                case "-" -> {
                    return nr1 - nr2;
                }
                case "*" -> {
                    return nr1 * nr2;
                }
                case "/" -> {
                    if(nr2 == 0) {
                        throw new ArithmeticException();
                    }
                    return nr1 / nr2;
                }
            }
        }
        throw new OperatorNotSupportedException();
    }

    public double collectNumberPrompt(int count) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog("Ange ett tal " + count));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Du har inte skrivit in siffror");
            }
        }
    }

    public String collectOperatorPrompt() {
        return JOptionPane.showInputDialog("Ange operatorn");
    }
}
