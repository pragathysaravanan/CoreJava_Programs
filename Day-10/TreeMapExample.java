package com.day10;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
		map.put(106, "Pragathy");
		map.put(3, "Hema");
		map.put(102, "Shobana");
		//map.put(101, "Valan");   ->it will replace the old one
		map.put(10, "Joe");
		map.put(105, "Merlz");
		System.out.println(map);
		
		//Will remove only that particular key value
		map.remove(10);
		System.out.println("One element removed: " + map);
		
		System.out.println(map.isEmpty());  //false
		System.out.println(map.containsKey(102));  //true
		System.out.println(map.size());  //retirn the size of the key
		
		
		//iteration Way 1
		System.out.println("\nUsing ForEach");
		Set<Integer> set =map.keySet();
		System.out.println("Keys are: " + set);  //it will return the key elements only
		for(Integer i : set) {
			System.out.println(i + " = " + map.get(i) );
		}
		
		
		//Way 2 Iterator --> assign it with 
		
		System.out.println("\nUsing Iterartor");
		Iterator<Integer> it =set.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i + " = " + map.get(i));
		
		
	}
		 Set<Entry<Integer, String>> entries	=map.entrySet();
		  System.out.println(entries);
		  
		  for(Entry<Integer, String> entry : entries) {
			  System.out.println(entry.getKey() + " = " + entry.getValue());
		  }
		  
		  
		  Iterator<Entry<Integer, String>> it1 = entries.iterator();
		  while(it1.hasNext()) {
			  Entry<Integer, String> entry = it1.next();
			  System.out.println(entry.getKey()+" = "+entry.getValue());
		  }
		

	}

}
