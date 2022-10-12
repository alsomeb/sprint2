package Exercise6TDD;

import java.util.List;

public class HuvudProgram {
    public static void main(String[] args) {
        KassaVäxel kv = new KassaVäxel();

        // hårdkodad input
        int priceToPay = 200;
        int priceGiven = 654;
        int change = kv.calculateChange(priceGiven, priceToPay);
        List<String> results = kv.getResult(change);
        results.forEach(result -> System.out.println(result));


        System.out.println("\n--------");

        // Med Scanner
        int växel = kv.handleInputForCalcChange();
        List<String> resultat = kv.getResult(växel);
        resultat.forEach(result -> System.out.println(result));



    }
}
