package _training.oop_exercices.oopfull;

public class Lion extends ZooAnimal {
    public Lion(String name) {
        super(name, "Lion");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eats meat.");
    }
}

