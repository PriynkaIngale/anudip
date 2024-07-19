package com.package1;

public class feb15ThisClass {

	int a;
	int b;
	feb15ThisClass()
	{
		this(10,20);
		System.out.println("Inside default constructor");
	}
	
	 feb15ThisClass(int a, int b) {

		 a=a;
		 b=b;
		 System.out.println("inside the parameterized contructor");
	 }

	public static void main(String[] args) {

		feb15ThisClass tiss =new feb15ThisClass();
		//feb15ThisClass tis=new feb15ThisClass(20,30);
	}

}
