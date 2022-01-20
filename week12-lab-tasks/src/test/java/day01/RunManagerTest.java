package day01;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RunManagerTest {

    RunManager runManager = new RunManager();

    @Test
    void readLinesTest() {
        runManager.readLines("src/test/resources/running.csv");

        assertEquals(7, runManager.getRuns().size());
    }

    @Test
    void readLinesWithInvalidFileTest() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> runManager.readLines("src/test/resources/runnin.csv"));

        assertEquals("Cannot reach file", ex.getMessage());
    }

    @Test
    void sumOfMonthAndYearTest() {

        runManager.readLines("src/test/resources/running.csv");
        assertEquals(41.2, runManager.sumOfMonthAndYear(2021, Month.DECEMBER));
    }
}