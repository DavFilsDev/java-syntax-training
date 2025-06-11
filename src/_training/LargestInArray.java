package _training;

/**
 * Finds the largest integer in an array.
 */
public class LargestInArray {

    /**
     * Returns the largest element in the array.
     *
     * @param arr array of integers (non-empty)
     * @return largest integer
     */
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array must not be empty.");

        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] testArray = {5, 7, 2, 9, 1};
        System.out.println("Largest: " + findLargest(testArray)); // Output: 9
    }
}
