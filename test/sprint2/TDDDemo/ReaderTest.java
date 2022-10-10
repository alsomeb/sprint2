package sprint2.TDDDemo;

import TDDDemo.Reader;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReaderTest {
    // Läser in data,
    // Transformera data från .txt fil till integer
    // lägger i lista

    Reader r = new Reader();
    Path path = Paths.get("resources/input.txt");

    @Test
    public void transformToInteger() {
        String s1 = "345";
        String s2 = "45 "; // ibland förekommer blanksteg

        assertEquals(345, r.transformToInt(s1));
        assertEquals(45, r.transformToInt(s2)); // så den trim() blanksteg
    }

    @Test
    public void readToIntListTest() {
        List<Integer> testLista = r.read(path);

        assertEquals(2000, testLista.size());
        assertEquals(3728, testLista.get(testLista.size() - 1)); // sista talet check
        assertEquals(196, testLista.get(0)); // första talet check
        assertEquals(197, testLista.get(1)); // andra talet check
        assertNotEquals(198, testLista.get(0)); // "Ful test" kolla att de inte blir detta tal
    }

}
