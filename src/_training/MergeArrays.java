package _training;

import java.util.Arrays;

/**
 * Merges two integer arrays into one.
 */
public class MergeArrays {

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        return merged;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println("Merged array: " + Arrays.toString(merge(a, b)));
    }
}
