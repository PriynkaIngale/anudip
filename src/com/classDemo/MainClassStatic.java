//9feb24
package com.classDemo;

class StaticBlock {

	static int staticVariable;
	
	static
	{
/*2nd*/ System.out.println("Static initilization block(SIB) Static Component");
		staticVariable=10;
	}
	static void staticMethod()
	{
		System.out.println("from a static method ");	//3rd
		System.out.println(staticVariable);				//4th
	}

}
public class MainClassStatic {
static
{
	System.out.println("main class SIB");		//1st
}
	public static void main(String[] args) {
		
		StaticBlock.staticVariable=20;
		StaticBlock.staticMethod();
	}

}
/*static component run first but preference goes to main class after printing main class static component the another static 
  component run after that print msg from staticmethod and after that print the updated value of staticVariable
*/
