package org.example.enums.menuoption;

import org.example.strategy.*;

public enum MainMenuOption {
    EXIT(new ExitStrategy()),
    CUSTOMER(new CustomerStrategy()),
    ACCOUNT(new AccountStrategy()),
    TRANSACTION(new TransactionStrategy()),
    MAIN(new MainMenuStrategy());

    private final MenuStrategy strategy;

    public MenuStrategy getStrategy() {
        return strategy;
    }


    MainMenuOption(MenuStrategy strategy){
        this.strategy = strategy;
    }

}
