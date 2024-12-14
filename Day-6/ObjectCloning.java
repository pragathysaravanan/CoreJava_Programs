package com.day6;
//Object Clone -->create a 
public class ObjectCloning implements Cloneable {
	int a = 10;
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloning obj = new ObjectCloning();
		ObjectCloning obj2 = (ObjectCloning) obj.clone();
		//obj = null;
		obj2.a = 40;
		System.out.println(obj.a);
		//hashcode --> genereate unique code for each object
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

	}

}
