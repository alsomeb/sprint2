package sprint2.Exercise1TDD;

import Exercise1TDD.LikbentTriangel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LikbentTriangelTest {
    LikbentTriangel tr = new LikbentTriangel(5, 10);

    @Test
    void testGetArea() {
        assertEquals(25, tr.getArea());  // bredden * höjd / 2
        assertNotEquals(50, tr.getArea());
    }

    @Test
    void testgetCircumference() {
        double numOne = tr.getWidth() / 2;
        double pythoOne = Math.pow(numOne,2);
        double pythoTwo = Math.pow(tr.getLength(),2);
        double sideB = Math.sqrt(pythoTwo + pythoOne);

        double circumference = sideB * 2 + tr.getWidth();
        assertEquals(circumference, tr.getCircumference());
        assertNotEquals(60, tr.getCircumference());
    }
}
