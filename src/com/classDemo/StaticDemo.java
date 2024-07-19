package com.classDemo;

public class StaticDemo {

	static int a=0;//static variable
	int b;		//instance variable
	static public void display()
	{
		int c=0; 	//local variable which is defining under the method but out side the main function
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {

		StaticDemo sd= new StaticDemo();
		sd.display();
		StaticDemo sd1= new StaticDemo();
		sd1.display();
		StaticDemo sd2= new StaticDemo();
		sd2.display(); 
	}

}
