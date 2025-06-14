package _training.oop_exercices._interface;

import java.util.List;

public class TestSoundable {
    public static void main(String[] args) {
        List<Soundable> animals = List.of(
                new Dog("Buddy"),
                new Cat("Whiskers"),
                new Cow("Bessie")
        );

        for (Soundable animal : animals) {
            animal.makeSound();
        }
    }
}

