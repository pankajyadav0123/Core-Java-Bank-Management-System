package com.bank.management2;


import java.util.Scanner;



public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        String currentUser = "";

        while (true) {
            if (!loggedIn) {
                System.out.println("1. Create User");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        System.out.print("Enter username: ");
                        String newUser = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String newPassword = scanner.nextLine();
                        bank.createUser(newUser, newPassword);
                        break;
                    case 2:
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();
                        if (bank.authenticate(username, password)) {
                            loggedIn = true;
                            currentUser = username;
                            System.out.println("Login successful!");
                        } else {
                            System.out.println("Invalid username or password!");
                        }
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            } else {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Logout");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        bank.deposit(currentUser, depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        bank.withdraw(currentUser, withdrawalAmount);
                        break;
                    case 3:
                        bank.displayBalance(currentUser);
                        break;
                    case 4:
                        loggedIn = false;
                        currentUser = "";
                        System.out.println("Logged out successfully!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }
    }
}
