# Meeting Room Reservation System

## Overview
This project is a simple but robust system for managing meeting room bookings in an organization. It supports adding rooms, making reservations with time conflict detection, listing current bookings, and canceling existing reservations.

## Features
- Add new meeting rooms
- Book a room for a specific time range
- Prevent overlapping bookings in the same room
- Cancel reservations by ID
- List all reservations for a specific room

## Technologies Used
- Java 11+
- JUnit 5 for unit testing

## Project Structure
- `Reservation`: Represents a booking (room name, start and end times, UUID).
- `GestionnaireReservation` (ReservationManager): Core class to manage rooms and their reservations.
- `GestionnaireReservationTest`: Test class using JUnit 5.

## Usage

### Add a room
```java
reservationManager.addRoom("Room A");
````

### Make a reservation

```java
reservationManager.bookRoom("Room A", startTime, endTime);
```

### Cancel a reservation

```java
reservationManager.cancelReservation(reservationId);
```

### List all reservations for a room

```java
reservationManager.listReservations("Room A");
```

## Running Tests

Use any of the following options to run unit tests:

* With Maven: `mvn test`
* With Gradle: `gradle test`
* Directly from your IDE (IntelliJ, Eclipse...)

## Author
```
David RATIANDRAIBE