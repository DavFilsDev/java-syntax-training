package _training;

/**
 * Prints multiplication table for a given number.
 */
public class MultiplicationTable {

    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        printTable(5);
    }
}
