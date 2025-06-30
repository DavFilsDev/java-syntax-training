package _training.advanced.payement_processing_system;

import java.util.*;

public class PaymentService {
    private final Map<String, User> users = new HashMap<>();
    private final List<Payment> payments = new ArrayList<>();

    public User createUser(String name) {
        User user = new User(name);
        users.put(user.getId(), user);
        return user;
    }

    public Payment recordPayment(String userId, double amount, PaymentType type) {
        User user = users.get(userId);
        if (user == null) throw new IllegalArgumentException("User not found");

        Payment payment = new Payment(user, amount, type);
        payments.add(payment);
        return payment;
    }

    public List<Payment> getPaymentsForUser(String userId) {
        return payments.stream()
                .filter(p -> p.getUser().getId().equals(userId))
                .toList();
    }

    public double getTotalPaidByUser(String userId) {
        return payments.stream()
                .filter(p -> p.getUser().getId().equals(userId))
                .mapToDouble(Payment::getAmount)
                .sum();
    }
}
