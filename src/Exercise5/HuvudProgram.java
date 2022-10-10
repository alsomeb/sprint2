package Exercise5;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class HuvudProgram {
    public static void main(String[] args) {


        // För att komma åt dem utanför för annars är vi ej i rätt scope
        String bil = "";
        double totPris = 0;
        boolean isDone = false;

        while (!isDone) {
            String indata = showInputDialog("Ange antal dagar, pris per dag samt bilmodell");
            if(indata == null) {
                System.exit(0); // Om man klickar cancel
            }

            Scanner sc = new Scanner(indata);
            try {
                int antalDagar = sc.nextInt();
                double dagsPris = sc.nextDouble();
                bil = sc.next();
                totPris = dagsPris * antalDagar;
                isDone = true;
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Du har glömt att fylla i något tal!");
            } catch (NoSuchElementException e) {
                JOptionPane.showMessageDialog(null, "Du har ej fyllt i korrekt, saknas data");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ospecificerat fel har inträffat");
            }
        }

        String s = String.format("Totalt pris för %s: %.2f", bil, totPris);
        showMessageDialog(null, s);

    }
}
