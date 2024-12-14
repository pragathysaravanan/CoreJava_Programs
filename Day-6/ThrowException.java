package com.day6;


//we can throw exxception manullay using throw keyword
public class ThrowException {
	public static void main(String args[]) {
		
		try {
			throw new ArithmeticException("Can not divide by Zero");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
