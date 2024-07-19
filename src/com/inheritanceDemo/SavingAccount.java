package com.inheritanceDemo;

public class SavingAccount extends BankAccount{

	String accountNumber;
	public SavingAccount(String accountNumber,double balance)
	{
		super(accountNumber,balance);
	}
	
	public void withdraw(double amount)
	{
		//if(getBalance()-amount<100)----this condition for saving account
		if(balance - amount<100)
		{
			System.out.println("you required to maintain the min balance amount that is 100NRI");
		}
		else
		{
			super.withdraw(amount);
		}
	}
}
