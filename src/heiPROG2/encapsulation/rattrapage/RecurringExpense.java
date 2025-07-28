package heiPROG2.encapsulation.rattrapage;

import java.time.LocalDate;

public class RecurringExpense extends Expense {
    private String recurrence;

    public RecurringExpense(String label, double amount, LocalDate date, String recurrence) {
        super(label, amount, date);
        if (!recurrence.equals("monthly") && !recurrence.equals("yearly")) {
            throw new IllegalArgumentException("La récurrence doit être 'monthly' ou 'yearly'");
        }
        this.recurrence = recurrence;
    }

    public String getRecurrence() {
        return recurrence;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Récurrence: %s", recurrence);
    }


}
