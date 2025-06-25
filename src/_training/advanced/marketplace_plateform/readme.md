# 🛍️ Marketplace Platform – Java OOP Training

This project simulates a mini marketplace where users can post ads, message each other, and complete transactions.

## ✅ Features

- Users can post product listings
- Users can message each other privately
- Products can be marked as sold via transactions
- Messages are timestamped

## 🧱 Classes

### `Utilisateur`
- Publishes ads
- Sends/receives private messages

### `Annonce`
- Holds title, description, price, seller
- Can be marked as sold

### `Message`
- Stores communication between users
- Timestamped

### `Transaction`
- Links a buyer and an ad
- Status can be updated

### `StatutTransaction` (Enum)
- EN_ATTENTE, EFFECTUEE, ANNULEE

## 🧪 Tests

Unit tests in `MarketplaceTest.java` check:
- Message exchange
- Transaction status
- Ad availability updates

## ▶️ Run the tests

Make sure JUnit 5 is installed. Then:

```

Right-click > Run MarketplaceTest

```

## 📁 Suggested Structure

```

training/
├── src/
│   ├── model/
│   │   ├── Utilisateur.java
│   │   ├── Annonce.java
│   │   ├── Message.java
│   │   ├── Transaction.java
│   │   └── StatutTransaction.java
│   └── test/
│       └── MarketplaceTest.java
├── README.md

```

---

© 2025 – Java OOP training by [David]