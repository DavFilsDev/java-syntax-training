package oop.inheritance;

/**
 * Another subclass of Animal.
 * This shows how multiple classes can inherit from the same parent.
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
