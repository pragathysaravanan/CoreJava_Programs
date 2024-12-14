package com.day6;

public class ObjectAssignmentExample {
	int a = 10;
	public static void main(String[] args) {
		ObjectAssignmentExample obj = new ObjectAssignmentExample();
		ObjectAssignmentExample obj2 = obj;
		obj.a = 20;
		obj = null;
		System.out.println(obj2.a);
		//hashcode --> genereate unique code for each object
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

	}

}
