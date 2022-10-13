package Exercise8;

import java.io.File;
import java.nio.file.Paths;

public class HuvudProgram {
    public static void main(String[] args) {
        ReadTemp temp = new ReadTemp(Paths.get("resources/temp.txt"));
        System.out.printf("Minsta: %.2f\nMedel: %.2f\nHögsta: %.2f",
                temp.getLowestTemp(),
                temp.getAverageTemp(),
                temp.getHighestTemp());
    }
}
