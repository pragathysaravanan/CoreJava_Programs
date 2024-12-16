package com.day7;
//implemeting Runnable interface
class MyThread2 implements Runnable{
	public void run() {
		
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
public class ThreadExampleFour {
	public static void main(String[] args) {
		
	Thread t = new Thread(new MyThread2());
	t.setName("T1");
	t.start();
}
}
