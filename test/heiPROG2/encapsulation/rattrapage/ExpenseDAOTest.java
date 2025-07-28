package heiPROG2.encapsulation.rattrapage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseDAOTest {

    private ExpenseDAO dao;

    @BeforeEach
    void setUp() {
        List<Expense> expenses = List.of(
                new RefundableExpense("Frais taxi", 120.0, LocalDate.of(2025, 7, 1)),         // Grosse + remboursable
                new RefundableExpense("Déjeuner pro", 90.0, LocalDate.of(2025, 7, 2)),        // remboursable, pas grosse
                new RecurringExpense("Netflix", 15.99, LocalDate.of(2025, 7, 3), "monthly"),  // récurrente
                new Expense("Stylo", 3.50, LocalDate.of(2025, 7, 4))                          // normale, pas remboursable
        );

        // Marquer une comme remboursée
        ((RefundableExpense) expenses.get(0)).refund();

        dao = new ExpenseDAO(expenses);
    }

    @Test
    void testGetUnrefundedExpenses() {
        List<RefundableExpense> result = dao.getUnrefundedExpenses();
        assertEquals(1, result.size());
        assertEquals("Déjeuner pro", result.get(0).getLabel());
        assertFalse(result.get(0).isRefunded());
    }

    @Test
    void testGetTotalRecurringExpenses() {
        double total = dao.getTotalRecurringExpenses();
        assertEquals(15.99, total, 0.01);
    }

    @Test
    void testGetLabelsOfLargeExpenses() {
        List<String> labels = dao.getLabelsOfLargeExpenses();
        assertTrue(labels.contains("Frais taxi"));
        assertFalse(labels.contains("Déjeuner pro"));
        assertEquals(1, labels.size());
    }

    @Test
    void testGetTotalOfAllExpenses() {
        double expectedTotal = 120.0 + 90.0 + 15.99 + 3.50;
        assertEquals(expectedTotal, dao.getTotalOfAllExpenses(), 0.01);
    }
}
