package Exercise12.fordon;

public class Cykel extends Fordon implements HjulBuren {

    // Skrev inga tester på cyckel, samma som Bil

    private int antalVäxlar;
    private int växelJustNu;

    public Cykel(int hastighet, int vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt); // <-- från Fordon
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public void växlaUpp() {
        int current = getVäxelJustNu();
        if(current < antalVäxlar) {
            växelJustNu++;
            System.out.println("Växlade upp till " + växelJustNu);
        } else {
            System.out.println("Kan ej växla upp mer, bilen har bara: " + antalVäxlar + " växlar.");
        }
    }

    public void växlaNer() {
        int current = getVäxelJustNu();
        if(current > 1) {
            växelJustNu--;
            System.out.println("Växlade ner till " + växelJustNu);
        } else {
            System.out.println("Kan ej växla ner mer, bilen har bara: " + antalVäxlar + " växlar.");
        }
    }

    // Getters n Setters
    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    public void setVäxelJustNu(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }

    @Override
    void printMe() {
        System.out.println(
                "\nVikt: " + getVikt() + "\nHastighet: " + getHastighet() + "\nAntal växlar: " + antalVäxlar + "\nVäxel just nu: " + växelJustNu
        );
    }


    @Override
    public void printMeInterface() {
        System.out.println(
                "\nVikt: " + getVikt() + "\nHastighet: " + getHastighet() + "\nAntal växlar: " + antalVäxlar + "\nVäxel just nu: " + växelJustNu
        );
    }


    @Override
    public int antalHjul() {
        return 2;
    }
}
