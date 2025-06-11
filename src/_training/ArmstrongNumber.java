package _training;

/**
 * This class checks if a number is an Armstrong number.
 * An Armstrong number is a number that is equal to the sum of its own digits
 * each raised to the power of the number of digits.
 *
 * Example: 153 = 1³ + 5³ + 3³
 */
public class ArmstrongNumber {

    /**
     * Checks if a given number is an Armstrong number.
     *
     * @param number the number to check
     * @return true if it's an Armstrong number, false otherwise
     */
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        int digits = String.valueOf(number).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return number == sum;
    }

    public static void main(String[] args) {
        // Sample tests
        int[] testNumbers = {153, 370, 371, 9474, 9475};

        for (int num : testNumbers) {
            System.out.printf("%d is Armstrong? %b%n", num, isArmstrong(num));
        }
    }
}
