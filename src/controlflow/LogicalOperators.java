package controlflow;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 20;
        boolean hasTicket = true;

        // Use logical AND (&&) and OR (||)
        if (age >= 18 && hasTicket) {
            System.out.println("You can enter the concert.");
        } else {
            System.out.println("Access denied.");
        }

        // NOT operator
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("You don't need an umbrella.");
        }
    }
}
