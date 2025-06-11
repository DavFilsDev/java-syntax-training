package _training;

/**
 * Checks if a number is odd or even.
 */
public class OddOrEvenNumber {

    public static String checkOddEven(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println("7 is " + checkOddEven(7)); // Odd
        System.out.println("10 is " + checkOddEven(10)); // Even
    }
}
