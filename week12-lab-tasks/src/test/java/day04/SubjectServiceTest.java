package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SubjectServiceTest {

    @Test
    void getHoursOfTrainerTest() {

        SubjectService subjectService = new SubjectService();
        Path path = Path.of("src/test/resources/beosztas.txt");

        subjectService.fileReader(path);

        assertEquals(24, subjectService.getHoursOfTrainer("Albatrosz Aladin"));


    }
}