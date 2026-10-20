package com.carlospinales.expenseflow;

import com.carlospinales.expenseflow.domain.Expense;
import com.carlospinales.expenseflow.domain.Income;
import com.carlospinales.expenseflow.domain.TransactionDescribe;
import com.carlospinales.expenseflow.domain.TransactionType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class ExpenseFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseFlowApplication.class, args);

        TransactionType typeI = new Income(new BigDecimal("250.00"), "Nomina", LocalDate.now(), "Banamex");
        System.out.println(TransactionDescribe.describe(typeI));

        TransactionType typeE = new Expense(new BigDecimal("250.00"),"Comida",LocalDate.now(),"Comida","Tarjeta de credito");
        System.out.println(TransactionDescribe.describe(typeE));

    }

}
