package oop.abstraction;

/**
 * This class shows how abstraction works in Java.
 * We can use the abstract class as a type, even if we can't create an object of it directly.
 */
public class AbstractionExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Woof!
        myCat.makeSound(); // Meow!

        myDog.eat(); // All animals share this method
        myCat.eat(); // All animals share this method
    }
}
