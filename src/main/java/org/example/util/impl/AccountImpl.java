package org.example.util.impl;

import org.example.enums.AccountType;
import org.example.model.Account;
import org.example.model.Bank;
import org.example.model.Customer;
import org.example.util.CustomerService;
import org.example.util.inter.AccountInterface;

import java.util.Scanner;

public class AccountImpl implements AccountInterface {
    private static final Scanner sc = new Scanner(System.in);

    public Account getRequest(){
        System.out.println("Enter account number: ");
        Account account=new Account();
        account.setNumber(sc.nextInt());
        System.out.println("Enter account balance: ");
        account.setBalance(sc.nextDouble());
        System.out.println("Enter account type:");
        for (AccountType type : AccountType.values()) {
            System.out.println(type.ordinal()+". "+type);
        }
        account.setAccountType(AccountType.valueOf(sc.next()));
        return account;

    }
    @Override
    public void createAccount(Customer customer, Account request) {
       CustomerService.addAccountToCustomer(customer,request);
    }

    @Override
    public void removeAccount(Customer customer, long accountId) {
        customer.getAccounts().stream()
                .filter(account -> account.getNumber() == accountId)
                .findFirst()
                .ifPresentOrElse(
                        account -> {
                            customer.getAccounts().remove(account);
                            System.out.println("Account with ID " + accountId + " has been removed.");
                        },
                        () -> System.out.println("Account with ID " + accountId + " not found.")
                );
    }


    @Override
    public void updateAccount() {

    }

    @Override
    public double getBalance() {
        return 0;
    }
}
