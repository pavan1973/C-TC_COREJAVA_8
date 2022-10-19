package com.Maps;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "mango");
		m.put(2, "apple");
		m.put(3, "orange");
		m.put(null, null);
		
		for (String i : m.values()) {
			  System.out.println(i);
		}
		

	}

}
