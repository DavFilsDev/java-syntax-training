package _training.oop_exercices.inheritance;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}

