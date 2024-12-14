package org.example.service;

import org.example.model.Account;
import org.example.model.Customer;

public class CustomerAccountService {
    public  static void addAccountToCustomer(Customer customer, Account account) {
        if(customer!=null && account!=null){
            customer.setAccount(account);
            System.out.println("New account added to customer: " + customer.getName());
        }
        else {
            System.out.println("Customer or Account cannot be null.");
        }
    }
}
