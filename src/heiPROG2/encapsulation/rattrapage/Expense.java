package heiPROG2.encapsulation.rattrapage;

import java.time.LocalDate;

public class Expense {
    private String label ;
    private double amount;
    private LocalDate date;

    public Expense(String label, double amount, LocalDate date) {
        this.label = label;
        this.amount = amount;
        this.date = date;
    }

    boolean isLargeExpense() {
        return amount > 100.0;
    }

    public String toString() {
        return String.format("Dépense: %s | Montant: %.2f € | Date: %s | Importante: %s",
                label,
                amount,
                date,
                isLargeExpense() ? "Oui" : "Non"
        );
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
