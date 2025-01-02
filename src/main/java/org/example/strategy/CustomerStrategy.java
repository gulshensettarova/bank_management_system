package org.example.strategy;

import org.example.enums.menuoption.CustomerMenuOption;
import org.example.util.InputUtil;
import org.example.service.impl.CustomerService;
import org.example.util.CustomerUtil;

public class CustomerStrategy implements MenuStrategy{
    @Override
    public void display() {
        System.out.println("======================================");
        System.out.println("          CUSTOMER OPERATIONS         ");
        System.out.println("======================================");
        System.out.println("1. View All Customers");
        System.out.println("2. Get Customer by ID");
        System.out.println("3. Add New Customer");
        System.out.println("4. Remove Customer");
        System.out.println("5. Edit Customer Details");
        System.out.println("0. Back to Main Menu");
        System.out.println("======================================");
        System.out.print("Please select an option: ");
        execute();
    }
    @Override
    public void execute() {
        CustomerMenuOption option = CustomerMenuOption.values()[InputUtil.getOption()];
        CustomerService service = new CustomerService();
        switch (option) {
            case VIEW_CUSTOMERS -> CustomerUtil.displayCustomers(service);
            case GET_CUSTOMER_BY_ID -> service.getCustomer(InputUtil.requestCustomerId());
            case ADD_CUSTOMER -> service.add(InputUtil.requestCustomer());
            case REMOVE_CUSTOMER -> service.remove(InputUtil.requestCustomerId());
            case EDIT_CUSTOMER -> service.edit(InputUtil.requestCustomerId(), InputUtil.requestCustomer());
            case BACK_TO_MAIN_MENU ->  new MainMenuStrategy().display();

            default -> System.out.println("Invalid option. Please try again.");
        }
    }
}
