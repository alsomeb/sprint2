package sprint2.Exercise9;

import Exercise9.CollectFromFile;
import Exercise9.Person;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectFromFileTest {
    Path url = Paths.get("resources/Personuppgifter.txt");
    CollectFromFile collect = new CollectFromFile();
    List<Person> allPersons = collect.getPersonsList(url);


    @Test
    void testGetPersonsListReturnsCorrect() {
        int expected = 8;
        int actual = allPersons.size();
        assertEquals(expected, actual);
    }

    @Test
    void testcollectPersonsWithHeightAbove2MetersReturnsCorrect() {
        int expected = 2;
        List<Person> above2m = collect.collectPersonsWithHeightAbove2Meters(allPersons);
        assertEquals(expected, above2m.size());
        above2m.forEach(person -> assertTrue(person.getHeight() > 200)); // kolla så faktiskt alla är över 2m
    }
}