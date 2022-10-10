package Exercise4;

import java.util.Scanner;

public class CarCalculatorTwo {

    private Scanner scan = new Scanner(System.in);

    public double getInParameter(String promptMessage) {
        while (true) {
            System.out.println(promptMessage);
            if(scan.hasNextDouble()) {
                return scan.nextDouble();
            } else {
                scan.nextLine(); //  .next() för token ligger kvar, så man får en ny chans, nextLine har med hela linen om du vill ha med tex "Hej jag heter alex" annars tar den "Hej"
            }
        }
    }

    public double calcMileageDrivenLastYear(double start, double stop) {
        return stop - start;
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
