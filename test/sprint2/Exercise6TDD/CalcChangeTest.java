package sprint2.Exercise6TDD;

import Exercise6TDD.KassaVäxel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcChangeTest {
    KassaVäxel kv = new KassaVäxel();

    @Test
    void testGetChange() {
        int givenAmountToCashier = 1000;
        int priceToPay = 654;
        assertEquals(346, kv.calculateChange(givenAmountToCashier, priceToPay));
        assertNotEquals(246, kv.calculateChange(givenAmountToCashier, priceToPay));
    }

    @Test
    void testGetValörerReturnsTenValörer() {
        assertEquals(10, kv.getValörer().length);
    }


    @Test
    void testGetAmountOfValör() {
        int valör = 100; // Alltså sedlar / mynt
        int amount = 400;
        assertEquals(4, kv.getAmountOfValör(amount, valör)); // förväntar oss 4, 100kr sedlar
        assertNotEquals(2, kv.getAmountOfValör(amount, valör)); // förväntar oss 4, 100kr sedlar
        System.out.println(kv.getAmountOfValör(amount, valör));
    }

    @Test
    void testGetSedelEllerMyntString(){
        int amount2 = 2;
        int amount5 = 5;
        int amount10 = 10;
        int amount20 = 20;
        int amount50 = 50;
        int amount100 = 100;
        int amount200 = 200;
        int amount500 = 500;
        int amount1000 = 1000;
        assertEquals("Mynt", kv.getSedelEllerMyntString(amount2));
        assertEquals("Mynt", kv.getSedelEllerMyntString(amount5));
        assertEquals("Mynt", kv.getSedelEllerMyntString(amount10));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount20));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount50));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount100));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount200));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount500));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount1000));
    }

    @Test
    void test() {
        kv.printResult(654);
    }

    @Test
    void testRemoveBiggestValörFromChange() {
        int amount = 1000;
        int valör = 200;
        int antalValör = 3;
        System.out.println(kv.removeBiggestValör(amount, valör, antalValör)); // ger 200 * 3 dvs 600kr, 1000-600 får 400 kr kvar
        assertEquals(400, kv.removeBiggestValör(amount, valör, antalValör));
        assertNotEquals(1000, kv.removeBiggestValör(amount, valör, antalValör));
        assertNotEquals(200, kv.removeBiggestValör(amount, valör, antalValör));
    }
}