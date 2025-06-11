package _training;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Removes duplicates from an array while preserving order.
 */
public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Without duplicates: " + Arrays.toString(removeDuplicates(arrayWithDuplicates)));
    }
}
