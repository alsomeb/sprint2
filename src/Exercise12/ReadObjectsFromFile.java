package Exercise12;

import Exercise12.fordon.Fordon;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadObjectsFromFile {
    public List<Fordon> collectFordonListFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/Exercise12/fordon.ser"));
        return (List<Fordon>) objectInputStream.readObject(); // detta är vår lista, bara 1 objekt
    }
}
