package com.classDemo;

public class ExampleMinNumber {

//access specifier  return type   name of the function   a parameter list
//
	public int minFunction(int n , int m)//n=a,m=b
	{
		int min;
		if(n>m)
		{
			//System.out.println("the minimum value is "+m);
			min=m;
		}
		else
		{
			//System.out.println("the minimum value is "+n);
			min=n;
		}
		return min;
	}
	public static void main(String[] args) {

		int a=11;
		int b=6;
		
		
		ExampleMinNumber eg=new ExampleMinNumber();
		
		int c= eg.minFunction(a, b);//calling function
		System.out.println("minimum value "+c);
	}

}
