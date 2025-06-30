# Payment Processing System

## Overview

This Java project simulates a basic payment management system.  
Users can make payments via different methods, and the system stores the transaction records.

---

## Features

✅ Register users  
✅ Record payments (amount, type, date)  
✅ List all payments for a user  
✅ Calculate total amount paid by a user  
✅ Enum support for payment methods (`CASH`, `CARD`, `BANK_TRANSFER`)

---

## Technologies

- Java 11+
- JUnit 5 for testing

---

## Example Usage

```java
PaymentService service = new PaymentService();

User alice = service.createUser("Alice");
service.recordPayment(alice.getId(), 50.0, PaymentType.CARD);
service.recordPayment(alice.getId(), 25.0, PaymentType.CASH);

List<Payment> history = service.getPaymentsForUser(alice.getId());
double totalPaid = service.getTotalPaidByUser(alice.getId());
````

---

## Running Tests

* Run with Maven:

  ```bash
  mvn test
  ```

* Run with Gradle:

  ```bash
  gradle test
  ```

* Or directly in your IDE

---

## Author
````
David RATIANDRAIBE