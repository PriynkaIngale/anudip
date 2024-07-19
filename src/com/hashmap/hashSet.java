package com.hashmap;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		HashSet<String> s=new HashSet();
		s.add("Sakshi");
		s.add("Sanyuu");
		s.add("amruta");
		
		Iterator<String> i=s.iterator();
		 while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  
		 s.remove("amruta");
		 System.out.println("updated:"+s);
		 
		 s.clear();
		 System.out.println("new one:"+s);
	}

}
