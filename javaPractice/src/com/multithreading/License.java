package com.multithreading;

class Medical extends Thread {
	
	public void run() {
		System.out.println("Medical started..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Medical completed..");
		
	}
}
class TestDrive extends Thread{
	
	
	
	public void run() {
		System.out.println("Test drive started..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test drive completed..");
	}
}
class Signature extends Thread{
	public void run() {
		System.out.println("Signature process started..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Signature process completed..");
	}
}
public class License extends Thread{
	public static void main(String[] args) throws InterruptedException {
		Medical medical = new Medical();
		medical.start();
		medical.join(); //main thread will wait until medical thread dies.
		
		TestDrive testDrive = new TestDrive();
		Thread.sleep(1000);
		testDrive.start();
		testDrive.join();   //again main thread will wait until testDrive thread dies.
		
		Signature sign = new Signature();
		Thread.sleep(1000);
		sign.start();
		
}
}

