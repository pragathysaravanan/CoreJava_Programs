package com.day11;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner join = new StringJoiner(",");
		join.add("Pragathy");
		join.add("Have");
		join.add("Good day");

		String result = join.toString();
		System.out.println(result);
		
		StringJoiner join1 = new StringJoiner(",","{","]");
		join1.add("Pragathy");
		join1.add("Have");
		join1.add("Good day");

		String result1 = join1.toString();
		System.out.println(result1);
	}

}
