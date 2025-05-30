package oop.interfaces;

/**
 * This is an interface.
 * It defines a contract: any class that "implements" Flyable must provide the method fly().
 * Interfaces can only have method signatures (no bodies) and constants.
 */
public interface Flyable {
    // This is an abstract method by default
    void fly();
}
