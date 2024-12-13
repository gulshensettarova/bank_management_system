package org.example.util;

import org.example.model.Customer;
import org.example.util.impl.CustomerUtil;

import java.util.Scanner;

public class MenuUtil {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayMenu(){
        System.out.println("======================================");
        System.out.println("          BANK MANAGEMENT MENU        ");
        System.out.println("======================================");
        System.out.println("1. View List of All Customers");
        System.out.println("2. Get Customer by ID");
        System.out.println("3. Add new customer");
        System.out.println("4. Remove Customer by ID");
        System.out.println("5. Edit Customer Details");
        System.out.println("6. Transfer Money");
        System.out.println("0. Exit");
        System.out.println("======================================");
        System.out.print("Please select an option: ");
    }
    public static void executeOperation(CustomerUtil cu) {
        System.out.println("Please enter the operation: ");
        int option = scanner.nextInt();
        switch (option){
            case 0->System.exit(0);
            case 1-> {
                for (Customer customer : cu.getCustomers()) {
                    System.out.println(customer.getName());
                }
            }
            case 2-> {
                System.out.print("Enter Customer ID: ");
                int id = scanner.nextInt();
                System.out.println(cu.getCustomer(id).getName());
            }
            case 3-> cu.add(cu.getRequest());
            case 4-> {
                System.out.print("Enter Customer ID: ");
                int id = scanner.nextInt();
                cu.remove(id);
            }
            case 5-> {
                System.out.print("Enter Customer ID: ");
                int id = scanner.nextInt();
                cu.edit(id, cu.getRequest());
            }
            default -> System.out.println("Invalid option. Please try again.");

        }
    }
}
