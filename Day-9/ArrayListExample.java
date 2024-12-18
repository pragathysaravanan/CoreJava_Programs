package com.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//example for arrayList
public class ArrayListExample {

	public static void main(String[] args) {
		// ArrayList arrlist = new ArrayList(); not recommended
		List<Integer> list = new ArrayList<>(); // DMD //generic <Integer>-->store only interger obj
//<object>--> allow all type of object
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(10);
		list.add(23);
		list.add(37);

		System.out.println(list);

		System.out.print("\nget the element at specfic Index: ");// print list
		System.out.println(list.get(2)); // particular inder

		System.out.print("\nAdd element at specfic index: ");
		list.add(2, 60); // add element at specfic element
		System.out.println(list);

		System.out.print("\nRemove using remove : ");
		list.remove(0);
		System.out.println(list);

		System.out.print("\nReplace element using set: ");
		list.set(0, 50);
		System.out.print(list);

		System.out.print("\nTO check whether the element is present or not[contains]: ");
		System.out.println(list.contains(60));

		System.out.print("\nno. of elements: ");
		System.out.println(list.size());

		System.out.print("\ncheck empty: ");
		System.out.println(list.isEmpty());

		// for loop
		System.out.println("\nUsing For loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		//Using for-each
		System.out.println("\nWay 2 using For Each");
		for(Object i : list) {
			System.out.println(i);
		}
		
		System.out.println("\nWay 3: using Iterator");
		Iterator<Integer> it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nPrinting only the Even numbers");
		Iterator<Integer> it1 = list.iterator();
		while(it1.hasNext()) {
			Integer inti = it1.next();
			if(inti % 2 == 1) {
				it1.remove();
			}
		
		}
		System.out.println(list);
	}

}
