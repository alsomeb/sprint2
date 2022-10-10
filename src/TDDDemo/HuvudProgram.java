package TDDDemo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class HuvudProgram {
    public static void main(String[] args) {
        Reader r = new Reader();
        Iterator i = new Iterator();
        Path p = Paths.get("resources/input.txt");

        List<Integer> data = r.read(p);

        System.out.println(i.iterate(data));
    }
}
