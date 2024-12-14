package org.example.util.inter;

import org.example.model.Account;
import org.example.model.Customer;

public interface AccountInterface {
     public void createAccount(Customer customer, Account request);
     void removeAccount(Customer customer, long accountId);
}
