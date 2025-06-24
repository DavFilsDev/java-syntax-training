# 🧪 Quiz Platform – Java OOP Training

This Java project simulates a basic quiz platform where users can answer multiple choice questions and get a score.

## ✅ Features

- Create and manage quizzes
- Add multiple choice questions
- Users can answer questions
- Automatically grade user answers
- Score calculation based on correct answers

## 🧱 Classes

### `Utilisateur`
- Represents a user who can answer quiz questions

### `Quiz`
- Holds a list of questions
- Can calculate a user’s score

### `Question`
- Multiple-choice question with correct answer index

### `Reponse`
- Stores user’s answer to a question
- Method to check if it’s correct

## 🧪 Tests

Unit tests written with JUnit 5 in `QuizTest.java`:
- Check score calculation
- Validate user responses
- Confirm question logic

## ▶️ Run the tests

Ensure JUnit 5 is available, then:
```

Right-click > Run QuizTest

```

## 📁 Suggested Project Structure

```

training/
├── src/
│   ├── model/
│   │   ├── Utilisateur.java
│   │   ├── Question.java
│   │   ├── Quiz.java
│   │   └── Reponse.java
│   └── test/
│       └── QuizTest.java
├── README.md

```

## 🎓 Learning Objectives

- Object associations (1-n)
- Encapsulation and domain logic
- Test-driven development (TDD)
- Local collections and filtering

---

© 2025 – Java OOP training project by [David]