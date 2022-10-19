package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set mySet = new LinkedHashSet();
		mySet.add(new Float(33.35f));
		mySet.add(new Integer(100));
		mySet.add(new Float(33.35f));
		mySet.add(new Float(55.11f));
		
		Iterator i1 =  mySet.iterator();
		while(i1.hasNext())
		{
		 System.out.println(i1.next());
		}
		}

	}


