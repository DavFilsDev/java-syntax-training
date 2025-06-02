package oop.classesobjects;

/**
 * This class contains the main method to test the Person class.
 * It shows how to create an object and access its attributes and methods.
 */
public class PersonTest {
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person();

        // Assign values to the object's fields
        person1.name = "Alice";
        person1.age = 22;

        // Call the method to introduce the person
        person1.introduce();
    }
}
