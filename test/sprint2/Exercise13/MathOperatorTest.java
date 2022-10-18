package sprint2.Exercise13;

import Exercise13.MathOperator;
import Exercise13.OperatorNotSupportedException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathOperatorTest {

    MathOperator operators = new MathOperator();

    @Test
    void testGetOperatorsReturnCorrectOperators() {
        List<String> expectedOperators = new ArrayList<>(List.of("+", "-", "*", "/"));
        assertEquals(operators.getOperators(), expectedOperators);
        assertEquals(operators.getOperators().size(), expectedOperators.size());
    }

    @Test
    void testIsOperator() {
        String correctOperator = "+";
        String wrongOperator = "%";
        assertTrue(operators.isOperator(correctOperator));
        assertFalse(operators.isOperator(wrongOperator));
    }

    @Test
    void testCalculate() throws OperatorNotSupportedException {
        double nr1 = 10;
        double nr2 = 2;
        assertEquals(12, operators.calculate(nr1, nr2, "+"));
        assertEquals(20, operators.calculate(nr1, nr2, "*"));
        assertEquals(5, operators.calculate(nr1, nr2, "/"));
        assertEquals(8, operators.calculate(nr1, nr2, "-"));
        assertNotEquals(10, operators.calculate(nr1, nr2, "+"));
        assertNotEquals(10, operators.calculate(nr1, nr2, "-"));
        assertNotEquals(10, operators.calculate(nr1, nr2, "*"));
        assertNotEquals(10, operators.calculate(nr1, nr2, "/"));
        assertThrows(OperatorNotSupportedException.class, ()-> operators.calculate(nr1, nr2, "%"));
        assertThrows(ArithmeticException.class, ()-> operators.calculate(nr1, 0, "/"));
        assertDoesNotThrow(()-> operators.calculate(nr1, nr2, "*"));
    }

}
