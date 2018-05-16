package org.threads.deadlock2;

public class MyThreadB extends Thread{

	Resource r;

	public MyThreadB(Resource r) {
		super();
		this.r = r;
	}
	

	@Override
	public void run() {
		try {
			r.m2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
