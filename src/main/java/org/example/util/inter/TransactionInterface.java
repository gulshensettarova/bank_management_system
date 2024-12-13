package org.example.util.inter;

import org.example.model.Transaction;

import java.util.List;

public interface TransactionInterface {
    void withdraw(double amount);
    double getBalance();
    void transfer(long fromAccountId, long toAccountId, double amount);
    List<Transaction> getTransactionHistory(long accountId);
    Transaction getTransactionById(long transactionId);
    void reverseTransaction(long transactionId);
    double calculateFees(double amount);

}
