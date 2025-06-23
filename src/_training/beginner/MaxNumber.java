package _training.beginner;

/**
 * Finds the maximum number among given inputs.
 */
public class MaxNumber {

    /**
     * Returns the maximum of two numbers.
     */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Max of 10 and 20 is: " + max(10, 20)); // Output: 20
    }
}
