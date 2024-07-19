//19feb24
package com.inheritanceDemo;

public class BankAccount //extends object by default in the backgroun
{
		public String accountNumber;
		public double balance;
		
		public BankAccount(String accountNumber ,double balance )
		{
			this.accountNumber=accountNumber;
			this.balance=balance;
		}
		public void deposit(double amount)
		{
			balance+=amount; //balance =balance+amount;
		}
		public void withdraw(double amount)
		{
			if(balance>=amount)
			{
				balance-=amount;  //balance=balance-amount;
			}
			else
			{
				System.out.println("Insufficient amount");
			}
		}
		public double getBalance()
		{
			return balance;
			
		}
}
