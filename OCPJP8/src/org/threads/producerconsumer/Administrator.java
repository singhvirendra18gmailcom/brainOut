package org.threads.producerconsumer;

public class Administrator {

	public static void main(String[] args) {
	
		System.out.println("Please start processing through register");
		Register register=new Register();
		
		Peon peon=new Peon(register, "peon");
		peon.setName("peon");
		peon.start();
		
		Clerk clerk=new Clerk(register, "clerk");
		clerk.setName("clerk");
		clerk.start();
		
		try {
			clerk.join();
			peon.join();
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " is not joined with " + clerk.getName() + "or" + peon.getId());
		}
		
		
		
		System.out.println("Please stop processing through register");
	}
}
