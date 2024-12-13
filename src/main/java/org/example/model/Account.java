package org.example.model;

import org.example.enums.AccountType;
import org.example.enums.Currency;

import java.util.Date;
import java.util.List;

public class Account {
    private long id;
    private double balance;
    private double interestRate;
    private AccountType accountType;
    private Currency currency;
    private Date createdAt;
    private boolean isActive;
    private List<Transaction> transactions;
}
