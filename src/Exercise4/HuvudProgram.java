package Exercise4;

public class HuvudProgram {
    HuvudProgram() {
        CarCalculatorTwo cc = new CarCalculatorTwo();
        double mileageEnd = cc.getInParameter("Mätarställning just nu ?");
        double mileageStart = cc.getInParameter("Mätarställning för 1 år sedan?");
        double totalGas = cc.getInParameter("Antal bensin förbrukat i liter?");

        double totalMileage = cc.calcMileageDrivenLastYear(mileageStart, mileageEnd);
        double avgGas = cc.calcAverageGasUsedLastYear(totalGas, totalMileage);

        System.out.println(
                cc.printTotalMileageDriven(totalMileage) + "\n" +
                        cc.printGasUsedLastYear(totalGas) + "\n" +
                        cc.printAverageGasUsage(avgGas)
        );


    }

    public static void main(String[] args) {
        new HuvudProgram();
    }

}
