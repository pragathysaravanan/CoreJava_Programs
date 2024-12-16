package com.day7;

class ThreadOnes extends Thread {
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is Running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

public class ThreadExampleTwo {
	public static void main(String[] args) {
		// Thread t = Thread.currentThread();

		ThreadOnes obj = new ThreadOnes();
		obj.setName("T1");
		obj.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		try {
			obj.suspend();
		} catch (UnsupportedOperationException e) {
		}
		System.out.println(obj.getState());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		try {
			obj.resume();
		} catch (UnsupportedOperationException e) {

		}

		System.out.println("Main ending");

	}

}
