package _training.advanced.payement_processing_system;

import java.time.LocalDate;
import java.util.UUID;

public class Payment {
    private final String id;
    private final double amount;
    private final LocalDate paymentDate;
    private final PaymentType type;
    private final User user;

    public Payment(User user, double amount, PaymentType type) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.paymentDate = LocalDate.now();
        this.type = type;
        this.user = user;
    }

    public String getId() { return id; }
    public double getAmount() { return amount; }
    public LocalDate getPaymentDate() { return paymentDate; }
    public PaymentType getType() { return type; }
    public User getUser() { return user; }

    @Override
    public String toString() {
        return "[%s] %.2f via %s".formatted(paymentDate, amount, type);
    }
}
