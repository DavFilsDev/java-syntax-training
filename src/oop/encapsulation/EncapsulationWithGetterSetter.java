package oop.encapsulation;

/**
 * This class demonstrates proper encapsulation using private fields and public getters/setters.
 */
public class EncapsulationWithGetterSetter {
    // Private field: only accessible within the class
    private int age;

    // Public getter: allows controlled read access
    public int getAge() {
        return age;
    }

    // Public setter: allows controlled write access
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}
