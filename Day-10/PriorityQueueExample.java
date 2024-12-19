package com.day10;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pque = new PriorityQueue<>();
		pque.offer(20);
		pque.offer(50);
		pque.offer(45);
		pque.offer(10);
		pque.offer(30);
		System.out.println(pque);
		
		pque.poll();
		System.out.println(pque);
		
		
		// highestnumber prioritty for max number
		System.out.println();
		System.out.println("Highest priority for the Max number --> give collections.reverseOrder' ");
		PriorityQueue<Integer> pque1 = new PriorityQueue<>(Collections.reverseOrder());
		pque1.offer(20);
		pque1.offer(50);
		pque1.offer(45);
		pque1.offer(10);
		pque1.offer(30);
		System.out.println(pque1);
		
		pque1.poll();
		System.out.println(pque1);
		

	}

}
