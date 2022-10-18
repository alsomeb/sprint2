package Exercise12.fordon;

import java.io.Serializable;

public abstract class Fordon implements Printable, Serializable {
    // Behöver ej implement metoden printMeInterface() i denna klass pga abstract!
    // metoden måste skapas och overrides i subklasserna, dynamisk bindning
    // Sedan ärvs detta interface till subklasserna, behöver ej skriva implements i namnet !

    private int hastighet; // or protected making them accessible in the same package and subclasses.
    private int vikt;


    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    // Abstract metod printMe()
    abstract void printMe();


    // Getters n Setters
    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public int getVikt() {
        return vikt;
    }

    }
