package Exercise6Igen;

public class HuvudProgram {

    HuvudProgram() {
        CalcVäxel calc = new CalcVäxel();

        int price = 654;
        int givenAmount = 1000;
        int change = calc.calcChange(price, givenAmount); // = 346

        String changeString = calc.convertIntToString(change); // = 346 -> "346"
        int lengthOfString = changeString.length(); // "346" -> 3
        char letter = calc.getFirstCharacterOfString(changeString);
        int letterToInt = Integer.parseInt(String.valueOf(letter));

        if (lengthOfString > 3) {
            int amountOfTusenLappar = change/1000;
            //vårArrayLista = spara antalet tusenlappar
            change = change - amountOfTusenLappar*1000;

        } else if (lengthOfString > 2);

    }

    public static void main(String[] args) {
        new HuvudProgram();
    }
}
