package com.package1;
//Child class calling Parent class constructor using super keyword
class superclass
{
	String name;
	public superclass(String n1)
	{
		name=n1;
	}
}
public class feb16SuperDemo2 extends superclass{

	String name;
	public feb16SuperDemo2(String n1 , String n2)
	{
		super(n1);
		this.name=n2;
	}
	public void details()
	{
		System.out.println(super.name + " "+name);
	}
	public static void main(String[] args) {

		feb16SuperDemo2 obj = new feb16SuperDemo2("Sakshi", "Fuke");
		obj.details();
	}

}
