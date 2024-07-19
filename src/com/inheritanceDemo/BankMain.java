package com.inheritanceDemo;

public class BankMain {

	public static void main(String[] args) {

		System.out.println("Initial balance for the account a/c258976 is 500");
		
	BankAccount A2575 = new BankAccount(" A/C 2575" , 500);
	
	//deposite the amount int he bank
	
	System.out.println("Deposite 1000 rs into A/c-2575");
	A2575.deposit(1000);
	System.out.println("New Balance after deposting 1000 is = " + A2575.getBalance());
	
	//withdraw the amount 600 from the account
	System.out.println("withdraw the amount 600 from the account A2575");
	A2575.withdraw(600);
	System.out.println("new balance after withdraw 600rs is "+A2575.getBalance());
	
	//create an object for saving account the initial amount would be 450rs withdraw(300) getbalance();?
	SavingAccount S2575=new SavingAccount("S/C2575",450);
	
	S2575.withdraw(300);
	System.out.println(" new balance after withdraw 300rs is   "+S2575.getBalance());
	}

}
