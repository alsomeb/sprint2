package Exercise8;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ReadTemp {
    private final File fromFile;

    public ReadTemp(File fromFile) {
        this.fromFile = fromFile;
    }


    public List<String> generateListFromFile () {
        List<String> lines = new ArrayList<>();
        String currentLine;

        try(BufferedReader br = new BufferedReader(new FileReader(fromFile))) {
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
