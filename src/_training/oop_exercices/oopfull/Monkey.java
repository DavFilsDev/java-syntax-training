package _training.oop_exercices.oopfull;

public class Monkey extends ZooAnimal {
    public Monkey(String name) {
        super(name, "Monkey");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " screeches!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eats bananas.");
    }
}

