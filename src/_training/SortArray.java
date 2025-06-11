package _training;

import java.util.Arrays;

/**
 * Sorts an integer array in ascending order.
 */
public class SortArray {

    public static int[] sort(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Sorted array: " + Arrays.toString(sort(numbers)));
    }
}
