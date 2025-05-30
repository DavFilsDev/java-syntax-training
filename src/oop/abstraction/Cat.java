package oop.abstraction;

/**
 * Cat also extends the abstract class Animal.
 * Each subclass can provide its own version of makeSound().
 */
public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}
