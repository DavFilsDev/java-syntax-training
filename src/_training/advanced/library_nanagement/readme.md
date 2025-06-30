# Library Management System

## Overview

This project implements a simple in-memory library system in Java, supporting:

- Book registration and availability tracking
- User registration
- Borrowing and returning of books
- Viewing borrowing history per book

## Technologies

- Java 11+
- JUnit 5 (for optional testing)

## Main Classes

- `Book`: Represents a book with title, author, availability.
- `User`: Represents a user who can borrow books.
- `BorrowRecord`: A borrowing entry with borrow and return dates.
- `LibraryService`: Business logic for managing books and users.

## Running Tests

You can run unit tests with:

* `mvn test`
* `gradle test`
* Or directly in your IDE
