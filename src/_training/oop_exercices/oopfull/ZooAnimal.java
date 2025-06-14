package _training.oop_exercices.oopfull;

public abstract class ZooAnimal implements Feedable {
    private String name;
    protected String species;

    public ZooAnimal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Species: " + species);
    }
}

