package oop.abstraction;

/**
 * Dog is a concrete class that extends the abstract class Animal.
 * It must implement all abstract methods from Animal.
 */
public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}
