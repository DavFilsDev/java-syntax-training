# 📱 Mini Social Network – Java OOP Training

This project implements a simple social network in Java as an advanced object-oriented programming exercise.

## 🧠 Concepts covered

- Object-oriented design (encapsulation, association, composition)
- Inheritance-ready structure
- LocalDateTime usage
- Streams and Collections
- Unit Testing (JUnit 5)

## 📦 Classes

### `Utilisateur`
- Fields: `id`, `nom`, `email`, followed users, personal publications
- Can publish posts
- Can follow other users
- Can view a personal feed (`getFilActualite`) based on followed users

### `Publication`
- Fields: `id`, `contenu`, `auteur`, `dateHeure`
- Posts are timestamped and linked to an author

### `ReseauSocial`
- Manages all users
- Can search users by name
- Can display all posts

## 🧪 Tests

The class `ReseauSocialTest` provides unit tests using JUnit 5 to verify:
- User search
- Feed ordering (latest first)
- Post publishing

## ▶️ Run Tests

Make sure you have JUnit 5 configured. Then run:

```

Right-click > Run ReseauSocialTest

```

## 📁 Suggested Repository Structure

```

training/
├── src/
│   ├── model/
│   │   ├── Utilisateur.java
│   │   ├── Publication.java
│   │   └── ReseauSocial.java
│   └── test/
│       └── ReseauSocialTest.java
├── README.md

```

---

## ✅ Next Ideas

- Add support for post likes
- Add comments and replies
- Add user ranking by activity

---

© 2025 – Java OOP training project by [David]
