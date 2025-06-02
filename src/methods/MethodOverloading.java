package methods;

public class MethodOverloading {
    // Method with one parameter
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method with no parameter
    public static void greet() {
        System.out.println("Hello, Guest!");
    }

    public static void main(String[] args) {
        greet("Alice");
        greet();
    }
}
