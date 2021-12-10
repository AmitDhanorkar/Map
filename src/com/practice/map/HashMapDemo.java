package com.practice.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Ranveer", 800);
		m.put("Vicky", 500);
		m.put("Varun", 200);
		m.put("Ranbeer", 700);
		System.out.println(m); //O/P:- {Ranveer=800, Vicky=500, Varun=200, Ranbeer=700}
		System.out.println(m.put("Ranveer", 900));
		
		Set s = m.keySet();
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"........."+m1.getValue());
		}

	}

}
