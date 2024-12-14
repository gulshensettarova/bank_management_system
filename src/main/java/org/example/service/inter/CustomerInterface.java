package org.example.service.inter;

import org.example.model.Customer;

import java.util.List;

public interface CustomerInterface {
    void add(Customer customer);
    void remove(long id);
    void edit(long id,Customer customer);
    Customer getCustomer(int id);
    List<Customer> getCustomers();

}
