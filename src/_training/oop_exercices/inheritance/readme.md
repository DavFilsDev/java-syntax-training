# OOP Exercise 2: Inheritance in Java

This exercise is part of a series of Object-Oriented Programming (OOP) training examples.

## 🧠 Goal

Understand how **inheritance** works in Java by building a simple animal hierarchy.  
This includes how child classes can:
- Reuse fields and methods from a parent class.
- Override methods to change behavior.

## 📦 What’s Included

- `Animal.java`: The base class with a common structure for all animals.
- `Dog.java` and `Cat.java`: Subclasses that inherit from `Animal` and override the `speak()` method.
- `TestAnimals.java`: A simple test class to demonstrate inheritance and method overriding.

## 📌 Key Concepts Practiced

- Class inheritance using `extends`
- Method overriding with `@Override`
- `protected` access modifier
- Polymorphism: using the parent class reference for child objects

## 🧪 How to Run

Compile and run `TestAnimals.java`:
```bash
javac _training/oop/*.java
java _training.oop.TestAnimals
