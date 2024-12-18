package com.day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>(3,2);
		vec.add(10);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(30);
		vec.add(40);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(12);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(17);
		vec.add(16);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}
