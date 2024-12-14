package org.example.util.menuutil;

import org.example.model.Account;
import org.example.model.Bank;

public class AccountUtil {
    public static Account getAccount(long accountId) {
       return Bank.customerList.values().stream()
                .flatMap(customer -> customer.getAccounts().stream())
                .filter(account -> account.getNumber() == accountId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Source account not found: " + accountId));
    }
}
