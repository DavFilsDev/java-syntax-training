# Product Inventory Management System

## Overview
This project is a simple Java-based system that simulates inventory management (similar to CRUD operations in web backends). You can add, update, remove, and list products in memory.

## Features
- Add a product (name, price, quantity)
- Update product information
- Delete a product by ID
- Find a product by ID
- List all products

## Technologies
- Java 11+
- JUnit 5 for testing

## Example Usage

```java
InventoryManager manager = new InventoryManager();
Product p = manager.addProduct("Monitor", 250.0, 5);

manager.updateProduct(p.getId(), "Gaming Monitor", 320.0, 7);
manager.findById(p.getId()).ifPresent(System.out::println);

manager.removeProduct(p.getId());
````

## Running Tests

* Maven: `mvn test`
* Gradle: `gradle test`
* Or run from IntelliJ / Eclipse IDE

## Author
````
David RATIANDRAIBE