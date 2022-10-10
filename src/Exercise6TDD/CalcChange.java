package Exercise6TDD;

import java.util.HashMap;
import java.util.Map;

public class CalcChange {

    private int[] sedlarOchMynt = {1000,500,200,100,50,20,10,5,2,1};
    private String coin = "Mynt";
    private String bill = "Sedel";


    public int calcChange(int priceToPay, int givenAmount) {
        return givenAmount - priceToPay;
    }

    public int getAmountOfValör(int change, int valör) { // hur många mynt / sedlar
        return change / valör;
    }

    public String getCoinOrBill(int amount) {
        if (amount >= 20) {
            return bill;
        }
        return coin;
    }

    public int[] getSedlarOchMynt() {
        return sedlarOchMynt;
    }

    public String getLineForOneValör(int amountOfValör, int valör) {
        return "Antal " + valör + " " + getCoinOrBill(valör) + ": " + amountOfValör;
    }

    public int removeValör(int valör, int origChange, int antalValör){
        return origChange - (valör * antalValör);
    }

    public void printResult(int change) {
        for (int i = 0; i < sedlarOchMynt.length; i++) {
            int amountOfValör = getAmountOfValör(change, sedlarOchMynt[i]); // Hur många mynt / sedlar
            System.out.println(getLineForOneValör(amountOfValör, sedlarOchMynt[i])); // sedan skriver vi ut hur många
            change = removeValör(sedlarOchMynt[i], change, amountOfValör); // change minskas hela tiden
        }
    }
}

