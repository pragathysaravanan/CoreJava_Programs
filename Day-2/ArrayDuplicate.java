package com.day2;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int duplicate = 0;
		int arr1[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for 5 elements ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr1.length && arr1[i] != -1; j++) {
				if (arr1[i] == arr1[j]) {
					count++;
					arr1[j] = -1;
				}

			}

			if (count > 0) {
				duplicate++;
			}
		}
		System.out.println("The Duplicate value Count is: " + duplicate);

	}

}
