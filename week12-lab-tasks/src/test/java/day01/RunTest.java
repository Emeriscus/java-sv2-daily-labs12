package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @Test
    void createRunTest() {

        Run run = new Run(23.3, LocalDate.now());

        assertEquals(23.3, run.getDistance());
        assertEquals(LocalDate.now().getYear(), run.getDate().getYear());

    }

}