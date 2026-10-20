package com.carlospinales.expenseflow.domain;

public class TransactionDescribe {

    public static String describe(TransactionType type){
        return switch(type){
            case Income  income -> "The income was a total to: " + income.amount() + " pesos. To: " + income.source();
            case Expense expense -> "The expense was a total to: " + expense.amount() + " pesos. For: " + expense.category();
        };
    }
}
