package org.example.service;

import org.example.model.Customer;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner scanner= new Scanner(System.in);
    public static int getOption(){
        System.out.println("Please enter the operation: ");
        return scanner.nextInt();
    }
    public  static int requestCustomerId(){
        System.out.print("Enter Customer ID: ");
        return scanner.nextInt();
    }
    public static int requestAccountId(){
        System.out.print("Enter Customer ID: ");
        return scanner.nextInt();
    }
    public  static double requestMoney(){
        System.out.print("Enter amount to transfer: ");
        return scanner.nextDouble();
    }
    public static Customer requestCustomer(){
        Customer customer = new Customer();
        System.out.println("Enter Customer ID: ");
        customer.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Customer Name: ");
        customer.setName(scanner.nextLine());
        System.out.println("Enter Customer Surname: ");
        customer.setSurname(scanner.nextLine());
        System.out.println("Enter Customer Birth Date (yyyy-MM-dd): ");
        customer.setBirthdate(scanner.nextLine());
        return customer;
    }

}
