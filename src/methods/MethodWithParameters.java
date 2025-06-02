package methods;

public class MethodWithParameters {
    // Method with parameters and a return value
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Sum: " + result);
    }
}
