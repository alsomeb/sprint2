package Exercise6TDD;

public class KassaVäxel {
    private int[] valörer = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    private String lappar = "Lappar";
    private String mynt = "Mynt"; //

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


    // Getters
    public int[] getValörer() {
        return valörer;
    }

}
