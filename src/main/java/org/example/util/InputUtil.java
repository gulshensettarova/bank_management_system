package org.example.util;

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
    public  static double requestMoney(){
        System.out.print("Enter amount to transfer: ");
        return scanner.nextDouble();
    }
}
