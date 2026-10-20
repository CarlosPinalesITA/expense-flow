package com.carlospinales.expenseflow.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public sealed interface TransactionType permits Income, Expense {
    BigDecimal amount();
    String description();
    LocalDate date();
}
