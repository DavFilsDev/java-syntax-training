package _training;

/**
 * This class provides methods to calculate Fibonacci numbers.
 * The Fibonacci sequence is: 0, 1, 1, 2, 3, 5, 8, 13, ...
 * Each number is the sum of the two preceding ones.
 */
public class Fibonacci {

    /**
     * Calculates the nth Fibonacci number using iteration.
     *
     * @param n the position (non-negative integer)
     * @return the nth Fibonacci number
     */
    public static long compute(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        // Sample tests
        int[] testNumbers = {0, 1, 2, 5, 10, 20};

        for (int n : testNumbers) {
            System.out.printf("Fibonacci(%d) = %d%n", n, compute(n));
        }
    }
}
