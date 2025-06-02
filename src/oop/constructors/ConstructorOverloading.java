package oop.constructors;

/**
 * This class shows constructor overloading in Java.
 * Overloading means creating many constructors with different parameters.
 */
public class ConstructorOverloading {
    String name;
    int age;

    // Constructor 1: only name
    public ConstructorOverloading(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    // Constructor 2: name and age
    public ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Using the first constructor
        ConstructorOverloading person1 = new ConstructorOverloading("Bob");

        // Using the second constructor
        ConstructorOverloading person2 = new ConstructorOverloading("Charlie", 25);

        person1.showInfo();
        person2.showInfo();
    }
}
