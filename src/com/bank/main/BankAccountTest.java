package com.bank.main;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount newAccount1 = new BankAccount();
		BankAccount newAccount2 = new BankAccount();
		
		System.out.println(BankAccount.numberOfAccounts);
		
		System.out.println(newAccount1.getAccountNumber());
		System.out.println(newAccount2.getAccountNumber());
		
		newAccount1.depositMoney(550.89, "checking");
		newAccount1.depositMoney(200.00, "savings");
		newAccount1.depositMoney(100.00, "checking");
		newAccount1.withdrawMoney(150, "checking");
		System.out.println(newAccount1.getChecking());
		
		newAccount1.withdrawMoney(250, "savings");
		System.out.println(newAccount1.getSavings());
		
		System.out.println(newAccount1.getTotalAmount());
	}

}
