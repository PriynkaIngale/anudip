package com.package1;
class Student
{
	int rollNo; //instance variable
	String name;
	float fee;
	
	Student(int rollNo , String name , float fee)//parameter constructor
	{
		this.rollNo=rollNo;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollNo + " " + name + " " + fee);
	}
}
public class feb15TestClass {

	public static void main(String[] args) {

		Student s1=new Student(1, "Sakshi" ,10000 );
		Student s2=new Student(2, "Fuke" ,20000 );
		s1.display();
		s2.display();
	}

}
