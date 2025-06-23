package _training.beginner;

/**
 * Calculates the sum of first N natural numbers.
 */
public class SumOfNNumbers {

    public static int sum(int n) {
        return n * (n + 1) / 2; // Using formula for sum of first n natural numbers
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first " + n + " numbers is: " + sum(n));
    }
}
