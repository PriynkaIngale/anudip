package com.package1;

class Vehicle
{
	String brand ="Maruti";//vehicle atribute
	public void honk()		//vehicle method
	{
		System.out.println("beep beep !.......");
	}
}
public class Feb15Car extends Vehicle {

	String modelName="Maruti800";//car atrribute
	
	public static void main(String[] args) {

		Feb15Car myCar=new Feb15Car();
		
		myCar.honk();
		
		System.out.println(myCar.brand+""+myCar.modelName);
		
	}

}
