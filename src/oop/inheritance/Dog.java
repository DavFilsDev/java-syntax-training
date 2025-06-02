package oop.inheritance;

/**
 * This class extends Animal.
 * It inherits the name property and the makeSound method.
 */
public class Dog extends Animal {

    // Constructor that uses super to call the Animal constructor
    public Dog(String name) {
        super(name); // Call the superclass constructor
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
