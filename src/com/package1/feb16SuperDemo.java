package com.package1;

class SuperPrime
{
	String name;
}
public class feb16SuperDemo extends SuperPrime {
	
	String name;
	public void details()
	{
		super.name="Parent";
		this.name="Child";
		System.out.println(super.name);
		System.out.println(name);
	}
	public static void main(String[] args) {

		feb16SuperDemo obj= new feb16SuperDemo();
		obj.details();
	}

}
