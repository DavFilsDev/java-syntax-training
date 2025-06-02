package oop.polymorphism;

/**
 * Cat is another subclass of Animal.
 * It also overrides the makeSound() method.
 */
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
