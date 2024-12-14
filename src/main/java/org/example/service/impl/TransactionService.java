package org.example.service.impl;

import org.example.model.Account;
import org.example.model.Bank;
import org.example.model.Transaction;
import org.example.service.inter.TransactionInterface;

import java.util.List;

public class TransactionService implements TransactionInterface {
    @Override
    public void withdraw(double amount) {

    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void transfer(long fromAccountId, long toAccountId, double amount) {
        Account fromAccount=Bank.customerList.values().stream()
                .flatMap(customer -> customer.getAccounts().stream())
                .filter(account -> account.getNumber()==fromAccountId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Source account not found: " + fromAccountId));

        Account toAccount=Bank.customerList.values().stream()
                .flatMap(customer -> customer.getAccounts().stream())
                .filter(account -> account.getNumber()==toAccountId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Destination account not found: " + toAccountId));

        fromAccount.setBalance(fromAccount.getBalance()-amount);
        toAccount.setBalance(toAccount.getBalance()+amount);

        System.out.println("Transfer successful! Amount: " + amount);
        System.out.println("From Account: " + fromAccountId + " | New Balance: " + fromAccount.getBalance());
        System.out.println("To Account: " + toAccountId + " | New Balance: " + toAccount.getBalance());
    }

    @Override
    public List<Transaction> getTransactionHistory(long accountId) {
        return List.of();
    }

    @Override
    public Transaction getTransactionById(long transactionId) {
        return null;
    }

    @Override
    public void reverseTransaction(long transactionId) {

    }

    @Override
    public double calculateFees(double amount) {
        return 0;
    }
}
