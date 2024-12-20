package com.day11;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,4,2,6,4);
		numbers.forEach(number -> System.out.println(number));   //number-> lamdba

	}

}
