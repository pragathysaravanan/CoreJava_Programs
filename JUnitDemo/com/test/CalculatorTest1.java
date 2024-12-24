package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.day13.Calculator;
@RunWith(Parameterized.class)
public class CalculatorTest1 {
	
	private int input1;
	private int input2;
	private int expected1;
	private int expected2;
	
	
	public CalculatorTest1(int input1, int input2, int expected1, int expected2) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expected1 = expected1;
		this.expected2 = expected2;
	}

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
	
//	@Before   //used for before testcase -->initalizing purpose
//	public void before() {
//		System.out.println("Before");
//		input1 = 10;
//		input2 = 20;
//	}
//	@After //used for after testcase -->initalizing purpose
//	public void after() {
//		System.out.println("After");
//		input1 = 0;
//		input2 = 0;
//	}
	@Test
	public void testAddition() {

		System.out.println("Test Addition");
		Calculator calc = new Calculator();
		int actual = calc.addition(input1, input2);
		int expected = input1 + input2;
		assertEquals(expected1, actual);    //static method from Assert class
	}

	@Test
	public void testSubtraction() {
		System.out.println("Test Subtraction");
		Calculator calc = new Calculator();
		int actual = calc.subtraction(input1, input2);
		int expected = input1 - input2;
		assertEquals(expected2, actual);
	}
	
	@Parameters
	public static Collection calculatorNumber() {
		return Arrays.asList (new Object [] [] {
			{5, 3, 8, 2},
			{2, 7 ,9, -5},
			{15, 30, 45, -15},
			{200, 70 ,270, 130}
		});
	}

}
