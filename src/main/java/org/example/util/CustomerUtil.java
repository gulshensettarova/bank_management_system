package org.example.util;

import org.example.model.Customer;
import org.example.service.impl.CustomerService;

public class CustomerUtil {
    public static void displayCustomers(CustomerService service) {
        service.getCustomers().stream()
                .forEach(customer -> System.out.println(customer.getName()));
    }
}
