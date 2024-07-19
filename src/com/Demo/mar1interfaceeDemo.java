package com.Demo;
//interfaces, another way of implementing abstraction in java.
//all the interfaces in java are by default abstract  
//by default all the methods in the interfaces are abstract
//interface should have all abstract method 
//All the methods in interface are pure abstract method no concrete method till java 1.8 version
//after 1.8 you can add concrete method in the interface but they must be default and static. 
//the abstract in the interface cannot be private 
//by default the filed in the interfaces are public static and final 
//you cannot create object of the interface
//Cannot create a object of a Interface
//we cannot create iib and sib in interface 
interface InterfaceSample
{
	int i=0;
	void display();
	void show();
}

interface Sample
{
	void xyz();
	
}
class ABC implements InterfaceSample , Sample
{
	@Override
	public void display() {
		
//		System.out.println(i++);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}
	
}
public class mar1interfaceeDemo {

	public static void main(String[] args) {
		
		//InterfaceSample i=new InterfaceSample(); 
		
	}
}
