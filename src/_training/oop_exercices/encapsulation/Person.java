package _training.oop_exercices.encapsulation;

public class Person {
    // Champs privés (encapsulation)
    private String name;
    private int age;

    // Constructeur
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (accesseurs)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters (mutateurs)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    // Affiche les informations
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
