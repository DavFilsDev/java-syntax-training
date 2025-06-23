package _training.beginner;

/**
 * Classic FizzBuzz problem:
 * For numbers 1 to n, print "Fizz" if divisible by 3,
 * "Buzz" if divisible by 5,
 * "FizzBuzz" if divisible by both,
 * else print the number.
 */
public class FizzBuzz {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fizzBuzz(20);
    }
}
