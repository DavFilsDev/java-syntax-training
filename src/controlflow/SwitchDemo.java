package controlflow;

public class SwitchDemo {
    public static void main(String[] args) {
        int day = 3;

        // Use switch to print the name of the day
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
