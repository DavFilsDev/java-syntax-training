package _training.oop_exercices.inheritance;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

