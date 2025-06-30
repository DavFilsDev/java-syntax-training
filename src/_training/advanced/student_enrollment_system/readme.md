# Student Enrollment System

## Overview

This project implements a basic in-memory student enrollment system in Java.

It simulates a many-to-many relationship between students and courses:
- A student can enroll in multiple courses.
- A course can have many students enrolled.

This exercise is designed to practice object-oriented modeling, bidirectional associations, and service-based logic, all useful for real-world backend development.

---

## Features

✅ Create and store students  
✅ Create and store courses  
✅ Enroll students into courses  
✅ Get all courses for a given student  
✅ Get all students enrolled in a course  

---

## Technologies Used

- Java 11+
- JUnit 5 for unit testing

---

## Class Structure

- `Student`: represents a student with a list of enrolled courses.
- `Course`: represents a course with a list of enrolled students.
- `EnrollmentService`: handles the business logic for managing enrollments.
- `EnrollmentServiceTest`: unit test class for the service.

---

## Example Usage

```java
EnrollmentService service = new EnrollmentService();

Student alice = service.createStudent("Alice");
Course java = service.createCourse("Java Programming");

service.enrollStudent(alice.getId(), java.getId());

Set<Course> aliceCourses = service.getCoursesOfStudent(alice.getId());
Set<Student> javaStudents = service.getStudentsInCourse(java.getId());
````

---

## How to Run Tests

You can run the tests using:

* **Maven**:

  ```bash
  mvn test
  ```

* **Gradle**:

  ```bash
  gradle test
  ```

* Or directly from an IDE like IntelliJ or Eclipse

---

## Author
---
David RATIANDRAIBE
