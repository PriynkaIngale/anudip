package com.classDemo;

class A
{
	static int nonStaticVariable;
	static int staticVariable;
	
	static void staticMethod()
	{
		System.out.println("static variable: "+staticVariable); //1  //6
		//System.out.println(nonStaticVariable);//non static cant be accessible into static method
	}
	void nonStaticMethod()
	{
		System.out.println("Static variable= "+staticVariable);			//4
		System.out.println("nonStatic Variable= "+nonStaticVariable);	//5
	}
}
public class Feb12MainInstanceClass {
	public static void main(String[] args) {
		A.staticVariable=10;
		//A.nonStaticVariable=10;
		A.staticMethod();
		//A.nonStaticMethod();
		
		A a1=new A();
		A a2=new A();
		
		System.out.println("a1 nonStatic variable: "+a1.nonStaticVariable); //2
		System.out.println("a1 static variable: "+a1.staticVariable);		//3
		a1.nonStaticMethod();
		a1.staticMethod();
		
		System.out.println("a2 Static Variable"+a2.staticVariable);	//7
		a1.staticVariable=20;
		System.out.println(a2.staticVariable);	//8
		
	}

}
