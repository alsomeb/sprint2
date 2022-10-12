package Exercise6TDD;

import java.util.List;

public class HuvudProgram {
    public static void main(String[] args) {
        KassaVäxel kv = new KassaVäxel();
        int priceToPay = 200;
        int priceGiven = 654;
        int change = kv.calculateChange(priceGiven, priceToPay);

       List<String> results = kv.getResult(change);
       results.forEach(result -> System.out.println(result));

    }
}
