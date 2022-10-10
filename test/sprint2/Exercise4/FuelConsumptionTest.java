package sprint2.Exercise4;

import Exercise2TDD.CarCalculator;
import Exercise4.CarCalculatorTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuelConsumptionTest {

    // Indata dagens MätarStälln, sedan för 1 år sedan, sedan liter bensin förbrukat på 1 år
    CarCalculatorTwo cc = new CarCalculatorTwo();

    @Test
    void testCalcMileageReturnsCorrect() {
        double mileageStart = 1000;
        double mileageEnd = 2000;
        assertEquals(1000, cc.calcMileageDrivenLastYear(mileageStart, mileageEnd));
    }

    @Test
    void testCalcAverageGasUsedReturnsCorrect() {
        double amountOfGasUsed = 1000;
        double distanceDrivenLastYear = 1000;
        double test = cc.calcAverageGasUsedLastYear(amountOfGasUsed, distanceDrivenLastYear);
        assertEquals(1.0, test);
    }

    @Test
    void testPrintResultFormatCorrect() {
        assertEquals("Förbrukning per mil: 1.0", cc.printAverageGasUsage(1.0));
        assertEquals("Antal körda mil: 1000.0", cc.printTotalMileageDriven(1000));
        assertEquals("Antal liter bensin: 1000.0", cc.printGasUsedLastYear(1000));
    }
}
