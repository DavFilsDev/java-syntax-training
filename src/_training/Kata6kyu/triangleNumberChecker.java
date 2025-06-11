package _training.Kata6kyu;

public class triangleNumberChecker {

    /**
     * Checks if a given number is a triangular number.
     * A triangular number is of the form n(n+1)/2 for some integer n.
     *
     * @param number The number to check.
     * @return true if it is a triangular number, false otherwise.
     */
    public static boolean isTriangular(int number) {
        if (number < 1) return false;

        // Solving n(n+1)/2 = number => n^2 + n - 2*number = 0
        int discriminant = 1 + 8 * number;
        int sqrt = (int) Math.sqrt(discriminant);

        return sqrt * sqrt == discriminant && (-1 + sqrt) % 2 == 0;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 3, 6, 10, 15, 7, 8, 14};

        for (int num : testNumbers) {
            System.out.printf("%d is triangular? %s%n", num, isTriangular(num));
        }
    }
}
