package com.carlospinales.expenseflow.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Income(BigDecimal amount, String description, LocalDate date, String source) implements TransactionType {

}
