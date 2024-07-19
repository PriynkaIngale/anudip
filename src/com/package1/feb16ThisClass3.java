package com.package1;

public class feb16ThisClass3 {

	void display()
	{
		this.show();
		System.out.println("inside the display method ");
	}
	void show()
	{
		System.out.println("inside the show method");
	}
	public static void main(String[] args) {
		feb16ThisClass3 ts= new feb16ThisClass3();
		ts.display();
	}

}
