package com.package1;

public class feb16ThisClass2 {

	int a;
	int b;
	
	feb16ThisClass2()
	{
		a=10;
		b=20;
	}
	public void display(feb16ThisClass2 test )//test is variable
	{
		System.out.println(a);
		System.out.println(b);
	}
	public void get()
	{
		display(this);
	}
	public static void main(String[] args) {

		feb16ThisClass2 ts=new feb16ThisClass2();
//		feb16ThisClass2 ts;//reference
		ts.get();
	
	}

}
