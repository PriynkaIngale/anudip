package com.classDemo;

import java.util.Scanner;

public class SwappingExample {

	public void swapFunction(int a , int b)
	{
		int temp;
		temp=a;    //a=10 , b=30 , temp=a , temp=10
		a=b;	  //a=b a=30 //a=30 temp=10 b=30
		b=temp;	  //a=30 temp=10 b=10
		System.out.println("the vlaue of a is "+a);
		System.out.println("the vlaue of a is "+b);
	}
	
	public static void main(String[] args) {

		SwappingExample sx=new SwappingExample();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a=sc.nextInt();
		//calling the swap method 
		sx.swapFunction(10,30);
		System.out.println("Enter the value of b ");
		int b=sc.nextInt();
		sx.swapFunction(a,b);
		
		//System.out.println("Now , Befor and after swapping vlaues ");
	}

}
