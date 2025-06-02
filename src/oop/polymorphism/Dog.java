package oop.polymorphism;

/**
 * Dog is a subclass of Animal.
 * It overrides the makeSound() method with its own behavior.
 */
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}
