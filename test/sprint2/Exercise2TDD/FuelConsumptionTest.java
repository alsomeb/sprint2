package sprint2.Exercise2TDD;
import Exercise2TDD.CarCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuelConsumptionTest {

    // Indata dagens MätarStälln, sedan för 1 år sedan, sedan liter bensin förbrukat på 1 år
    CarCalculator cc = new CarCalculator();

    @Test
    void testCalcMileageReturnsCorrect() {
        double mileageStart = 100;
        double mileageEnd = 1000;
        assertEquals(900, cc.calcMileageDrivenLastYear(mileageStart, mileageEnd));
    }

    @Test
    void testCalcAverageGasUsedReturnsCorrect() {
        double amountOfGasUsed = 10000;
        double distanceDrivenLastYear = 200;
        double test = cc.calcAverageGasUsedLastYear(amountOfGasUsed, distanceDrivenLastYear);
        assertEquals(50, test);
    }

    @Test
    void testPrintResultFormatCorrect() {
        assertEquals("Förbrukning per mil: 0.89", cc.printAverageGasUsage(0.89));
        assertEquals("Antal körda mil: 1000.0", cc.printTotalMileageDriven(1000));
        assertEquals("Antal liter bensin: 200.0", cc.printGasUsedLastYear(200));
    }
}
