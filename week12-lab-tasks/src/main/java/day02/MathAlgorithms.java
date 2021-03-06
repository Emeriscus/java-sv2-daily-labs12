package day02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MathAlgorithms {

    private List<Integer> myArrayList = new ArrayList<>();
    private List<Integer> myLinkedList = new LinkedList<>();

    public int greatestCommonDivisor(int firstnumber, int secondnumber) {

        int gcd = 1;
        for (int i = 2; i <= firstnumber && i <= secondnumber; i++) {
            if (firstnumber % i == 0 && secondnumber % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // 27, 9
    // 27-9=18, 9
    // 18-9=9, 9      - 9 lesz az eredmény
    public int greatestCommonDivisorWhile(int firstnumber, int secondnumber) {

        while (firstnumber != secondnumber) {
            if (firstnumber > secondnumber) {
                firstnumber -= secondnumber;
            } else {
                secondnumber -= firstnumber;
            }
        }
        return firstnumber;
    }
}