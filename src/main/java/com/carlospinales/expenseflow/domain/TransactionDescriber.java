package com.carlospinales.expenseflow.domain;

import java.math.BigDecimal;

public class TransactionDescriber {

    public static String describe(TransactionType type){
        return switch(type){
            case Income  income -> "The income was a total to: " + income.amount() + " pesos. To: " + income.source();
            case Expense expense -> "The expense was a total to: " + expense.amount() + " pesos. For: " + expense.category();
        };
    }
    public static String describeBalance(BigDecimal balance){
        if (balance.compareTo(BigDecimal.ZERO) < 0){
            return "El balance result in expense to " + balance.abs().toPlainString();
        }
        return "El balance result en Income to " + balance.abs().toPlainString();
    }
}
