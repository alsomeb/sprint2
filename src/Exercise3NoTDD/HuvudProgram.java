package Exercise3NoTDD;

import java.util.Scanner;

public class HuvudProgram {
    HuvudProgram() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write Something: ");

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if(line.equalsIgnoreCase("bye")) System.exit(0);

            System.out.print("Du skrev: " + line);
            System.out.print("\nWrite Something: ");
        }
    }

    public static void main(String[] args) {
        new HuvudProgram();
    }
}
