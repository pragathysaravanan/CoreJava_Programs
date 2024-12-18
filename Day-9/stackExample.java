package com.day9;

import java.util.Stack;

public class stackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println("Add 4 element using push method: ");
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		
		System.out.println("remove 1 element using pop: ");
		stack.pop();
		System.out.println(stack);
		
		System.out.println("Peek display the top element: ");
		
		System.out.println(stack.peek());
		
		
		

	}

}
