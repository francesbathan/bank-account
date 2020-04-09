package com.bank.main;

public class BankAccount {
	public String accountNumber = setAccountNumber();
	public double checkingBalance = 0;
	public double savingsBalance = 0;
	public static int numberOfAccounts = 0;
	public static double totalAmount = 0;
	
	private String setAccountNumber() {
		long randomAcctNum = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		numberOfAccounts++;
		return Long.toString(randomAcctNum);
	}
	
	public String getAccountNumber() {
		return "Your account number:" + this.accountNumber;
	}
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	public void depositMoney(double depositedAmount, String account) {
		if(account == "checking") {
			this.checkingBalance = this.checkingBalance + depositedAmount;
			System.out.println("Successfully deposited amount in checking: $" + depositedAmount);
		}
		else if(account == "savings") {
			this.savingsBalance = this.savingsBalance + depositedAmount;
			System.out.println("Successfully deposited amount in savings: $" + depositedAmount);
		}
	}
	
	public void withdrawMoney(double withdrawnAmount, String account) {
		if(account == "checking") {
			if(this.checkingBalance < withdrawnAmount) {
				System.out.println("Withdrawal cancelled. Your checking account has insufficient funds.");
			}
			else {
				this.checkingBalance = this.checkingBalance - withdrawnAmount;
				System.out.println("Successfully withdrew amount from checking: $" + withdrawnAmount);
			}
		}
		if(account == "savings") {
			if(this.savingsBalance < withdrawnAmount) {
				System.out.println("Withdrawal cancelled. Your savings account has insufficient funds.");
			}
			else {
				this.savingsBalance = this.savingsBalance - withdrawnAmount;
				System.out.println("Successfully withdrew from savings: $" + withdrawnAmount);
			}
		}
	}
	
	public String getChecking() {
		return "Checking Balance: $" + this.checkingBalance;
	}
	
	public String getSavings() {
		return "Savings Balance: $" + this.savingsBalance;
	}
	
	public String getTotalAmount() {
		totalAmount = this.checkingBalance + this.savingsBalance;
		return "Total Balance: $" + totalAmount;
	}
}
