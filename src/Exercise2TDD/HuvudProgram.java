package Exercise2TDD;

import javax.swing.*;

public class HuvudProgram {
    public static void main(String[] args) {
        CarCalculator calc = new CarCalculator();

        double mileageNow = Double.parseDouble(JOptionPane.showInputDialog("Dagens mätarställning?"));
        double mileageStart = Double.parseDouble(JOptionPane.showInputDialog("Mätarställning 1 år sedan?"));
        double totalGas = Double.parseDouble(JOptionPane.showInputDialog("Antal liter bensin förb detta år ?"));

        double totalMileage = calc.calcMileageDrivenLastYear(mileageStart, mileageNow);
        double averageGas = calc.calcAverageGasUsedLastYear(totalGas, totalMileage);

        System.out.println(
                calc.printTotalMileageDriven(totalMileage) + "\n" +
                calc.printGasUsedLastYear(totalGas) + "\n" +
                        calc.printAverageGasUsage(averageGas)
        );
    }
}
