package com.day7;
import java.lang.String;
import java.lang.Math;

//Static property import form the class
import static java.lang.Math.PI;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class StaticBlock {
	static int a = 10;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(PI); //final variable
		int a = parseInt("66");
		out.println(a);
		out.println("Welcome");
		
	

	}

}
