package com.day2;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	int arr[] = {10, 20, 30, 40, 50};
	System.out.println("The length of Array: " + arr.length);//length -->pre-defined variable

	int arr1[] = new int[5];
	Scanner sc= new Scanner(System.in);
	int sum =0;
	int i;
	
	for(i = 0; i<arr1.length;i++ ) {
		System.out.println(arr1[i]);    //displaying initial value
	}
	System.out.println("Enetr "+arr1.length+" Values" ); // getting 5 values from user
	for(i = 0; i<arr1.length;i++ ) {
		 arr1[i] = sc.nextInt();
	}
	System.out.println("Values are: " ); // getting 5 values from user
	for(i = 0; i<arr1.length;i++ ) {
		System.out.println(arr1[i]);
		sum+=arr[i];
	}
	System.out.println("The sum of all elements are: " + sum);
	}
}
