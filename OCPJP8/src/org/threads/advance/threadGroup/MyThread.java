package org.threads.advance.threadGroup;

public class MyThread extends Thread{
	
	public MyThread(ThreadGroup g, String name) {
		super(g, name);
	}
	
	@Override
	public void run() {
		System.out.println("In My thread");
	}

}
