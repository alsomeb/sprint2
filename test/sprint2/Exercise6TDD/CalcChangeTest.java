package sprint2.Exercise6TDD;

import Exercise6TDD.KassaVäxel;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
        int[] expectedArray = {1000, 500, 200, 100, 50, 20 ,10, 5, 2, 1};
        assertEquals(10, kv.getValörer().length);

        // kollar så alla siffror i array stämmer
        for (int i = 0; i < expectedArray.length; i++) {
            assertEquals(expectedArray[i], kv.getValörer()[i]);
        }
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
        assertEquals("Kronor", kv.getSedelEllerMyntString(amount2));
        assertEquals("Kronor", kv.getSedelEllerMyntString(amount5));
        assertEquals("Kronor", kv.getSedelEllerMyntString(amount10));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount20));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount50));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount100));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount200));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount500));
        assertEquals("Lappar", kv.getSedelEllerMyntString(amount1000));
    }

    @Test
    void testIfNoVäxelBack() {
        int priceToPay = 1000;
        int givenAmount = 1000;
        assertEquals(0, kv.calculateChange(givenAmount, priceToPay));
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

    // testar inläsning,
    // provar skriva in 0 kr
    @Test
    void testGetResultReturnsCorrectIfNoChange() {
        assertEquals("Det blev ingen växel", kv.getResult(0).get(0));
        assertNotEquals("Du lämnade för lite pengar", kv.getResult(0).get(0));
    }

    // Test för 654 kr skriver ut dessa rader
    @Test
    void testPrintResultToListReturnsCorrect() {
        List<String> target = kv.printResultToList(654);
        System.out.println(target);
        List<String> expected = new ArrayList<>(List.of(
                "Antal 500-Lappar: 1", "Antal 100-Lappar: 1", "Antal 50-Lappar: 1", "Antal 2-Kronor: 2"
        ));
        assertEquals(expected, target);
    }

    @Test
    void testGetInputThrowsIllegalArgumentExceptionIfNotEnoughMoney() {
        assertThrows(IllegalArgumentException.class, ()->{
            kv.calculateChange(100,200);
        });
    }

    @Test
    void testGetInputDoesntThrowWithEnoughMoney() {
        assertDoesNotThrow( ()-> kv.calculateChange(200, 100)); // Korrekt skall inte kasta fel
    }
}