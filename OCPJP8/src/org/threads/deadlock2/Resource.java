package org.threads.deadlock2;

public class Resource {

	
	public void m1() throws InterruptedException {
		
		synchronized (String.class) {
			System.out.println("taken String class lock");
		
		Thread.sleep(2000);
		synchronized (Integer.class) {
			System.out.println("taken Integer class lock");
		}
		}
		
	}
	
	
	
public void m2() throws InterruptedException {
		
		synchronized (Integer.class) {
			System.out.println("taken Integer class lock");
		
		Thread.sleep(2000);
		synchronized (String.class) {
			System.out.println("taken String class lock");
		}
		
		}
		
	}
}
