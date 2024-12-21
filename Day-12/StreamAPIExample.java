package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,31,4,53,16,28);
		//fileter -->intermediate
		//forEach--> termination
		//System.out :: println  --> refering println to system.in
		System.out.println("Using ForEach method");
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out :: println);
		
		System.out.println("Using count() method");
		long count = numbers.stream().filter(x -> x % 2 == 0).count();
		System.out.println(count);
		
		System.out.println("Using Collector()");
		Set<Integer> evenNumber = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
		System.out.println(evenNumber);
		
		System.out.println("Multiple of even using map()");
		Set<Integer> multipleOfEven = numbers.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toSet());
		System.out.println(multipleOfEven);
		
		System.out.println("Multiple of even using map() and sort that using sorted() ");
		Set<Integer> sortmultipleOfEven = numbers.stream().filter(x -> x % 2 == 0).map(x -> x * 10).sorted().collect(Collectors.toSet());
		System.out.println(sortmultipleOfEven);

	}

}
