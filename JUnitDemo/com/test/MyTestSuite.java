package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


	@RunWith(Suite.class)
	@SuiteClasses({CalculatorTest.class,
		FactorialTest.class,
		CalculatorTest1.class})
	public class MyTestSuite {
	

}
