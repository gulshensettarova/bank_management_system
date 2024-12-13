package org.example.model;

import org.example.enums.TransactionType;

import java.util.Date;

public class Transaction {
    private long id;
    private Date date;
    private double amount;
    private String description;
    private TransactionType type;
}
