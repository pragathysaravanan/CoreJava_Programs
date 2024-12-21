package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Employee{
	int id;
	String ename;
	int salary;
	
	public Employee(int id, String ename, int salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + "]";
	}
}

public class Java8AdditionalPractice {

	public static void main(String[] args) {
	//1. Given a list of integers, find out all the even numbers that exist in the list using
//Stream functions
		List<Integer> number = Arrays.asList(1,122,6,33,15,28,17,33,122,45,6);
		System.out.println("Elements of List are " + number);
		List<Integer> list = number.stream().filter(x -> x% 2 == 0 ).collect(Collectors.toList());
		System.out.println("Evennumbers: " + list);
		//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		
		System.out.println("\nNumbers starts with 1");
		List<Integer> list1 = number.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList());
		System.out.println(list1);
		
		//3. How to find duplicate elements in a given integers list in java using Stream functions?
		System.out.println("\nTo find Duplicate : set");
		Set<Integer> set = number.stream().filter(x-> number.indexOf(x) != number.lastIndexOf(x)).collect(Collectors.toSet());
		System.out.println(set);
		// another way
		System.out.println("\nTo find Duplicate:  List");
		List<Integer> list2 = number.stream().filter(x-> number.indexOf(x) != number.lastIndexOf(x)).distinct().collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println("\nTo find Duplicates count:");
		long count = number.stream().filter(x-> number.indexOf(x) != number.lastIndexOf(x)).distinct().count();
		System.out.println(count);
		
		//4. Given the list of integers, find the first element of the list using Stream functions?
		System.out.println("\nTo find first element: ");
		int firstElement = number.stream().findFirst().get();
		System.out.println(firstElement);
		
		//Given a list of integers, find the total number of elements present in the list using Stream
		//functions?
		System.out.println("\nTo find count of list: ");
		long countAll = number.stream().count();
		System.out.println(countAll);
		
		
		//Given a list of integers, find the maximum value element present in it using Stream
		//functions?
		System.out.println("\nTo find max of list: 1 Way ");
		int maxNumber = number.stream().max(Integer :: compare).get();
		System.out.println(maxNumber);
		System.out.println("\nTo find max of list: 2 Way ");
		int maxNumber1 = number.stream().max((x, y) -> x - y ).get();
		System.out.println(maxNumber1);
		
		//7. Sort the Employee object using salary
		System.out.println("\nEmployee Salary sorted");
		List<Employee> empList = Arrays.asList(new Employee(1,"Pragathy",2000), new Employee(1,"shobi",1000), new Employee (3,"Hema",3000));
		List<Employee> sortList = empList.stream().sorted(( x , y ) -> x.salary - y.salary ).collect(Collectors.toList());
		System.out.println(sortList);
		
		//9. Given a list of integers, sort all the values present in it in descending order using Stream
		//functions?
		
		System.out.println("\nDesc order List");
		List<Integer> int1 = number.stream().sorted((x,y) -> y - x ).collect(Collectors.toList());
		System.out.println(int1);
		
		//8. Given a list of integers, sort all the values present in it using Stream functions
		System.out.println("\nSorted List");
		List<Integer> int2 = number.stream().sorted().collect(Collectors.toList());
		System.out.println(int2);
		
		//10. Given an integer array nums, return true if any value appears at least twice in the array,
		//and return false if every element is distinct.
		System.out.println("\nReturn true if there is duplicate: Way1");
		boolean flag = number.stream().filter(x -> number.indexOf(x) != number.lastIndexOf(x)).distinct().count() > 0 ? true : false ;
		System.out.println(flag);
		
		
		System.out.println("\nReturn true if there is duplicate : Way2");
		set.clear();
		boolean flag1 = number.stream().filter(x -> set.add(x)).count() > 0 ? true : false ;
		System.out.println(flag1);
		
		//11. Java 8 program to find factorial of given list of integer values
		System.out.println("\nFactorial");
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> factlist =list3.stream().map(x -> {
			int fact = 1 ; for(int i =1;i<= x; i++)
			fact =fact * i; return fact;  }).collect(Collectors.toList());
		System.out.println(factlist);
		
		//12. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
		System.out.println("\nArray to stream");
		int arr[] = {3, 5, 2, 1, 7};
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		
		//13. Convert a List of String into upper case using stream
		 List<String> str = Arrays.asList("Apple","Orange","Banana");
		 List<String> upperList = str.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		 System.out.println(upperList);
		 
		//14. Convert a List of String into a Map key and it's length as Map Value using Java 8 Stream
		 System.out.println("\n Map");
		 Map<String, Integer> map = str.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		 System.out.println(map);
		 
		//15. flatMap
		 System.out.println("\nFlat map");
		 List<Integer> even =Arrays.asList(10,20,30,40);
		 List<Integer> odd =Arrays.asList(15,25,35,45);
		 List<List<Integer>> evenOdd = Arrays.asList(even ,odd);
		 System.out.print("Before Flattering: ");
		 System.out.println(evenOdd);
		 List<Integer> ref =evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		 System.out.println("After Flattering: " + ref);
		 
		//16. Java 8 : Consumer
		System.out.println("\nUsing consumer");
		 Consumer<String> consumer = str1 -> System.out.println(str); 
		 str.forEach(consumer);
		 
		//17. Java 8 : Predicate
		 System.out.println("\nUsing ");
//		Predicate<String> predicate = str2 -> str.contains("p");
//		 str.forEach(consumer);
//		 str.stream().filter(predicate).forEach(System.out::println);
//
//		 Predicate<Integer> evenPredicate = n -> n % 2 == 0;
//		 list.stream().filter(evenPredicate).forEach(System.out::println);
				 
		 
		 Predicate<String> predicate = str1 -> str1.contains("p");
		 str.stream().filter(predicate).forEach(System.out::println);

		 Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		 list.stream().filter(evenPredicate).forEach(System.out::println);
		 
		 
		 
		 
		 Function<String, Character> function = str1 -> str1.charAt(0);
		 str.stream().map(function).forEach(System.out::println);

		 Function<Integer, String> function1 = n -> {
		 if (n % 2 == 0)
		 return "Even";
		 else

		 return "Odd";
		 };
		 list.stream().map(function1).forEach(System.out::println);
		 
		 
		 
		 Function<String, Character> function11 = str1 -> str1.charAt(0);
		 str.stream().map(function11).forEach(System.out::println);

		 Function<Integer, String> function111 = n -> { 
		 if (n % 2 == 0)
		 return "Even";
		 else

		 return "Odd";
		 };
		 list.stream().map(function111).forEach(System.out::println);
		 
	}
	
	//

}
