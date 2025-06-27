
# User Authentication System with Role-Based Access

## Overview
This project implements a simple in-memory authentication system in Java that supports:
- User registration with SHA-256 password hashing
- Password-based login
- Role verification (ADMIN, USER)
- Duplicate user prevention

## Features
- Secure password storage with SHA-256
- Unique username enforcement
- Role-based access verification
- Unit-tested logic using JUnit 5

## Technologies
- Java 11+
- JUnit 5

## Project Structure
- `Role`: Enum to represent user roles.
- `User`: Entity class for user data.
- `AuthService`: Service class for user management and authentication.
- `AuthServiceTest`: JUnit tests to verify functionality.

## Example Usage

```java
AuthService auth = new AuthService();
auth.register("alice", "mypassword", Role.USER);

boolean loginSuccess = auth.authenticate("alice", "mypassword");
boolean isAdmin = auth.hasRole("alice", Role.ADMIN);
````

## Running the Tests

You can run the unit tests with:

* Maven: `mvn test`
* Gradle: `gradle test`
* IntelliJ or Eclipse IDE (right-click -> Run Tests)

## Author
```
David RATIANDRAIBE