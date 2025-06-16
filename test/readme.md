---

### 📄 `test/README.md`

```markdown
# 🧪 Java Test Guide – Using IntelliJ and JUnit 5

This guide helps you write and run **automatic tests** for your Java project using **JUnit 5** in **IntelliJ IDEA**.

---

## ✅ Quick Start: Run a Test in IntelliJ

1. Open your Java file (e.g., `ClassName.java`) in IntelliJ.
2. Press `Ctrl + Shift + T` (or right-click and select `Go to > Test`).
3. Create a new test class (e.g., `ClassNameTest`), choose **JUnit 5**.
4. IntelliJ will auto-create the test class inside the `test/` folder, matching the package tree.
5. Right-click on the test method or class and click `Run`.

---

## 🧱 Structure Recommendation

Place your test classes in the `test/` folder with the **same package structure** as your `src/` code. For example:

```

src/
└── firstProject/
└── exercices/
└── ClassName.java

test/
└── monproject/
└── exercices/
└── ClassNameTest.java

````

---

## 🧪 How to Write a Basic Test in Java (JUnit 5)

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result); // Expected 5
    }

    @Test
    void testBooleanCondition() {
        assertTrue(10 > 1);
        assertFalse(3 < 1);
    }

    @Test
    void testObjectEquality() {
        String a = "hello";
        String b = "hello";
        assertEquals(a, b);
    }

    @Test
    void testNullCheck() {
        Object obj = null;
        assertNull(obj);
        obj = new Object();
        assertNotNull(obj);
    }
}
````
---

## 📦 What do these `import` statements do?

When writing tests in Java with JUnit 5, you often see the following imports:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

Here’s what they are used for:

| Import                                           | Purpose                                                                                                                                      |
| ------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `org.junit.jupiter.api.Test`                     | Marks a method as a test method. Without this, IntelliJ and JUnit won’t recognize the method as a test.                                      |
| `org.junit.jupiter.api.BeforeEach` / `AfterEach` | (Optional) Used to run code before or after every test method. Useful for setup and cleanup.                                                 |
| `static org.junit.jupiter.api.Assertions.*`      | Gives access to assertion methods like `assertEquals()`, `assertTrue()`, etc., without needing to prefix them with `Assertions.` every time. |
| `org.junit.jupiter.api.Assertions`               | The class that contains all the core test validation methods.                                                                                |

So basically:

* `@Test` tells the framework: "run this method as a test".
* `Assertions.*` gives you all the tools to check if the code behaves correctly.

---

## 🔁 Most Common JUnit Assertions

| Assertion                                    | Description                    |
| -------------------------------------------- | ------------------------------ |
| `assertEquals(expected, actual)`             | Checks if two values are equal |
| `assertNotEquals(unexpected, actual)`        | Checks if values are not equal |
| `assertTrue(condition)`                      | Passes if condition is true    |
| `assertFalse(condition)`                     | Passes if condition is false   |
| `assertNull(object)`                         | Passes if object is null       |
| `assertNotNull(object)`                      | Passes if object is not null   |
| `assertThrows(Exception.class, () -> {...})` | Passes if exception is thrown  |

---

## 🔐 Tip: Testing Encapsulated Classes

You should only interact with **public methods** when testing encapsulated classes. Private fields must be **validated indirectly** through getters or visible behavior.

Example:

```java
Compte compte = new Compte(new Client("Alice", "alice@example.com"), 100);
compte.deposer(50);
assertEquals(150, compte.consulterSolde());
```

---

## 🧼 Good Practice

* Use **one test class per Java class**.
* Each method should test **only one thing**.
* Use **clear method names**, like `shouldReturnCorrectBalanceAfterDeposit()`.

---
