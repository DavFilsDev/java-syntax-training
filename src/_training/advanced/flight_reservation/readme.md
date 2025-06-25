# ✈️ Flight Reservation System – Java OOP Training

This project implements a simple flight reservation and payment system using Java and object-oriented principles.

## ✅ Features

- Clients can reserve seats on flights by class
- Availability is checked automatically
- Total price is calculated based on seat class
- Payments can be made and tracked
- Reservations are attached to each client

## 🧱 Classes

### `Client`
- Stores personal information and reservation history

### `Vol`
- Contains destination, departure, schedule, prices, and availability per class

### `ClasseVol` (Enum)
- ECO, BUSINESS, FIRST

### `Reservation`
- Connects a client to a flight and stores reservation details

### `Paiement`
- Handles payment status for a reservation

## 🧪 Tests

JUnit 5 tests included in `ReservationTest.java`:
- Valid and invalid reservations
- Price calculations
- Payment validation
- Reservation history

## ▶️ Running Tests

Ensure JUnit 5 is installed. Then run:

```

Right-click > Run ReservationTest

```

## 📁 Project Structure

```

training/
├── src/
│   ├── model/
│   │   ├── Client.java
│   │   ├── Vol.java
│   │   ├── Reservation.java
│   │   ├── Paiement.java
│   │   └── ClasseVol.java
│   └── test/
│       └── ReservationTest.java
├── README.md

```

---

© 2025 – Java OOP training by [David]