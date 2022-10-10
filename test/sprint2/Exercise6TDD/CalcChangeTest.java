package sprint2.Exercise6TDD;

import Exercise6TDD.CalcChange;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CalcChangeTest {

    // För nr formatering i testerna
    double formatDoubleToOneDecimal(double number) {
        BigDecimal bg = new BigDecimal(number).setScale(1, RoundingMode.HALF_UP);
        return bg.doubleValue();
    }


    // Indata till programmet är det pris man ska betala samt det belopp man betalar med.
    // Läs och skriv till/från kommandoraden.

    // Beräkna hur många 1000-lappar, 500-lappar, 200-lappar, 100-lappar, 50-lappar,
    // 20-lappar, 10-kronor, 5-kronor, 2-kronor och enkronor man ska få tillbaka -> utifrån av användarens givna belopp.

    // Växeln ska alltid innehålla så mycket som möjligt av högsta möjliga valörer

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

    CalcChange calc = new CalcChange();

    @Test
    void testCalcChange() {
        int priceToPay = 600;
        int givenAmount = 1000;
        assertEquals(400, calc.calcChange(priceToPay, givenAmount));
        assertNotEquals(1000, calc.calcChange(priceToPay, givenAmount));
        assertNotEquals(600, calc.calcChange(priceToPay, givenAmount));
    }

    @Test
    void testGetAllAvailableChange() {
        int[] sedlarOchMynt = {1000,500,200,100,50,20,10,5,2,1};

        assertEquals(10, calc.getSedlarOchMynt().length);
        assertNotEquals(9, calc.getSedlarOchMynt().length);

        // Loopar igenom testListan och den faktiskta för att kolla att ordningen är korrekt
        for (int i = 0; i < sedlarOchMynt.length; i++) {
            assertEquals(sedlarOchMynt[i], calc.getSedlarOchMynt()[i]);
        }
    }

    @Test
    void testGetCoinOrBill() {
        int amount1000 = 1000;
        int amount500 = 500;
        int amount200 = 200;
        int amount100 = 100;
        int amount50 = 50;
        int amount20 = 20;
        int amount10 = 10;
        int amount5 = 5;
        int amount2 = 2;
        int amount1 = 1;

        assertEquals("Sedel", calc.getCoinOrBill(amount1000));
        assertEquals("Sedel", calc.getCoinOrBill(amount500));
        assertEquals("Sedel", calc.getCoinOrBill(amount200));
        assertEquals("Sedel", calc.getCoinOrBill(amount100));
        assertNotEquals("Mynt", calc.getCoinOrBill(amount100));
        assertEquals("Mynt", calc.getCoinOrBill(amount10));
        assertNotEquals("Sedel", calc.getCoinOrBill(amount10));
        assertEquals("Sedel", calc.getCoinOrBill(amount20));
        assertNotEquals("Mynt", calc.getCoinOrBill(amount20));
        assertEquals("Sedel", calc.getCoinOrBill(amount50));
        assertEquals("Mynt", calc.getCoinOrBill(amount5));
        assertEquals("Mynt", calc.getCoinOrBill(amount2));
        assertEquals("Mynt", calc.getCoinOrBill(amount1));
    }

    @Test
    void testGetLineForOneValör() {
        int amountOfValör = 3;
        int valör = 100;
        assertEquals("Antal 100 Sedel: 3", calc.getLineForOneValör(amountOfValör, valör));
        assertNotEquals("Antal 100 Sedel: 5", calc.getLineForOneValör(amountOfValör, valör));
    }

    @Test
    void print() {
        calc.printResult(654);
    }
}