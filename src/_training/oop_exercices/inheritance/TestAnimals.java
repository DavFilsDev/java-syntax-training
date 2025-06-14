package _training.oop_exercices.inheritance;

public class TestAnimals {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);

        dog.speak(); // Dog barks
        cat.speak(); // Cat meows
    }
}
