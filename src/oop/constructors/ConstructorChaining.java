package oop.constructors;

/**
 * This class shows constructor chaining.
 * One constructor can call another constructor using the keyword 'this()'.
 */
public class ConstructorChaining {
    String name;
    int age;

    // Constructor 1: no parameters
    public ConstructorChaining() {
        // Call another constructor with default values
        this("Default Name", 0);
    }

    // Constructor 2: with parameters
    public ConstructorChaining(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create object using default constructor
        ConstructorChaining obj = new ConstructorChaining();
        obj.showDetails();
    }
}
