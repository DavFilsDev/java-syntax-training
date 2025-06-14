package _training.oop_exercices._interface;

public abstract class Animal implements Soundable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

