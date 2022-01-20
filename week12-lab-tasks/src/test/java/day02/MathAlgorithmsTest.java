package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    MathAlgorithms mathAlgorithms = new MathAlgorithms();

    @Test
    void greatestCommonDivisorTest() {

        assertEquals(6, mathAlgorithms.greatestCommonDivisor(12, 18));
        assertEquals(1, mathAlgorithms.greatestCommonDivisor(25, 9));
    }

    @Test
    void greatestCommonDivisorWhileTest() {

        assertEquals(6, mathAlgorithms.greatestCommonDivisor(12, 18));
        assertEquals(1, mathAlgorithms.greatestCommonDivisor(25, 9));
    }
}