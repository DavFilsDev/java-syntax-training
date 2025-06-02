package oop.inheritance;

/**
 * This is the base class (superclass).
 * It contains properties and methods shared by all animals.
 */
public class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method that can be used or overridden by subclasses
    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}
