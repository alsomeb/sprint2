package Exercise2TDD;

public class CarCalculator {
    public double calcMileageDrivenLastYear(double mileage1, double mileage2) {
        return mileage2 - mileage1;
    }

    public double calcAverageGasUsedLastYear(double amountOfGasUsed, double distanceDrivenLastYear) {
        return amountOfGasUsed / distanceDrivenLastYear;
    }

    public String printTotalMileageDriven(double distance) {
        return "Antal körda mil: " + distance;

    }

    public String printGasUsedLastYear(double gasUsedLastYear){
        return "Antal liter bensin: " + gasUsedLastYear;
    }

    public String printAverageGasUsage(double averageGasUsage){
        return "Förbrukning per mil: " + averageGasUsage;
    }
}
