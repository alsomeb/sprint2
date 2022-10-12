package Exercise6TDD;

import java.util.ArrayList;
import java.util.List;

public class KassaVäxel {
    private final int[] valörer = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    private final String lappar = "Lappar";
    private final String mynt = "Kronor";

    public int calculateChange(int givenAmountToCashier, int priceToPay) {
        return givenAmountToCashier-priceToPay;
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
        return "Antal " + valör + "-" + getSedelEllerMyntString(valör) + ": " + antalAvValör;
    }

    public void printResult(int change) { // kan komma åt change utan att dekl en variabel, o ha den som "totalen" som bearbetar i loopen
        for (int i = 0; i < valörer.length; i++) {
            int valör = valörer[i];
            int antalAvValör = getAmountOfValör(change, valör);
            if(antalAvValör > 0) { // Då visar vi bara dem relevanta
                System.out.println(printAmountOfValörLine(valör, antalAvValör));
                change = removeBiggestValör(change, valör, antalAvValör);
            }
        }
    }

    // Så vi kan testa programmet
    public List<String> printResultToList(int change) { // kan komma åt change utan att dekl en variabel, o ha den som "totalen" som bearbetar i loopen
        List<String> lines = new ArrayList<>();

        for (int i = 0; i < valörer.length; i++) {
            int valör = valörer[i];
            int antalAvValör = getAmountOfValör(change, valör);
            if(antalAvValör > 0) { // Då visar vi bara dem relevanta
                lines.add(printAmountOfValörLine(valör, antalAvValör));
                change = removeBiggestValör(change, valör, antalAvValör);
            }
        }
        return lines;
    }


    // Getters
    public int[] getValörer() {
        return valörer;
    }

}
