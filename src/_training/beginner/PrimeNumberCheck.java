package _training.beginner;

/**
 * Checks if a number is prime.
 */
public class PrimeNumberCheck {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int testNum = 17;
        System.out.println(testNum + " is prime? " + isPrime(testNum));
    }
}
