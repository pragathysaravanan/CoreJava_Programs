package com.day8;

public class StringBufferExample {

	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Prgathy");
	StringBuffer sb1 = new StringBuffer("Saravanan");
	System.out.println(sb.capacity());
	System.out.println(sb.hashCode());
	System.out.println(sb1.hashCode());
	System.out.println(sb.append(" saravanan"));
	
	
	

	}

}
