package Exercise6Igen;

import java.util.ArrayList;

public class CalcVäxel {

    private int[] valörer = {1000,500,200,100,50,20,10,5,2,1};

    private String mynt = "Mynt";
    private String sedel = "Sedel";


    public int calcChange(int priceToPay, int givenAmount) {
        return givenAmount-priceToPay;
    }


    //konverterar differensen man ska få tillbaka till en sträng
    public String convertIntToString(int value) {
        return String.valueOf(value);
    }

    //konverterar från int 654 till sträng "654"

    public int getStringSize(String myString) {
        return myString.length();
    }

    //int på 654 med en storlek av 3

    public char getFirstCharacterOfString(String växel) {
        return växel.charAt(0);
    }

    //fått ut första karaktären

        //gör en metod

    //vi tittar vad den första karaktären är större än 5(00), 2(00) eller 1(00)



    //jag är en metod som kollar valörer
        //654, då ska jag ta 654 - 500,
            //myValörer.add() = "1st, 500 sedel"
    ArrayList<String> myvalörer = new ArrayList<>();



    //hämta första index
    //konvertera ut ur sträng, jämför att första siffran är mer än 5
    //kolla vilken valör vi ska dela med
    //konvertera in och ut ur en sträng
}
