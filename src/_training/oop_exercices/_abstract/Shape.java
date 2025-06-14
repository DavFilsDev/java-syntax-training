package _training.oop_exercices._abstract;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public String getName() {
        return name;
    }
}

