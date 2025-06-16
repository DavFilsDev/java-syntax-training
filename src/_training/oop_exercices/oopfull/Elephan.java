package _training.oop_exercices.oopfull;

class Elephant extends ZooAnimal {
    public Elephant(String name) {
        super(name, "Elephant");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eats plants.");
    }
}


