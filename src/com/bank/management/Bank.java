package com.bank.management;

import java.util.ArrayList;
import java.util.List;

class Bank1 {
    private List<Customer> customers;

    public Bank1() {
        customers = new ArrayList<>();
    }

    // Add customer to bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Get customer by ID
    public Customer getCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null; // Customer not found
    }
}