package org.example;

import org.example.util.MenuUtil;
import org.example.util.impl.AccountUtil;
import org.example.util.impl.CustomerUtil;
import org.example.util.impl.TransactionUtil;

public class Main {
    public static void main(String[] args) {
     while(true){
         MenuUtil.displayMenu();
         MenuUtil.executeOperation(new CustomerUtil(),new AccountUtil(),new TransactionUtil());
     }
    }
}