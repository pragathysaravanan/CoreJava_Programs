package com.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// hashSet example
public class SetExample {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		//Adding elements
		set.add(10);
		set.add(12);
		set.add(14);
		set.add(17);
		set.add(null);
		
		System.out.println("To print the set element"  + set);
		System.out.println("To check the set is empty: " + set.isEmpty());
		System.out.println("To check is value prenset in or not (contains): " + set.contains(12));
		
		//for each 
		for(Integer i : set) {
			System.out.println(i);
		}
		
		//using Iterator
		System.out.println("Using Iterator");
		Iterator<Integer> it =set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
