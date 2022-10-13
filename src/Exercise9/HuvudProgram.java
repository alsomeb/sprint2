package Exercise9;

import java.nio.file.Paths;
import java.util.List;

public class HuvudProgram {
    public static void main(String[] args) {
        CollectFromFile collector = new CollectFromFile();
        List<Person> personer = collector.getPersonsList(Paths.get("resources/Personuppgifter.txt"));
        System.out.println(personer);

        List<Person> above2Meters = collector.collectPersonsWithHeightAbove2Meters(personer);
        System.out.println(above2Meters);

        collector.writePersonListToFile(above2Meters);
    }
}
