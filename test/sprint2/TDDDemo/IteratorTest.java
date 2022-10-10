package sprint2.TDDDemo;

import TDDDemo.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
    Iterator i = new Iterator();

    List<Integer> testData = new ArrayList<>(List.of(
            199, 200, 208, 210, 200, 207,240, 269, 260, 263
    ));

    @Test
    public void iterateTest() {

        assertEquals(7, i.iterate(testData)); // 7 gånger stod det att de skulle va höjningar på AoC
        assertNotEquals(6, i.iterate(testData));
    }
}
