package com.classDemo;
class abc
{
	
}
class StudentDetails
{
	int id;
	String name;
	String address;
	String email;
	
	public void ShowData()
	{
		System.out.println("print any think");
	}
}

public class classSample {

	public static void main(String[] args) {
		
		StudentDetails obj1=new StudentDetails();
		obj1.ShowData();
		StudentDetails obj2=new StudentDetails();
		StudentDetails obj3=new StudentDetails();
		StudentDetails obj4;

	}

}

/*Class and object
package com.classdemo;
Java Is Object Orienetd Programming language every thing in java is associated with class and object
Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
Class does not occupy memory.
Class is a group of variables of different data types and a group of methods.
class contain what?
1. data member 
2. member function
3. Constructor
4. nested class

An object is created from a class.
1. An object in Java is a basic unit of Object-Oriented Programming 
and represents real-life entities.
2. Objects are the instances of a class that are created to use the 
attributes and methods of a class.
3. A typical Java program creates many objects, which as you know, 
interact by invoking methods. An object consists of : 

State: It is represented by attributes of an object. 
It also reflects the properties of an object.

Behavior: It is represented by the methods of an object. 
It also reflects the response of an object with other objects.

naming convention for declaration of class variable and methods
give meaningful names to class variable and methods
class ABC
{
	class PQR //nested class
	{
		
	}
}

class StudentDetails// pascle case//,employee,car,college,Teacher, ABC 
{
		//data member//attributes/state/properties/variable
		int studentId;//camel case 4 byte
		String studentName=;   // aprrox char which it includes
		
		float marks;               //4 byte = 8+2=10 bytes
	//method //member Functions
		
		public void store()
		{
			int id=0;   //local variable
			//body of the method
			//Write a logic to store the student Id name address emailid
		}
		public void viewStudentData()
		{
			//body of the method
			//Write a logic to store the student Id name address emailid
		}
		public void editStudentData()
		{
			//body of the method
			//Write a logic to store the student Id name address emailid
		}
		public void viewOneStudentData()
		{
			//body of the method
			//Write a logic to store the student Id name address emailid
			System.out.println("One student record can fetch");
			
		}
		public void marksOfStudent()
		{
			//body of the method
			//Write a logic to store the student Id name address emailid
		}
}

public class ClassSample {

	public static void main(String[] args) {
		StudentDetails obj1=new StudentDetails();// 10 byte object creation
		//new keywork is responsible to occupy memory in java
		//how much memory allocated by object?
		
		obj1.viewOneStudentData();
		System.out.println("Student Id "+ obj1.studentId);
		obj1.marksOfStudent();
		
		StudentDetails obj2=new StudentDetails(); //10 bytes
		
		StudentDetails obj3=new StudentDetails();//10 bytes // object
		StudentDetails obj4; //no memory allocation for object 4 // reference
		
	}

}
*/
