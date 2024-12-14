package org.example.service.inter;

import org.example.model.Transaction;

import java.util.List;

public interface TransactionInterface {
    void withdraw(long accountId,double amount);
    double getBalance(long accountId);
    void transfer(long fromAccountId, long toAccountId, double amount);
    List<Transaction> getTransactionHistory(long accountId);
    Transaction getTransactionsByCustomerId(long transactionId);
    void reverseTransaction(long transactionId);
    double calculateFees(double amount);

}
