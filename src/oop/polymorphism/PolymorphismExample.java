package oop.polymorphism;

/**
 * This class shows how polymorphism works.
 * You can call the same method (makeSound) on different types of animals,
 * and each will behave differently.
 */
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();   // Base type object
        Animal myDog = new Dog();         // Dog as an Animal
        Animal myCat = new Cat();         // Cat as an Animal

        myAnimal.makeSound();  // Output: Some generic animal sound
        myDog.makeSound();     // Output: Woof woof!
        myCat.makeSound();     // Output: Meow!
    }
}
