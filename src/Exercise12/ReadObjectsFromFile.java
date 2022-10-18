package Exercise12;

import Exercise12.fordon.Fordon;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadObjectsFromFile {
    public List<Object> collectFordonListFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/Exercise12/fordon.ser"));
        return (List) objectInputStream.readObject(); // detta är vår lista, bara 1 objekt
    }
}
