package org.example.enums.menuoption;

import org.example.strategy.*;

public enum MainMenuOption {
    EXIT,
    CUSTOMER(new CustomerStrategy()),
    ACCOUNT(new AccountStrategy()),
    TRANSACTION(new TransactionStrategy());

    private MenuStrategy strategy;

    public MenuStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(MenuStrategy strategy) {
        this.strategy = strategy;
    }

    MainMenuOption(MenuStrategy strategy){
        this.strategy = strategy;
    }
    MainMenuOption(){

    }
}
