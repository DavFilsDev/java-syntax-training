package heiPROG2.encapsulation.rattrapage;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;

public class ExpenseDAO {

    private List<Expense> expenses;

    public ExpenseDAO(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<RefundableExpense> getUnrefundedExpenses() {
        return expenses.stream()
                .filter(e -> e instanceof RefundableExpense)
                .map(e -> (RefundableExpense) e)
                .filter(e -> !e.isRefunded())
                .collect(Collectors.toList());
    }

    public double getTotalRecurringExpenses() {
        return expenses.stream()
                .filter(e -> e instanceof RecurringExpense)
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public List<String> getLabelsOfLargeExpenses() {
        return expenses.stream()
                .filter(e -> e.getAmount() > 100.0)
                .map(Expense::getLabel)
                .collect(Collectors.toList());
    }

    public double getTotalOfAllExpenses() {
        return expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }
}


