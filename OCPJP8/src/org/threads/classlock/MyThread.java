package org.threads.classlock;

public class MyThread extends Thread {


	public MyThread( String name) {
		super(name);
				
	}

	@Override
	public void run() {
		Resource.m1();

	}

}
