package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseSort {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the values for 5 element");
		for(int i = 0; i<arr1.length;i++ ) {
			 arr1[i] = sc.nextInt();
			    //displaying initial value
		} 
		Arrays.sort(arr1);//reverse sorting
		for(int i = arr1.length - 1; i >= 0;i-- ) {
			 System.out.print(" "+  arr1[i]); 

		}
		
	}

}