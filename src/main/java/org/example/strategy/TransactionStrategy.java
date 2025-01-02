package org.example.strategy;

import org.example.enums.menuoption.TransactionMenuOption;
import org.example.service.InputUtil;
import org.example.service.impl.TransactionService;

public class TransactionStrategy implements MenuStrategy{
    @Override
    public void display() {
        System.out.println("======================================");
        System.out.println("          TRANSACTION OPERATIONS      ");
        System.out.println("======================================");
        System.out.println("1. Transfer Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("0. Back to Main Menu");
        System.out.println("======================================");
        System.out.print("Please select an option: ");
        execute();
    }

    @Override
    public void execute() {
        TransactionService service = new TransactionService();
        TransactionMenuOption option=TransactionMenuOption.values()[InputUtil.getOption()];
        switch (option){
            case GET_TRANSACTIONS_BY_ACCOUNT_ID -> System.out.println("");
            case GET_BALANCE -> service.getBalance(InputUtil.requestAccountId());
            case TRANSFER -> service.transfer(InputUtil.requestCustomerId(),InputUtil.requestCustomerId(),InputUtil.requestMoney());
            case WITH_DRAW -> service.withdraw(InputUtil.requestAccountId(),InputUtil.requestMoney());
            case EXIT -> new MainMenuStrategy().display();
        }
    }
}
