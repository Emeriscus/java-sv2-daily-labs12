package day05;

import java.util.Arrays;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        StringStatistics stringStatistics = new StringStatistics();

        Map<Character, Integer> result = stringStatistics.CharStatistic("alFmafAaM");

        for (Map.Entry<Character, Integer> actual : result.entrySet()) {
            System.out.println(actual.getKey() + " " + actual.getValue());
        }

        char[] chars = {'a', 'á', 'b', 'C'};
        System.out.println(chars);

        Arrays.sort(chars);

        System.out.println(chars);
    }

}
