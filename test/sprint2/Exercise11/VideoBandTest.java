package sprint2.Exercise11;

import Exercise11.VideoBand;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
/*
        Förr när man fortfarande spelade in film på videoband var det ibland svårt att veta
        om ett kommande tv-program skulle få plats på bandet.

        Skriv ett program som hjälper oss räkna ut om ett band kommer att räcka eller inte.
        Programmet ska fråga efter videobandets längd (i minuter), hittills använd tid av
        bandet, den tidpunkt då tv-programmet börjar och den tidpunkt då det slutar (anges
        som klockslag, tt:mm).

        Använd klasserna LocalTime och Duration för att räkna ut tiden.
        Jobba testdrivet och skriv testerna innan du skriver koden. Om användaren skriver in
        något konstigt, visa ett felmeddelande.

 */

class VideoBandTest {

    Duration lengthOfTape = Duration.ofMinutes(60);
    VideoBand bandet = new VideoBand(lengthOfTape);

    @Test
    void testSetLengthOfTape() {
        Duration length = Duration.ofMinutes(60); // user input
        bandet.setLengthOfTape(length);
        assertEquals(Duration.ofMinutes(60), bandet.getLength());
    }

    @Test
    void testGetCurrentUsedOnTape() {
        Duration theSimpsons = Duration.ofMinutes(40);
        Duration remains = bandet.getLength().minusMinutes(theSimpsons.toMinutes());
        System.out.println(remains.toMinutes());
    }

    @Test
    void testCalcTimeOfRecording(){
        LocalTime start = LocalTime.of(15, 0);
        LocalTime end = LocalTime.of(16, 0);
        Duration expected = Duration.ofMinutes(60);
        assertEquals(expected.toMinutes(), bandet.calcTimeOfRecordingInMinutes(start, end));
        System.out.println(bandet.calcTimeOfRecordingInMinutes(start, end));
    }




}