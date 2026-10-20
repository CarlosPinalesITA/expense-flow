package com.carlospinales.expenseflow.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Expense(BigDecimal amount, String description, LocalDate date, String category, String paymentMethod) implements TransactionType {

}
