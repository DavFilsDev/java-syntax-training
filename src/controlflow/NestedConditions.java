package controlflow;

public class NestedConditions {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        // A condition inside another condition
        if (isLoggedIn) {
            if (isAdmin) {
                System.out.println("Welcome, admin.");
            } else {
                System.out.println("Welcome, user.");
            }
        } else {
            System.out.println("Please log in first.");
        }
    }
}
