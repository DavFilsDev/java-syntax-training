package _training.oop_exercices.encapsulation;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        person.displayInfo();

        // Modification via les setters
        person.setName("Bob");
        person.setAge(30);

        person.displayInfo();
    }
}

