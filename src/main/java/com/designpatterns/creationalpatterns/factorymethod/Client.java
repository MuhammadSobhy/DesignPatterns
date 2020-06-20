package com.designpatterns.creationalpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {

	protected List<BankAccount> accounts;
	
	public Client() {
		accounts = new ArrayList<BankAccount>();
	}

	protected void addAccount(String accountType) {
		accounts.add(createAccount(accountType));
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}	
	
	protected abstract BankAccount createAccount(String accountType);
	
}
