package basics;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read a full line (String)

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();       // Read an integer

        // Display the result
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner (good practice)
        scanner.close();
    }
}
