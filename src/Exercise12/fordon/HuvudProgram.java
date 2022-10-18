package Exercise12.fordon;

import java.util.ArrayList;
import java.util.List;

public class HuvudProgram {
    public static void main(String[] args) {
        /*
            - https://studentportal.nackademin.se/pluginfile.php/297512/mod_resource/content/0/%C3%96vningsuppgifter%20Sprint1%20JAVA22.pdf

              Uppgift 2 A Arv:
            - Implementera följande klassdiagram.
            - Detta sätt att rita kallas UML och är vanligt förekommande för att illustrera klasshierarkier.
            - Överst, i varje ruta, står klassnamnet på de klasser ni ska skriva.
            - I mitten finns instansvariablerna. Nederst instansmetoderna i varje klass.
            - Triangeln betyder att nedanstående klasser ärver ovanstående.
            - Ni ska alltså skriva nedanstående 5 klasser, med de instansvariabler och instansmetoder som anges (och också arvet).
            - Ni behöver inte lägga tid på vettig kod för ”sväng”-metoden.
            - Testa att använda super constructor.

            - (EXTRA ALEX) skapa en metod som gör ngt, kanske plussar något - KLAR:
            - Skriv ett JUnit Test på den metoden - KLAR!



            Uppgift 2b – Abstrakt superklass, polymorfism
           - Låt Fordon bli abstrakt
           - Lägg till den abstrakta metoden printMe() i Fordon och implementera den i de olika subklasserna.
           - printMe() ska skriva ut vikt, hastighet och övriga data för varje subklass.
           - Lägg sedan till ett huvudprogram som skapar upp ett fordon av varje sort.
           - Lägg till en metod som skriver ut data om de fordon du skapat.
           - Anropa utskriftsmetoden från ditt huvudprogram


            Uppgift 2c - Använd interface istället
           - Skriv ett interface Printable och låt metoden printMe vara deklarerad där.
           - Låt sedan dina fordonsklasser implementera Printable.
            - Gör en ny utskriftsmetod som skriver ut fordonens data genom att anropa printMe via Printable-
            interfacet,

            - Istället för att direkt anropa fordonsklassernas printMe-metod.
            - Lägg till ett anrop till denna nya metod från ditt huvudprogram


            Uppgift 2d - Interface, polymorfism
            - Lägg till ett ytterligare interface “Hjulburen” som har metoden getAntalHjul()
            - Låt relevanta klasser implementera interfacet (lägg till instansvariabler vid behov)
            - Skapa upp några objekt av typen “Hjulburen” med olika implementerande klasser och skriv ut antalet hjul för varje fordon


         */


        // Valde göra såhär för är BARA intresserad av printMe() metoden, inget annat i detta fall!
        Fordon bil = new Bil(150, 1500, 6, 1);
        Fordon cykel = new Cykel(30, 10, 21, 3);
        Fordon tåg = new Tåg(300, 50000, 5);
        Fordon båt = new Båt(100, 1000, 5000);

        ArrayList<Fordon> listaAvFordon = new ArrayList<>(
                List.of(bil, cykel, tåg, båt)
        );

        listaAvFordon.forEach(fordon -> printFordon(fordon));

        // INTERFACE DELEN 2C
        System.out.println("---------INTERFACE----------");

        Bil bilz = new Bil(150, 1500, 6, 1);
        Cykel cykelz = new Cykel(30, 10, 21, 3);
        Tåg tågz = new Tåg(300, 50000, 5);
        Båt båtz = new Båt(100, 1000, 5000);

        listaAvFordon.forEach(fordon -> printFordonMedInterface(fordon) );

        // Interface Delen 2D
        // Funkar eftersom dem klasserna impl detta interface
        List<HjulBuren> hjulBurna = new ArrayList<>( List.of(bilz, cykelz) );
        hjulBurna.forEach(fordon -> fordon.antalHjul());

        // Kan också göra såhär
        // Exakt samma som List<String> list = new ArrayList<>();
        HjulBuren fordonet = new Bil(300, 2000, 6, 2);

        // Kommer bara åt interface metoden!
        int count = fordonet.antalHjul();
        System.out.println(count);

        // Casta om till typen Bil för att komma åt allt
        Bil interfaceBilen = (Bil) fordonet;
        interfaceBilen.printMe();

    }

    public static void printFordon(Fordon fordon) {
        fordon.printMe();
    }

    public static void printFordonMedInterface(Printable p) {
        p.printMeInterface();
    }
}
