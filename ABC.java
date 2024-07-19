package com.demo;

public class ABC {

public int a;//default access specifire 
     //private //public 
	
	public int getA() {
	return a;
}

	public void setA(int a) {
		this.a = a;
}

	public static void main(String[] args) {
		
		
	}

}

class PQR
{
	ABC a1 = new ABC();
	void display()
	{
		System.out.println(a1.a);
	}
}
class MNC extends ABC
{
	ABC a1 = new ABC();
	void display()
	{
		System.out.println(a1.a);
	}
}