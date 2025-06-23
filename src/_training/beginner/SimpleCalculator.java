package _training.beginner;

import java.util.Scanner;

public class SimpleCalculator {
    public static String addition(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }
    public static String soustraction(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }
    public static String multiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }
    public static String divide(int a, int b) {
        if (b == 0) {
            return "Error, we can't divide by zero!";
        }else {
            return a + " / " + b + " = " + (a / b);
        }
    }

    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                result = addition(firstNumber, secondNumber);
                break;
            case "-":
                result = soustraction(firstNumber, secondNumber);
                break;
            case "*":
                result = multiply(firstNumber, secondNumber);
                break;
            case "/":
                result = divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid operation");
        }

        System.out.println(result);
    }
}
