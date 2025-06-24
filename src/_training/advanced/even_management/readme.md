# 📅 Mini Event Management System – Java OOP Training

This project simulates a simple event management platform using Java and object-oriented principles.

## 🎯 Features

- Users can:
  - Create events
  - Register to events
  - Comment on events
- Events track:
  - Organizers
  - Participants (via registration)
  - Recent comments (sorted by date)

## 🧱 Classes

### `Utilisateur`
- Fields: id, nom, email
- Can register to events
- Can comment on events

### `Evenement`
- Fields: id, titre, lieu, date, organisateur
- Registers users
- Stores comments

### `Inscription`
- Links user and event with date of registration

### `Commentaire`
- Stores message, author, and timestamp

## 🧪 Tests

Unit tests are provided in `EvenementTest.java` using JUnit 5:

- Event registration
- Commenting behavior
- Comment ordering

## ▶️ Run the tests

Make sure JUnit 5 is available and run:

```

Right-click > Run EvenementTest

```

## 📁 Recommended Project Structure

```

training/
├── src/
│   ├── model/
│   │   ├── Utilisateur.java
│   │   ├── Evenement.java
│   │   ├── Commentaire.java
│   │   └── Inscription.java
│   └── test/
│       └── EvenementTest.java
├── README.md

```

## ✅ Learning Goals

- Object composition and associations (1-n, n-n)
- Working with `LocalDateTime`
- Encapsulation
- Unit testing of object interactions

---

© 2025 – Java OOP training project by [David]