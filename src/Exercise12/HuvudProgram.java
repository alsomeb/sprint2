package Exercise12;

import Exercise12.fordon.*;

import java.io.IOException;
import java.util.List;

public class HuvudProgram {
    public HuvudProgram() {

        printObjectFromFile();

    }

    public void writeObjectsToFile(List<Fordon> list) {
        WriteObjectsToFile wr = new WriteObjectsToFile();
        try {
            wr.writeFordonListToSerializedFile(list);
        } catch (IOException e) {
            System.out.println("Skrivning till fil error");
        }
    }

    public void printObjectFromFile() {
        ReadObjectsFromFile ro = new ReadObjectsFromFile();
        try {
            List<Fordon> allaFordonFrånFil = ro.collectFordonListFromFile();
            allaFordonFrånFil.forEach(fordon -> ((Fordon) fordon).printMeInterface());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Något gick fel vid inläsningen från filen");
        }
    }

    public List<Fordon> getFordonList() {
        return List.of(
            new Bil(50, 3500, 6, 1),
            new Bil(100, 2000, 6, 2),
            new Båt(30, 5000, 20),
            new Cykel(10, 20, 10, 5),
            new Tåg(200, 10000));
    }


    public static void main(String[] args) {
        new HuvudProgram();
    }
}
