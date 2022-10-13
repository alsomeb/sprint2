package Exercise8;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class ReadTemp {
    private final Path path;

    public ReadTemp(Path path) {
        this.path = path;
    }

    public List<String> generateListFromFile () {
        List<String> lines = new ArrayList<>();
        String currentLine;

        // Try with resources, den .close() automagiskt!! best practice
        try(BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            while ((currentLine = br.readLine()) != null) {
                lines.add(currentLine.trim().replace(",", "."));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public List<Double> convertStringListToDoubleList() {
        return generateListFromFile().stream().map(tal -> Double.parseDouble(tal)).collect(Collectors.toList());
    }

    public double getHighestTemp() {
        return Collections.max(convertStringListToDoubleList());
    }

    public double getLowestTemp() {
        return Collections.min(convertStringListToDoubleList());
    }

    public double getAverageTemp() {
        double total = 0;
        List<Double> talListan = convertStringListToDoubleList();
        for(Double tal : talListan) {
            total += tal;
        }
        return total / talListan.size();
    }
}
