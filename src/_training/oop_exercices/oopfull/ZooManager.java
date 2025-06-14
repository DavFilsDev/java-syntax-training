package _training.oop_exercices.oopfull;

import java.util.List;

public class ZooManager {
    public static void main(String[] args) {
        List<ZooAnimal> animals = List.of(
                new Lion("Simba"),
                new Elephant("Dumbo"),
                new Monkey("George")
        );

        for (ZooAnimal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.feed();
            System.out.println("------");
        }
    }
}

