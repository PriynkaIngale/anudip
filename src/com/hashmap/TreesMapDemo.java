package com.hashmap;

import java.util.TreeMap;

public class TreesMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> lm=new TreeMap<Integer,String>();
		
		lm.put(1, "kalpesh");
		lm.put(5, "kalpesh");
        lm.put(14, "ram");
        lm.put(1, "shaym");
        lm.put(2, null);
        lm.put(10, null);
//        lm.put(null, null);
    
//        lm.put(7, null);
//        lm.put(3, "sita");
//        lm.put(8, null);
//        lm.put(null, null);
//        lm.put(null, null);
//        lm.put(11, "sita");
        System.out.println(lm);
	}

}
