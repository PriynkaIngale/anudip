package com.classDemo;

public class ExampleMin {


	public boolean minFunction(int n , int m)//n=a,m=b
	{//if m is min then return true and if n is min then reurn flause
		boolean min;
		if(n>m)
		{
			//System.out.println("the minimum value is "+m);
			min=true;
		}
		else
		{
			//System.out.println("the minimum value is "+n);
			min=false;
		}
		return min;
	}
	public static void main(String[] args) {
		
		ExampleMin ex=new ExampleMin();
		//boolean result = ex.minFunction(3, 9);
		System.out.println("Minimum Value "+ex.minFunction(3, 9));
		//System.out.println("Minimum Value "+ result);
	}

}
