package sprint2.Exercise1TDD;
import Exercise1TDD.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    Square square = new Square(5, 5);

    @Test
    void getAreaTest() {
        double expectedArea = 5 * 5;
        assertEquals(expectedArea, square.getArea());
    }

    @Test
    void getCircumferenceTest() {
        double expectedCircumference = 4 * 5;
        assertEquals(expectedCircumference, square.getCircumference());
    }
}
