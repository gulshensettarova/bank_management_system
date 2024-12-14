package org.example.util;

import org.example.model.Customer;
import org.example.util.impl.AccountUtil;
import org.example.util.impl.CustomerUtil;
import org.example.util.impl.TransactionUtil;

import java.util.Scanner;

public class MenuUtil {
    private static final Scanner scanner = new Scanner(System.in);

    private static final int VIEW_CUSTOMERS = 1;
    private static final int GET_CUSTOMER_BY_ID = 2;
    private static final int ADD_CUSTOMER = 3;
    private static final int REMOVE_CUSTOMER = 4;
    private static final int EDIT_CUSTOMER = 5;
    private static final int TRANSFER_MONEY = 6;
    private static final int NEW_ACCOUNT = 7;
    private static final int EXIT = 0;
    public static void displayMenu(){
        System.out.println("======================================");
        System.out.println("          BANK MANAGEMENT MENU        ");
        System.out.println("======================================");
        System.out.println("1. View List of All Customers");//+
        System.out.println("2. Get Customer by ID"); //+
        System.out.println("3. Add new customer"); //+
        System.out.println("4. Remove Customer by ID"); //+
        System.out.println("5. Edit Customer Details"); //+
        System.out.println("6. Transfer Money");
        System.out.println("7. New Account"); //+
        System.out.println("0. Exit"); //+
        System.out.println("======================================");
        System.out.print("Please select an option: ");
    }
    public static void executeOperation(CustomerUtil cu, AccountUtil au, TransactionUtil tu) {
        System.out.println("Please enter the operation: ");
        int option = scanner.nextInt();
        switch (option){
            case VIEW_CUSTOMERS-> {
                for (Customer customer : cu.getCustomers()) {
                    System.out.println(customer.getName());
                }
            }
            case GET_CUSTOMER_BY_ID->System.out.println(cu.getCustomer(requestCustomerId()).getName());
            case ADD_CUSTOMER-> cu.add(cu.getRequest());
            case REMOVE_CUSTOMER-> cu.remove(requestCustomerId());
            case EDIT_CUSTOMER-> cu.edit(requestCustomerId(), cu.getRequest());
            case TRANSFER_MONEY -> tu.transfer(requestCustomerId(),requestCustomerId(),requestMoney());
            case NEW_ACCOUNT-> au.createAccount(cu.getCustomer(requestCustomerId()),au.getRequest());
            case EXIT->System.exit(0);
            default -> System.out.println("Invalid option. Please try again.");

        }
    }

    public  static int requestCustomerId(){
        System.out.print("Enter Customer ID: ");
        return scanner.nextInt();
    }
    public  static double requestMoney(){
        System.out.print("Enter amount to transfer: ");
        return scanner.nextDouble();
    }
}
