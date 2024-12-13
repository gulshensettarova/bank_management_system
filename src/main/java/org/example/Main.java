package org.example;

import org.example.util.MenuUtil;
import org.example.util.impl.CustomerUtil;

public class Main {
    public static void main(String[] args) {
     while(true){
         MenuUtil.displayMenu();
         MenuUtil.executeOperation(new CustomerUtil());
     }
    }
}