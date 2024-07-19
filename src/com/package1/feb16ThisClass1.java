package com.package1;

public class feb16ThisClass1 {

	int a;
	int b;
	
	feb16ThisClass1()
	{
		this.a=10;
		b=20;
	}
	public feb16ThisClass1 get() 
	{
		return this;	
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {

		feb16ThisClass1 ts =new feb16ThisClass1();
		ts.display();
		ts.get().display();	
	}

}
