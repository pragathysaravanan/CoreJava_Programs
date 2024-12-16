package com.day7;

class Thread1 extends Thread {
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

public class ThreadExampleThree {
	public static void main(String[] args) {
		// Thread t = Thread.currentThread();

		Thread1 obj = new Thread1();
		obj.setName("T1");
		obj.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
	
		}
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End main");
	}
}
	

