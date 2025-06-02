package arrays;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {42, 15, 8, 23, 4};

        // Sort the array
        Arrays.sort(numbers);

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
