package oop.interfaces;

/**
 * Duck can fly and swim.
 * It implements both Flyable and Swimmable interfaces.
 * This demonstrates multiple interface implementation.
 */
public class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck flies short distances.");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims on the lake.");
    }
}
