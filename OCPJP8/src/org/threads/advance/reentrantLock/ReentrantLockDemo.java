package org.threads.advance.reentrantLock;

public class ReentrantLockDemo {

	public static void main(String[] args) {
	
		Resource resource=new Resource();
		
		Player player1=new Player(resource, "Viren");
		Player player2=new Player(resource, "Viru");
		
		player1.start();
		player2.start();
		
	}
}
