package com.day6;

public class ExceptionHandling {
	static int a;
	public static void main(String[] args) {

		System.out.println("Before Exception");
		try {
			 a = 10/5;
			int b = Integer.parseInt("123");
			int arr[] = {10,20,30};
			int c = arr[1];
			//int arr1[] = new int[-4];
				
		}
		catch(ArithmeticException e) {
			System.out.println("Error Found 1: " + e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("Error Found 2: " + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Found 3: " + e.getMessage());
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Error Found 4: " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error found: " + e.getMessage());
		}
		/*catch(Error e) {
			
		}
		catch(Throwable e) {
			
		}*/
		finally{ 
			System.out.println("Exception handling Done");
		}
		System.out.println("After Exception");
		
		ExceptionHandling obj = new ExceptionHandling();
		System.out.println(ExceptionHandling.a);
		

	}

}
