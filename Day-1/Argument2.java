package com.calculator;
//Command Line Arguments
public class Argument2{
	public static void main(String args[]){
	if(args.length ==2){
	System.out.println("Performing Addition");
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int sum = a +b;
	System.out.println("Addition of two number "+sum);	
	}
	else{
	System.out.println("error");
	}
}
}