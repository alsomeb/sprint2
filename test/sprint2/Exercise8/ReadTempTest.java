package sprint2.Exercise8;

import Exercise8.ReadTemp;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadTempTest {

    File fil = new File("resources/temp.txt");
    ReadTemp rt = new ReadTemp(fil);

    @Test
    void testReadAllLinesInFileToList() {
        int expectedLines = 30;
        assertEquals(expectedLines, rt.generateListFromFile().size());
    }

    @Test
    void testTransformToDoubleListFromStringIsCorrect() {
        System.out.println(rt.convertStringListToDoubleList());
        List<Double> doubleList = rt.convertStringListToDoubleList();
        doubleList.forEach(nr -> assertFalse(nr.isNaN()));
    }

    @Test
    void calcHighestTempReturnsCorrect() {
        double expected = 17.5;
        // Använd collections, slippa loopa själv o hitta biggest Int
        assertNotEquals(11.0, rt.getHighestTemp());
        assertEquals(expected, rt.getHighestTemp());
        System.out.println(rt.getHighestTemp());
    }

    @Test
    void calcLowestTempReturnsCorrect() {
        double expected = 6.4;
        assertNotEquals(11.0, rt.getLowestTemp());
        assertEquals(expected, rt.getLowestTemp());
        System.out.println(rt.getLowestTemp());
    }

    @Test
    void calcAverageTempReturnsCorrect() {
        double expected = 12.74;
        assertNotEquals(11.0, rt.getAverageTemp());
        assertEquals(expected, rt.getAverageTemp());
        System.out.println(rt.getAverageTemp());
    }

}