package com.day7;
class ThreadOne extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		for ( int i = 1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " is Running");
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
public class MultiThreading  {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
//		System.out.println(t);
//		System.out.println(t.getPriority());
//		t.setPriority(9);
//		t.setName("Hesho");
//		System.out.println(t);
//		System.out.println(t.getName());
//		System.out.println(t.getState());
//		System.out.println(t.isDaemon());
//		System.out.println(t.isAlive());
		
		ThreadOne obj = new ThreadOne();
		obj.setName("T1");
		obj.start();
		
		ThreadOne obj2 = new ThreadOne();
		obj2.setName("T2");
		obj2.start();
		
		System.out.println("Main ending");
		
	}

}
