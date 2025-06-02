package oop.constructors;

/**
 * This class shows how to create a simple constructor in Java.
 * A constructor is used to initialize objects with default or custom values.
 */
public class ConstructorDemo {
    String name;

    // Constructor: this runs when we create a new object
    public ConstructorDemo(String newName) {
        name = newName;
    }

    // Method to display the name
    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        // Create an object using the constructor
        ConstructorDemo person = new ConstructorDemo("Alice");
        person.sayHello();
    }
}
