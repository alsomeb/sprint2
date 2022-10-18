package Exercise12;

import Exercise12.fordon.Fordon;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteObjectsToFile {
    public void writeFordonListToSerializedFile(List<Fordon> fordonList) throws IOException {
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("src/Exercise12/fordon.ser"));
        ous.writeObject(fordonList);
        // Flushes the stream. This will write any buffered output bytes and flush through to the underlying stream.
        // Lite som scannern där man behöver göra nextLine() om ngn token finns kvar
        // GOD PRACTICE att alltid flusha!
        ous.flush();
        System.out.println("Success");
    }
}
