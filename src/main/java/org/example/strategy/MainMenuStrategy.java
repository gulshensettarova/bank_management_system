package org.example.strategy;

import org.example.enums.menuoption.MainMenuOption;
import org.example.util.InputUtil;

public class MainMenuStrategy implements MenuStrategy{
    @Override
    public void display() {
        System.out.println("======================================");
        System.out.println("          BANK MANAGEMENT SYSTEM      ");
        System.out.println("======================================");
        System.out.println("1. Customer Operations");
        System.out.println("2. Account Operations");
        System.out.println("3. Transaction Operations");
        System.out.println("0. Exit");
        System.out.println("======================================");
        System.out.print("Please select an option: ");
        execute();
    }

    @Override
    public void execute() {
        MainMenuOption option = MainMenuOption.values()[InputUtil.getOption()];
        option.getStrategy().display();
    }
}
