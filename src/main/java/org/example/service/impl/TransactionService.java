package org.example.service.impl;

import org.example.model.Account;
import org.example.model.Bank;
import org.example.model.Transaction;
import org.example.service.TransactionInterface;
import org.example.util.AccountUtil;

import java.util.List;

public class TransactionService implements TransactionInterface {
    @Override
    public void withdraw(long accountId,double amount) {
        Account fromAccount= AccountUtil.getAccount(accountId);
        if (fromAccount.getBalance() < amount) {
            fromAccount.setBalance(fromAccount.getBalance()-amount);
        }
        else  System.out.println("Error: Insufficient funds. Your balance is: " + fromAccount.getBalance());

    }

    @Override
    public double getBalance(long accountId) {
        return AccountUtil.getAccount(accountId).getBalance();
    }

    @Override
    public void transfer(long fromAccountId, long toAccountId, double amount) {
        Account fromAccount=AccountUtil.getAccount(fromAccountId);
        Account toAccount=AccountUtil.getAccount(toAccountId);
       if(fromAccount.getBalance()>=amount)
       {
            fromAccount.setBalance(fromAccount.getBalance()-amount);
            toAccount.setBalance(toAccount.getBalance()+amount);
            System.out.println("Transfer successful! Amount: " + amount);
            System.out.println("From Account: " + fromAccountId + " | New Balance: " + fromAccount.getBalance());
            System.out.println("To Account: " + toAccountId + " | New Balance: " + toAccount.getBalance());
        }
       else System.out.println("The balance is insufficient");
    }

    @Override
    public List<Transaction> getTransactionHistory(long accountId) {
        return List.of();
    }

    @Override
    public Transaction getTransactionsByCustomerId(long transactionId) {
        return Bank.customerList.values().stream()
                .flatMap(customer -> customer.getAccounts().stream())
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getId() == transactionId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Transaction with ID " + transactionId + " not found."));
    }

    @Override
    public void reverseTransaction(long transactionId) {

    }

    @Override
    public double calculateFees(double amount) {
        return 0;
    }
}
