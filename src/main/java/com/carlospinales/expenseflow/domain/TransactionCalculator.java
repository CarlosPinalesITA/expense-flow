package com.carlospinales.expenseflow.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

public class TransactionCalculator {
    private static BigDecimal sumAmounts(List<TransactionType> transactions,
                                         Predicate<TransactionType> condition){
        return  transactions.stream()
                .filter(condition)
                .map(TransactionType::amount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static BigDecimal totalIncome(List<TransactionType> transactions){
        return sumAmounts(transactions,
                transaction -> transaction instanceof Income);
    }

    public static BigDecimal totalExpense(List<TransactionType> transactions){
        return sumAmounts(transactions,
                transaction -> transaction instanceof Expense);
    }

    public static BigDecimal balance(List<TransactionType> transactions){
        return totalIncome(transactions).subtract(totalExpense(transactions));
    }
}
