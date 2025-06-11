package _training;

/**
 * This class provides methods to calculate the factorial of a number.
 * Factorial of n (n!) is the product of all positive integers less than or equal to n.
 * Example: 5! = 5 × 4 × 3 × 2 × 1 = 120
 */
public class Factorial {

    /**
     * Calculates the factorial of a number using iteration.
     *
     * @param n the non-negative integer
     * @return the factorial of n
     */
    public static long compute(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Sample tests
        int[] testNumbers = {0, 1, 5, 7, 10};

        for (int num : testNumbers) {
            System.out.printf("%d! = %d%n", num, compute(num));
        }
    }
}
