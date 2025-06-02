package oop.encapsulation;

/**
 * This class tests how to use getters and setters with encapsulation.
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        EncapsulationWithGetterSetter person = new EncapsulationWithGetterSetter();

        // Set a valid age
        person.setAge(25);
        System.out.println("Age: " + person.getAge());

        // Try to set an invalid age
        person.setAge(-5); // Output: Age cannot be negative.
    }
}
