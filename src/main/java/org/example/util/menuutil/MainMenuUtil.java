package org.example.util.menuutil;


import org.example.enums.menuoption.MainMenuOption;
import org.example.service.InputUtil;

public class MainMenuUtil {
    public static void displayMainMenu() {
        System.out.println("======================================");
        System.out.println("          BANK MANAGEMENT SYSTEM      ");
        System.out.println("======================================");
        System.out.println("1. Customer Operations");
        System.out.println("2. Account Operations");
        System.out.println("3. Transaction Operations");
        System.out.println("0. Exit");
        System.out.println("======================================");
        System.out.print("Please select an option: ");
        executeMenu();
    }
    public static void executeMenu(){
        MainMenuOption option = MainMenuOption.values()[InputUtil.getOption()];
        switch (option){
            case CUSTOMER -> CustomerMenuUtil.displayCustomerMenu();
            case ACCOUNT -> AccountMenuUtil.displayAccountMenu();
            case TRANSACTION -> TransactionMenuUtil.displayTransactionMenu();
            case EXIT -> System.exit(0);
        }
    }

}
