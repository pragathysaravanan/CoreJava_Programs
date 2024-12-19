package com.day10;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.offerFirst(10);
		deque.offerFirst(20);
		deque.offerLast(null);
		deque.offerLast(null);
		deque.offerFirst(30);
		deque.offerFirst(40);
		
		System.out.println(deque);
		
		//deque.poll();
		deque.pollFirst();
		deque.pollLast();
	
		System.out.println(deque);
		

	}

}
