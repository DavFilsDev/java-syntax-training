package oop.interfaces;

/**
 * This class implements the Flyable interface.
 * It must implement the fly() method.
 */
public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying in the sky!");
    }
}
