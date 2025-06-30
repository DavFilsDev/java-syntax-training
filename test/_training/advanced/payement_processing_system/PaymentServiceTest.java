package _training.advanced.payement_processing_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceTest {

    private PaymentService service;
    private User user;

    @BeforeEach
    void setUp() {
        service = new PaymentService();
        user = service.createUser("Alice");
    }

    @Test
    void testCreateUser() {
        assertNotNull(user.getId());
        assertEquals("Alice", user.getName());
    }

    @Test
    void testRecordPayment() {
        Payment payment = service.recordPayment(user.getId(), 150.0, PaymentType.CARD);
        assertEquals(150.0, payment.getAmount());
        assertEquals(PaymentType.CARD, payment.getType());
        assertEquals(user.getId(), payment.getUser().getId());
    }

    @Test
    void testGetPaymentsForUser() {
        service.recordPayment(user.getId(), 100, PaymentType.CASH);
        service.recordPayment(user.getId(), 50, PaymentType.CARD);

        List<Payment> payments = service.getPaymentsForUser(user.getId());
        assertEquals(2, payments.size());
    }

    @Test
    void testTotalPaid() {
        service.recordPayment(user.getId(), 75.5, PaymentType.CASH);
        service.recordPayment(user.getId(), 24.5, PaymentType.BANK_TRANSFER);

        double total = service.getTotalPaidByUser(user.getId());
        assertEquals(100.0, total, 0.001);
    }

    @Test
    void testRecordPaymentForUnknownUserThrowsException() {
        assertThrows(IllegalArgumentException.class, () ->
                service.recordPayment("unknown", 10.0, PaymentType.CASH)
        );
    }
}
