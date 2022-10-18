package Exercise11;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class HuvudProgram {
    public HuvudProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange videobandets längd: ");
        Duration length = Duration.ofMinutes(scanner.nextLong());

        System.out.print("Hittills använd tid av bandet: ");
        Duration currentlyUsedSpaceOfTape = Duration.ofMinutes(scanner.nextLong());

        System.out.print("den tidpunkt då tv-programmet börjar: ");
        LocalTime start = LocalTime.parse(scanner.next()); // next inte next line, inga spaces

        System.out.print("den tidpunkt då tv-programmet slutar: ");
        LocalTime end = LocalTime.parse(scanner.next());

        VideoBand bandet = new VideoBand(length, currentlyUsedSpaceOfTape);
        long totalMinsOfShow = bandet.calcTimeOfRecordingInMinutes(start, end);
        long totalRemainder = bandet.getRemainder(totalMinsOfShow);
        System.out.println(totalRemainder);

        if(totalRemainder >= 0) {
            System.out.println("Finns plats");
        } else {
            System.out.println("Finns inte plats");
        }



    }

    public static void main(String[] args) {
        new HuvudProgram();
    }
}
