package org.example.service;

import org.example.model.Account;
import org.example.model.Customer;

import java.util.Objects;

public class CustomerAccountService {
    public  static void addAccountToCustomer(Customer customer, Account account) {
        if(Objects.nonNull(customer) && Objects.nonNull(account)){
            customer.setAccount(account);
            System.out.println("New account added to customer: " + customer.getName());
        }
        else {
            System.out.println("Customer or Account cannot be null.");
        }
    }
}
