package org.example.service.impl;

import org.example.model.Bank;
import org.example.model.Customer;
import org.example.service.CustomerInterface;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements CustomerInterface {

    Scanner sc=new Scanner(System.in);


    @Override
    public void add(Customer request) {
        if(!Bank.customerList.containsKey(request.getId())){
            Bank.customerList.put(request.getId(), request);
            System.out.println("Customer added successfully!");
        }
        else System.out.println("Customer with this ID already exists!");

    }

    @Override
    public void remove(long id) {
       if(Bank.customerList.containsKey(id)){
           Bank.customerList.remove(id);
           System.out.println("Customer removed successfully!");

       }
       else throw new RuntimeException("Customer with ID " + id + " does not exist.");
    }

    @Override
    public void edit(long id, Customer request) {
        Customer existingCustomer = Bank.customerList.get(id);
        if (existingCustomer != null) {
            existingCustomer.setName(request.getName());
            existingCustomer.setSurname(request.getSurname());
            existingCustomer.setBirthdate(request.getBirthdate());
            System.out.println("Customer details updated successfully!");
        } else {
            throw new RuntimeException("Customer with ID " + id + " does not exist.");
        }
    }

    @Override
    public Customer getCustomer(int id) {
        return Bank.customerList.get(id);
    }

    @Override
    public List<Customer> getCustomers() {
        return List.copyOf(Bank.customerList.values());
    }
}
