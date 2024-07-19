package com.package1;
//child class refering parent class method using super keyword

class SuperParent
{
	String name;
	public void details()
	{
		name="Parent";
		System.out.println(name);
	}
}
public class feb16SuperDemo1 extends SuperParent {

	String  name;
	public void details()
	{
		super.details();
		name="Child";
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		feb16SuperDemo1 obj=new feb16SuperDemo1();
		obj.details();
	}
}
