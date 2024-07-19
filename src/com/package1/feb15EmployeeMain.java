package com.package1;
class Employee
{
	public int salary; //attribute of employee class
	
	public Employee(int sal)//special type of method //constructor
	{
		salary =sal;
	}
	
	public void work()//a method of employee class
	{
		System.out.println("Working as a employee");
	}
	public int getSalary()
	{
		return salary;
	}
}
class Manager extends Employee
{

	public Manager(int sal) 
	{
		super(sal);
	}
	public void work() 
	{
		System.out.println("managing the employee");
	}
	public void addEmployee()
	{
		System.out.println("Adding the new employee");
	}
}
public class feb15EmployeeMain {

	public static void main(String[] args) {

		Employee emp=new Employee(40000); 
		Manager mar=new Manager(70000);
		
		emp.work();
		System.out.println("Eployee salary "+emp.getSalary());
		
		mar.work();
		System.out.println("Manager salary "+emp.getSalary());
		mar.addEmployee();
	}

}
