package TDDDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public int transformToInt(String s) {
        return Integer.parseInt(s.trim());
    }

    public List<Integer> read(Path path) {
        List<Integer> data = new ArrayList<>();
        String temp;

        try(BufferedReader buf = Files.newBufferedReader(path)) {
            while ((temp = buf.readLine()) != null) {
                data.add(transformToInt(temp));
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
