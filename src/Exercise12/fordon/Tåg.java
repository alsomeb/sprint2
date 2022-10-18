package Exercise12.fordon;

public class Tåg extends Fordon {

    int antalVagnar;


    // Konstruktor om man inte ger inparameter antalVagnar så får den default 0
    public Tåg(int hastighet, int vikt) {
        super(hastighet, vikt);
    }

    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public void kopplaVagn() {
        antalVagnar++;
        System.out.println("Kopplade på 1 till vagn.\nTotalt " + antalVagnar + " vagnar just nu");
    }

    // Getters N Setters

    public int getAntalVagnar() {
        return antalVagnar;
    }
    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    @Override
    void printMe() {
        System.out.println(
                "\nVikt: " + getVikt() + "\nHastighet: " + getHastighet() + "\nAntal vagnar: " + antalVagnar
        );
    }


    @Override
    public void printMeInterface() {
        System.out.println(
                "\nVikt: " + getVikt() + "\nHastighet: " + getHastighet() + "\nAntal vagnar: " + antalVagnar
        );
    }
}
