package com.designpatterns.creationalpatterns.factorymethod;

public class BusinessClient extends Client {

	@Override
	protected BankAccount createAccount(String accountType) {
		if (accountType.equals("business")) {
			return new BusinessAccount();
		} else {
			return null;
		}		
	}

}
