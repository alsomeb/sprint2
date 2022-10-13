package Exercise8;

import java.io.File;

public class HuvudProgram {
    public static void main(String[] args) {
        ReadTemp temp = new ReadTemp(new File("resources/temp.txt"));
        System.out.println("Minsta: " + temp.getLowestTemp());
        System.out.println("Medel: " + temp.getAverageTemp());
        System.out.println("Högsta: " + temp.getHighestTemp());
    }
}
