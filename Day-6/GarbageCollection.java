package com.day6;

// Java grabage collection
public class GarbageCollection {
	static int count = 0;

	GarbageCollection() {
		count++;
		System.out.println(count);
	}

	@Override
	protected void finalize() throws Throwable {
		count--;
		System.out.println(count);
	}

	public static void main(String[] args) {
		GarbageCollection obj1 = new GarbageCollection();
		GarbageCollection obj2 = new GarbageCollection();
		obj1 = null;   //unreffernced
		System.gc();	//rereffencing
		obj2 = null;
		Runtime.getRuntime().gc(); 

	}

}
