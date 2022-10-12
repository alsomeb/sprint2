package Exercise6TDD;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class KassaVäxel {
    private final int[] valörer = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    private final String lappar = "Lappar";
    private final String mynt = "Kronor";
    private final Scanner scan;

    public KassaVäxel() {
        scan = new Scanner(System.in);
    }

    public int handleInputForCalcChange() {
        while (true) {
            try {
                int priceToPay = getInputAmountToPay();
                int givenAmount = getInputHowMuchGivenToCashier();
                return calculateChange(givenAmount, priceToPay);
            } catch (InputMismatchException e) {
                System.out.println("Håll dig till siffror!");
                scan.nextLine(); // gör för att tömma tokens så den inte loopar skiten infinitly
            } catch (IllegalArgumentException e) {
                System.out.println("Du lämnade för lite pengar");
            } catch (Exception e) {
                System.out.println("Oväntat fel uppstod");
                e.printStackTrace();
                scan.nextLine();
            }
        }
    }

    private int getInputAmountToPay() {
        System.out.print("Vilket belopp skall du betala: ");
        int priceToPay = scan.nextInt();
        return priceToPay;
    }

    private int getInputHowMuchGivenToCashier() {
        System.out.print("Ange hur mycket du ger till kassören: ");
        int givenAmount = scan.nextInt();
        return givenAmount;
    }

    public int calculateChange(int givenAmountToCashier, int priceToPay) {
        int change = givenAmountToCashier - priceToPay;

        if(change >= 0) {
            return givenAmountToCashier-priceToPay;
        }
        throw new IllegalArgumentException(); // om det är minus så kasta fel
    }

    public int getAmountOfValör(int amount, int valör) { // bara intresserade av heltalen
        return amount / valör;
    }

    public String getSedelEllerMyntString(int amount) {
        return (amount >= 20) ? lappar : mynt;  // Ternary, amount högre än 20 så sedel annars mynt
    }

    public int removeBiggestValör(int amount, int valör, int antalValör) {
        return amount - (valör * antalValör); // Så vi kan göra avdrag i iterationen i loopen
    }

    public String printAmountOfValörLine(int valör, int antalAvValör) {
        StringBuilder sb = new StringBuilder();
        sb.append("Antal ").append(valör).append("-").append(getSedelEllerMyntString(valör)).append(": ").append(antalAvValör);
        return sb.toString();
    }

    public void printResultLines(int change) { // kan komma åt change utan att dekl en variabel, o ha den som "totalen" som bearbetar i loopen
        System.out.println("Växel: " + change);
        for (int i = 0; i < valörer.length; i++) {
            int valör = valörer[i];
            int antalAvValör = getAmountOfValör(change, valör);
            if(antalAvValör > 0) { // Då visar vi bara dem relevanta
                System.out.println(printAmountOfValörLine(valör, antalAvValör));
                change = removeBiggestValör(change, valör, antalAvValör);
            }
        }
    }

    public List<String> getResult(int change) {
        return printResultToList(change);
    }

    // Så vi kan testa programmet
    public List<String> printResultToList(int change) { // kan komma åt change utan att dekl en variabel, o ha den som "totalen" som bearbetar i loopen
        List<String> lines = new ArrayList<>();

        if (change > 0) {
            System.out.println("Växel: " + change);
            for (int i = 0; i < valörer.length; i++) {
                int valör = valörer[i];
                int antalAvValör = getAmountOfValör(change, valör);
                if (antalAvValör > 0) { // Då visar vi bara dem relevanta
                    lines.add(printAmountOfValörLine(valör, antalAvValör));
                    change = removeBiggestValör(change, valör, antalAvValör);
                }
            }
        } else {
            lines.add("Det blev ingen växel");
        }
        return lines;

    }


    // Getters
    public int[] getValörer() {
        return valörer;
    }

}
