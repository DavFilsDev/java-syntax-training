package _training.oop_exercices._interface;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Moo!");
    }
}

