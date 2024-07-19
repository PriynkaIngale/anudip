package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashMapMethod {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();//Creating HashMap 		h.put(1,"Sakshi");
		h.put(1, "Sakshi");
		h.put(2, "Sanyukta");
		h.put(3, "Amruta");
		h.put(4, "Gunjan");
		h.put(5, "Achal");
		h.put(6, "Aadu");
		h.put(null, "samiksha");
		
		System.out.println("after invoking put(): ");
		for(Map.Entry m:h.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		h.putIfAbsent(7, "Sakshi");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Map.Entry m:h.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	    
	     h.remove(3, "Amruta");
	     System.out.println("updated : "+h);
	     
	     h.replace(4, "Gunjan","gunjuu");
	     System.out.println("new updated : "+h);
	}

}
