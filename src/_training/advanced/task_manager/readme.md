# 📋 Task Manager (Trello-like) – Java OOP Training

This Java OOP project models a task manager inspired by Trello, where users manage projects with tasks of varying status and priority.

## ✅ Features

- Manage projects with multiple tasks
- Assign users to tasks
- Change task status and priority
- Filter tasks by user or status
- Calculate progress of a project

## 🧱 Classes

### `Utilisateur`
- Represents a user with name and email

### `Tache`
- Title, description, priority, status, and assigned user

### `Projet`
- Contains a list of tasks
- Can filter tasks by user or status
- Can calculate % of completed tasks

### Enums:
- `StatutTache`: A_FAIRE, EN_COURS, TERMINEE
- `Priorite`: BASSE, MOYENNE, HAUTE, URGENTE

## 🧪 Tests

`ProjetTest.java` provides JUnit 5 tests for:
- Task filtering by user or status
- Progress calculation
- Task addition

## ▶️ How to run tests

Make sure JUnit 5 is configured, then:
```

Right-click > Run ProjetTest

```

## 📁 Suggested Project Structure

```

training/
├── src/
│   ├── model/
│   │   ├── Utilisateur.java
│   │   ├── Tache.java
│   │   ├── Projet.java
│   │   ├── StatutTache.java
│   │   └── Priorite.java
│   └── test/
│       └── ProjetTest.java
├── README.md

```

---

© 2025 – Java OOP training project by [David]
