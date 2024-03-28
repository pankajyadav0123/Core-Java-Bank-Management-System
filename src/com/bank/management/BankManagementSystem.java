package com.bank.management;

import java.util.Scanner;

public class BankManagementSystem {
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        // Create a bank
        Bank1 bank = new Bank1();

        // Create customers
        Customer customer1 = new Customer(1, "Pankaj Yadav");
        Customer customer2 = new Customer(2, "Ritik Yadav");
        Customer customer3 = new Customer(3, " Yadav Ji");

        // Create accounts
        Account account1 = new Account(101, "Savings", 5000);
        Account account2 = new Account(102, "Current", 2000);
        Account account3 = new Account(201, "Savings", 10000);

        // Add accounts to customers
        customer1.addAccount(account1);
        customer2.addAccount(account2);
        customer3.addAccount(account3);

        // Add customers to bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        // Example: Find customer by ID and print account details
        //int customerIdToFind ;
        System.out.println("Enter the CustId");
        int customerIdToFind = s.nextInt();
        
        Customer foundCustomer = bank.getCustomerById(customerIdToFind);
        if (foundCustomer != null) {
            System.out.println("Customer: " + foundCustomer.getName());
            for (Account account : foundCustomer.getAccounts()) {
                System.out.println("Account ID: " + account.getAccountId() + ", Type: " + account.getAccountType() + ", Balance: " + account.getBalance());
            }
        } else {
            System.out.println("Customer not found!");
        }
    }
}
