package _training.Kata4kyu.kaprekarroutine;
import java.util.Arrays;

/**
 * Kaprekar's Routine:
 * For any 4-digit number with at least two different digits, repeat the following process:
 * 1. Arrange digits in descending and ascending order to get two numbers.
 * 2. Subtract the smaller from the larger.
 * 3. Repeat this process with the result.
 * It always reaches 6174 in a few steps (max 7).
 */
public class KaprekarRoutine {

    /**
     * Computes how many steps are needed to reach 6174 using Kaprekar's process.
     *
     * @param n the starting 4-digit number (not all identical digits)
     * @return number of steps to reach 6174
     * @throws IllegalArgumentException if n has all identical digits (e.g., 1111)
     */
    public static int kaprekarSteps(int n) {
        // Base case: already at Kaprekar constant
        if (n == 6174) return 0;

        String s = String.valueOf(n);

        // Reject if all digits are the same (e.g., 1111)
        if (s.chars().distinct().count() == 1) {
            throw new IllegalArgumentException("Digits must not be all the same.");
        }

        int steps = 0;

        // Repeat until the number becomes 6174
        while (n != 6174) {
            // Format the number as a 4-digit string with leading zeros if necessary
            String num = String.format("%04d", n);

            // Create digit array and sort it ascendingly
            char[] digits = num.toCharArray();
            Arrays.sort(digits);
            String asc = new String(digits);

            // Reverse digits to get descending order
            String desc = new StringBuilder(asc).reverse().toString();

            // Convert both strings to integers
            int high = Integer.parseInt(desc);
            int low = Integer.parseInt(asc);

            // Subtract to get the new number
            n = high - low;
            steps++;
        }

        return steps;
    }
}

