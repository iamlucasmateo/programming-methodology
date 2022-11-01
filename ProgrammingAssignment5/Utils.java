package ProgrammingAssignment5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

public class Utils {
    public static HashMap<Integer, Integer> countOcurrences(Integer[] numbers) {
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (counts.keySet().contains(number)) {
                counts.put(number, counts.get(number) + 1);
            } else {
                counts.put(number, 1);
            }
        }

        return counts;
    }

    public static boolean arraysAreEqual(Integer[] arr1, Integer[] arr2) {
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(arr2));

        return set1.equals(set2);
    }
}
