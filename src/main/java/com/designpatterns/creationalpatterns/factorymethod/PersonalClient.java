package com.designpatterns.creationalpatterns.factorymethod;

public class PersonalClient extends Client {

	@Override
	protected BankAccount createAccount(String accountType) {
		if (accountType.equals("advance")) {
			return new AdvanceAccount();
		} else if (accountType.equals("current")) {
			return new CurrentAccount();
		} else if (accountType.equals("saving")) {
			return new SavingAcount();
		} else {
			return null;
		}
	}

}
