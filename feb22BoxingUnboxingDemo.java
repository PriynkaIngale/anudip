package com.javademo;

public class feb22BoxingUnboxingDemo {

	public static void main(String[] args) {
		//boxing
		byte b=10; //primitive data type
		Byte B=new Byte(b);
		
		short a=10;
		Short s=new Short(a);
		
		//Auto-Boxing
		byte b1=10;//primitive data type
		Byte B1=b1;//wrapping primitive type data inti short object
		
		//Unboxing
		Byte B2 =new Byte((byte)10);//object type 
		byte b2=B2.byteValue();//Unwrapped Byte Object to byte data
		
		//Auto-unboxing
		Byte B3 =new Byte((byte)10);//object type 
		byte b3=B3;
	}

}
