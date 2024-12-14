package com.day6;

public class ExceptionBasic {
	int a = 10;
	public static void main(String[] args) {
		System.out.println("Before Exception");
		//Arithmetic Eception
		//int a = 10/0;	
		
		//ArrayIndexOutOfBound
		/*
		int arr[] = {10,20,30};
		System.out.println(arr[5]); 
		 */
		
		//NegativeArraySizeException
		
		// int arr[] = new int[-5];
		//System.out.println("After Exception");
		
		//NullPointer Exception
		//ExceptionBasic obj = null;
		//System.out.println(obj.a);
		
		//numberFormatException 
		int a = Integer.parseInt("Abx");

	}

}
