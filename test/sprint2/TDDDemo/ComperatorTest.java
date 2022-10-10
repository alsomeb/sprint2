package sprint2.TDDDemo;

import TDDDemo.Comparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComperatorTest {
    Comparator c = new Comparator();

    @Test
    public void compareTest() {
        int i1 = 45;
        int i2 = 65;
        assertTrue(c.compare(i1, i2)); // true det är en ökning
        assertFalse(c.compare(i2, i1)); // false pga ingen ökning
        assertFalse(c.compare(i2, i2)); // false, lika tal, ingen ökning
    }
}
