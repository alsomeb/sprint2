package Exercise13;

import javax.swing.*;

public class HuvudProgram {
    public HuvudProgram() {
        MathOperator operators = new MathOperator();
        int count = 0;

        while (true) {
            try {
                count++;
                double nr1 = operators.collectNumberPrompt(count);
                double nr2 = operators.collectNumberPrompt(++count); // ++count == tar +1 på talet före innan användning
                String operator = operators.collectOperatorPrompt();
                JOptionPane.showMessageDialog(null, operators.calculate(nr1, nr2, operator));
                break;
            } catch (OperatorNotSupportedException e) { // <-- eget Checked exception
                JOptionPane.showMessageDialog(null, "Operatorn stöds ej");
            } catch (ArithmeticException e) { // <-- Unchecked, som vi kastar i switch får ej div med 0
                JOptionPane.showMessageDialog(null, "Får ej dela med 0");
            }
        }


    }
    public static void main(String[] args) {
        new HuvudProgram();
    }
}
