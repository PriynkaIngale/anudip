package com.innerdemo;
//Access Outer Class From Inner Class
class Outer
{
	int x=10;
	class Inner //nested class //inner class
	{
		int y=20;
		public int innerMathod()
		{
			return x;
		}
	}
}
public class feb23AccessOuterMain {

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		System.out.println(in.innerMathod());
		
	}

}
