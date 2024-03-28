package com.bank.management;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private int customerId;
    private String name;
    private List<Account> accounts;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add account to customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

    
    
}
