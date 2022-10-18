package Exercise12.fordon;

public class Båt extends Fordon {

    int dödvikt;

    public Båt(int hastighet, int vikt, int dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public void sväng() {
        System.out.println("Det svänger brorsan!");
    }

    // Getters n Setters


    public int getDödvikt() {
        return dödvikt;
    }

    public void setDödvikt(int dödvikt) {
        this.dödvikt = dödvikt;
    }

    @Override
    void printMe() {
        System.out.println(
                "\nVikt: " + getVikt() + "\nHastighet: " + getHastighet() + "\nDödvikt: " + dödvikt
        );
    }


    @Override
    public void printMeInterface() {
        System.out.println(
                "\nVikt: " + getVikt() + "\nHastighet: " + getHastighet() + "\nDödvikt: " + dödvikt
        );
    }
}
