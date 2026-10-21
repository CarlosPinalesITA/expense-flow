package com.carlospinales.expenseflow;

import com.carlospinales.expenseflow.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ExpenseFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseFlowApplication.class, args);

        TransactionType typeI = new Income(new BigDecimal("15000.00"), "Nomina", LocalDate.now(), "Banamex");
        TransactionType typeI2 = new Income(new BigDecimal("2000.00"), "Nomina", LocalDate.now(), "Banamex");
        System.out.println(TransactionDescriber.describe(typeI));

        TransactionType typeE = new Expense(new BigDecimal("250.00"),"Comida",LocalDate.now(),"Comida","Tarjeta de credito");
        TransactionType typeE2 = new Expense(new BigDecimal("1200.50"),"Comida",LocalDate.now(),"Comida","Tarjeta de credito");
        TransactionType typeE3 = new Expense(new BigDecimal("90.00"),"Comida",LocalDate.now(),"Comida","Tarjeta de credito");
        System.out.println(TransactionDescriber.describe(typeE));

        List<TransactionType> items =List.of(typeI, typeI2, typeE,typeE2,typeE3);
        System.out.println("Las ganancias de este mes fueron: " + TransactionCalculator.totalIncome(items));
        System.out.println("Los gastos de este mes fueron: " + TransactionCalculator.totalExpense(items));
        System.out.println(TransactionDescriber.describeBalance(TransactionCalculator.balance(items)));
    }

}
