package com.march14demo;
import java.util.ArrayList;
import java.util.LinkedList;
// abstract class = instantiate (u can not create the object of abstract class and interface )
//interface
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Interface -> List Queue Set
		List list = new ArrayList();
//		list list2 =new LinkedList<E>();
//		ArrayList list1 = new ArrayList();
		list.add(5);
		list.add("Sakshi");
		list.add('A');
		list.add(true);
		list.add(2.3f);
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("One");	//0 index
		list2.add("two");
		list2.add("three");
		
		System.out.println(list2.size()); 	//output 3
		
		list2.add("four");
		list2.add("five");
		
		System.out.println(list2.size());	//output 5
		
		list2.remove("two");
		System.out.println(list2.size());	//output 4
		System.out.println(list);
	}

}
