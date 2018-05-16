package org.threads.deadlock2;

public class MyThreadA extends Thread{

	Resource r;
	@Override
	public void run() {
	 try {
		r.m1();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public MyThreadA(Resource r) {
		super();
		this.r = r;
	}
}
