package oop.interfaces;

/**
 * This class demonstrates how to use interfaces.
 * Objects are created using the interface type to allow flexibility and abstraction.
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable duckAsFlyer = new Duck();
        Swimmable duckAsSwimmer = new Duck();

        bird.fly();            // Bird is flying in the sky!
        duckAsFlyer.fly();     // Duck flies short distances.
        duckAsSwimmer.swim();  // Duck swims on the lake.
    }
}
