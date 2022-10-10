package sprint2.Exercise1TDD;
import Exercise1TDD.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    Circle test = new Circle(10); // radie

    @Test
    void testGetArea() {
        double area = test.getArea();
        assertEquals(314.1592653589793, area);
    }

    @Test
    void testGetCircumference() {
        assertEquals(62.83185307179586, test.getCircumference());
    }
}
