package day05;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void charStatisticTest() {

        StringStatistics stringStatistics = new StringStatistics();
        String s = "adaddeerrchf";

        Map<Character, Integer> expected = stringStatistics.CharStatistic(s);

        assertEquals(2, expected.get('a'));
        assertEquals(3, expected.get('d'));
        assertEquals(null, expected.get('i'));
    }
}