package com.package1;
//what are the method in the class
class object
{
	
}
class GrandParent 
{
	int z;
	public void grandParentMethod()
	{
		System.out.println(z);
	}
}
class Parent extends GrandParent
{
	int i;
	public void parentMethod()
	{
		System.out.println(i);
	}
}
class child extends Parent
{
	int j;
	public void childMethod()
	{
		System.out.println(j);
	}
}

public class feb14ABC {
	

	public static void main(String[] args) {

		Parent p =new Parent();
		p.i=10;
		p.parentMethod();
		
		child c=new child();
		c.i=20;//parent class property
		c.j=20;//child class property
		
		c.childMethod();//child class method
		c.parentMethod();//parent class method
		c.toString();//object class method 
		c.hashCode();//object class method
		
	}

}
