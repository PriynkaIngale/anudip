package com.classDemo;
class Sample
{
	int x=5;
}
public class SmapleFirst {
	int x=10;  //instance variable
	
	public static void main(String[] args) {
		SmapleFirst sf1=new SmapleFirst();
		sf1.x=40;
		//System.out.println(sf1.x);
		
		SmapleFirst sf2=new SmapleFirst();
		//System.out.println(sf2.x);
		
		Sample sm = new Sample();
		
		System.out.println(sf1.x);
		System.out.println(sf2.x);
		System.out.println(sm.x);
		
	}

}
