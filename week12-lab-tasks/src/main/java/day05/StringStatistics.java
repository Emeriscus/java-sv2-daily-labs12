package day05;

import java.util.*;

public class StringStatistics {

    public Map<Character, Integer> CharStatistic(String text) {

        Map<Character, Integer> result = new TreeMap<>();
        char[] chars = text.toCharArray();              // vagy text.charAt(i) for ciklussal
        for (char actual : chars) {
            if (!result.containsKey(actual)) {
                result.put(actual, 1);
            } else {
                result.put(actual, result.get(actual) + 1);
            }
        }
        return result;
    }

    //Set példa - egy szövegben hány különböző karakter szerepel:
    public int numberOfDifferentLetters(String s) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }
        return result.size();                 // a Set-ben 1 elem csak egyszer szerepelhet!
    }

}
