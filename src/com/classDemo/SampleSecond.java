package com.classDemo;

class SampleDemo
{
	int x=5;
	
	public void SampleDemoMethod()
	{
		System.out.println("The Value of x foe SampleDemoMethod "+x);
	}
}
/*3*/public class SampleSecond { //class declaratio
	
/*4*/	int x=10; //variable declaration and initization

/*6*/	public void method1() //method defination
	{
/*7*/		System.out.println("Value of x for method 1 "+ x);//logic in a method
	}
     	public void method2() //method defination
     	{
     		System.out.println("Value of x for method 2 "+ x);//logic in a method
     	}
/*1*/public static void main(String[] args) {  //staring point of execution

/*2*/	SampleSecond ss1= new SampleSecond();//object get created and memory allocated to ss1 object 
/*5*/	ss1.method1();   //calling method
		ss1.method2();

		SampleDemo sm=new SampleDemo();
		sm.SampleDemoMethod();
}

}
