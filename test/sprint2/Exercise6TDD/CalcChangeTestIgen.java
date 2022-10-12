package sprint2.Exercise6TDD;
import Exercise6Igen.CalcVäxel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcChangeTestIgen {
    /*
    Ledtrådar:

    - Måste räkna ut växeln utifrån pris och lämnade pengar - KLAR

    - Måste hålla reda på vilka valörer som finns - KLAR

    - Rekommendation är att lägga dessa värden i en lista som du itererar över
    när du räknar ut hur mycket av varje valör som ska ges tillbaka - KLAR

    - Du måste räkna ut hur många enheter av en valör som ska ges i växeln

    - När du har räknat ut hur många antal (y) av valör x som ska ges i växel
    måste du subtrahera dessa från växeln inför nästa iteration
    Ex: antag att växeln är 654, då ska du ge 6st 100-lappar,
    sen måste du dra av 600 innan du räknar ut hur många 50-lappar som ska ges
     */

    CalcVäxel calc = new CalcVäxel();

    @Test
    void testCalcChange() {
        int priceToPay = 700;
        int givenAmount = 1000;
        assertEquals(300, calc.calcChange(priceToPay, givenAmount));
        assertNotEquals(700, calc.calcChange(priceToPay, givenAmount));
    }

    @Test
    void testNumberTransformToStringIsCorrect() {
        int växel = 653;
        String växelString = calc.convertIntToString(växel);
        assertEquals("653", växelString);
        assertEquals(3, växelString.length());
        assertNotEquals(4, växelString.length());
        assertNotEquals(5, växelString.length());
        System.out.println(växel);
        System.out.println(växelString.length());
    }

    @Test
    void testGetFirstIndexOfTransformedString() {
        int växel = 653;
        String växelString = calc.convertIntToString(växel);
        assertEquals('6', växelString.charAt(0));
    }

    @Test
    void whatIsFirstIndexOfString() {

    }

    // 500, 200, 100



}
