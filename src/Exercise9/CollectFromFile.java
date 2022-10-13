package Exercise9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectFromFile {

    // FÖRBÄTTRINGAR: Kanske i detta program ladda filen direkt i Construktor, slipper några rader kod i main då
    private final List<Person> persons;

    public CollectFromFile() {
        persons = new ArrayList<>();
    }

    public List<Person> getPersonsList(Path url) {
        List<Person> persons = new ArrayList<>();
        String currentLine;
        int counter = 0;

        try(BufferedReader reader = Files.newBufferedReader(url)) {
            StringBuilder sb = new StringBuilder();

            while ((currentLine = reader.readLine()) != null) {
                counter++;
                sb.append(currentLine).append(", ");
                if(counter == 2) {
                    String[] lines = sb.toString().split(",");
                    Person currentPerson = new Person(lines[0],
                            lines[1],
                            lines[2],
                            Integer.parseInt(lines[3].trim()),
                            Integer.parseInt(lines[4].trim()),
                            Integer.parseInt(lines[5].trim()));
                    persons.add(currentPerson);
                    counter = 0;
                    sb.setLength(0);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return persons;
    }

    public List<Person> collectPersonsWithHeightAbove2Meters(List<Person> originalList) {
        return originalList.stream().filter(person -> person.getHeight() > 200).collect(Collectors.toList());
    }

    public void writePersonListToFile(List<Person> lista) {
        try(BufferedWriter bw = Files.newBufferedWriter(Path.of("resources/heightabove2.txt"))){
            for(Person person : lista) {
                bw.write(person.getName() + "," + person.getStreetName() + ","
                + person.getAdress() + "\n" + person.getAge() + ", " + person.getWeight() + ", " +
                        person.getHeight() + "\n"
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
