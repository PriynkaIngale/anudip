//9feb24
package com.classDemo;

public class StaticBlockDemo {

	static int staticVariable;
	
	static
	{
		System.out.println("Ststic initilization block");
		staticVariable=10;
	}
	static void staticMethod()
	{
		System.out.println("from a static method ");
		System.out.println(staticVariable);
	}

}
