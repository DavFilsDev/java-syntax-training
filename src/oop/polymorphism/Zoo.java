package oop.polymorphism;

/**
 * This example shows polymorphism with arrays of objects.
 * We can treat all animals in the zoo as "Animal" types,
 * and they still behave differently when makeSound() is called.
 */
public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Animal() };

        for (Animal a : animals) {
            a.makeSound();  // Each animal makes its own sound
        }
    }
}
