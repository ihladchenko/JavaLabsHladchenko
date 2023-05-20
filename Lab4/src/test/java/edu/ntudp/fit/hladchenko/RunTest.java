package edu.ntudp.fit.hladchenko;

import edu.ntudp.fit.hladchenko.controller.UniversityCreator;
import edu.ntudp.fit.hladchenko.model.University;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @Test
    public void JsonConvertTest() {

        University oldUniversity = Run.createTypicalUniversity();

        JsonManager.SaveToFile(oldUniversity, "oldUniversity.json");
        University newUniversity = JsonManager.ReadFromFile("oldUniversity.json");
        assertEquals(oldUniversity, newUniversity);
    }
}