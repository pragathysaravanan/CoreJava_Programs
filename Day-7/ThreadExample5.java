package com.day7;
class MyThread4 implements Runnable{
	public void run() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * 2" + " = " + (i*2) );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
class MyThread5 extends Thread{
	public void run() {
		
		for (int i = 1; i <= 10; i++) {
			System.err.println(i + " * 5" + " = " + (i*5));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
	}

}

public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		Thread obj = new Thread(new MyThread4());
		System.out.println("Two table");
		obj.start();
		
		
		obj.join();
		System.out.println();
		System.out.println("Five Table\n");
		
		MyThread5 obj2 = new MyThread5();
		obj2.start();
		

	}

}
