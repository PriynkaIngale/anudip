package com.inheritanceDemo;
class ABC				//parent
{
	public int z;
}

class PQR
{
	void display()
	{
		ABC a1=new ABC();
		System.out.println(a1.z);
	}
}
class MNC extends ABC	 //child
{
	void show()
	{
		ABC a1=new ABC();
		System.out.println(a1.z);
	}
}
public class feb19MainDemo {

	public int a;
	public static void main(String[] args) {

		 
	}

}
