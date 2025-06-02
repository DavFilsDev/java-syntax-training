package methods;

public class RecursionExample {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
