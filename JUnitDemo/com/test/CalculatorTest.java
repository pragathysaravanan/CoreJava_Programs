package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.AfterClass;
import org.junit.Test;

import com.day13.Calculator;

public class CalculatorTest {
	
	int input1;
	int input2;
	static Calculator calc ;
	@BeforeClass
	public  static void beforeClass() {
		System.out.println("Before Class");
		calc = new Calculator();
	}
	
	@AfterClass
	public static  void AfterClass() {
		System.out.println("After Class");
		calc = null;
	}
	
	@Before   //used for before testcase -->initalizing purpose
	public void brfore() {
		System.out.println("Before");
		input1 = 10;
		input2 = 20;
	}
	@After //used for after testcase -->initalizing purpose
	public void after() {
		System.out.println("After");
		input1 = 0;
		input2 = 0;
	}
	@Test
	public void testAddition() {

		System.out.println("Test Addition");
		Calculator calc = new Calculator();
		int actual = calc.addition(input1, input2);
		int expected = input1 + input2;
		assertEquals(expected, actual);    //static method from Assert class
	}

	@Test
	public void testSubtraction() {
		System.out.println("Test Subtraction");
		Calculator calc = new Calculator();
		int actual = calc.subtraction(input1, input2);
		int expected = input1 - input2;
		assertEquals(expected, actual);
	}

}
