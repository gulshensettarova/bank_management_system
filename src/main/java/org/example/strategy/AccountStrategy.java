package org.example.strategy;

public class AccountStrategy implements MenuStrategy{
    @Override
    public void display() {
        System.out.println("======================================");
        System.out.println("          ACCOUNT OPERATIONS          ");
        System.out.println("======================================");
        System.out.println("1. Create New Account");
        System.out.println("2. Remove Account");
        System.out.println("3. View Account Balance");
        System.out.println("0. Back to Main Menu");
        System.out.println("======================================");
        System.out.print("Please select an option: ");
        execute();
    }

    @Override
    public void execute() {

    }
}
