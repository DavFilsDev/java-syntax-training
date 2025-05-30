package oop.abstraction;

/**
 * This is an abstract class.
 * It cannot be instantiated directly.
 * It can have both abstract (without body) and concrete (with body) methods.
 */
public abstract class Animal {
    // Abstract method (no body) - must be implemented by subclasses
    public abstract void makeSound();

    // Concrete method (with body) - shared by all animals
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
