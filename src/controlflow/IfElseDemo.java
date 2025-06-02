package controlflow;

public class IfElseDemo {
    public static void main(String[] args) {
        int score = 75;

        // Use if-else to evaluate score range
        if (score >= 90) {
            System.out.println("Excellent!");
        } else if (score >= 70) {
            System.out.println("Good job!");
        } else if (score >= 50) {
            System.out.println("You passed.");
        } else {
            System.out.println("Try again.");
        }
    }
}
