package com.bank.management2;

import java.util.HashMap;
import java.util.Map;

class Bank {
    private Map<String, Double> accounts;
    private Map<String, String> users;

    public Bank() {
        accounts = new HashMap<>();
        users = new HashMap<>();
    }

    public void createUser(String username, String password) {
        // ------> Check if the username already exists
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please choose another one.");
        } else {
            users.put(username, password);
            accounts.put(username, 0.0);
            System.out.println("User created successfully!");
        }
    }

    public boolean authenticate(String username, String password) {
        // ------> Check if the username exists and the password matches
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public void deposit(String username, double amount) {
        // ------> Check if the username exists
        if (accounts.containsKey(username)) {
            double balance = accounts.get(username);
            balance += amount;
            accounts.put(username, balance);
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("User not found. Please check the username.");
        }
    }

    public void withdraw(String username, double amount) {
        // Check if the username exists and if the balance is sufficient
        if (accounts.containsKey(username)) {
            double balance = accounts.get(username);
            if (balance >= amount) {
                balance -= amount;
                accounts.put(username, balance);
                System.out.println("Withdrawal successful. Current balance: " + balance);
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("User not found. Please check the username.");
        }
    }

    public void displayBalance(String username) {
        // ----> Check if the username exists
        if (accounts.containsKey(username)) {
            double balance = accounts.get(username);
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("User not found. Please check the username.");
        }
    }
}