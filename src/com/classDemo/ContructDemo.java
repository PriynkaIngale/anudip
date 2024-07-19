//9feb24
package com.classDemo;

public class ContructDemo {

	public ContructDemo()
	{
		System.out.println("contructor");
	}
	public void show()
	{
		System.out.println("normal method");
	}
	public static void main(String[] args) {

		ContructDemo cs =new ContructDemo();
		//ContructDemo cs;
		//cs.ContructDemo(); no need to call the contructor 
		cs.show();
	}

}
