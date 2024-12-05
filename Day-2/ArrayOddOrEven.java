package com.day2;

import java.util.Scanner;

public class ArrayOddOrEven {
	public static void main(String[] args) {
	int arr1[] = new int[5];
	int oddCount = 0;
	int evenCount = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values for 5 elements");
	for(int i = 0; i<arr1.length;i++ ) {
		 arr1[i] = sc.nextInt();
	}
	for(int i = 0; i<arr1.length;i++ ) {
		 if(arr1[i]%2==0) {
			 evenCount++;	 
		 }
		 else {
			 oddCount++;
			 }
	}
		 System.out.println("EvenCount " + evenCount);
		 System.out.println("oddCount " + oddCount);
		 
	}
	
	
}
