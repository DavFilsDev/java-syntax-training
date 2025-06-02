package oop.inheritance;

/**
 * This class is used to test inheritance and polymorphism.
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog("Rex");
        Animal myCat = new Cat("Whiskers");

        // Polymorphism: we call the method from the actual object type (Dog/Cat)
        myDog.makeSound();   // Output: Rex says: Woof!
        myCat.makeSound();   // Output: Whiskers says: Meow!
    }
}
