package org.threads.deadlock2;

public class DeadlockTest {

	public static void main(String[] args) {
		Resource resource=new Resource();
		MyThreadA a =new  MyThreadA(resource);
		MyThreadB b =new  MyThreadB(resource);
		a.start();
		b.start();
		
	}
	
	
}
