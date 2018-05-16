package org.threads.classlock;

public class Client {

	public static void main(String[] args) {
		MyThread t1=new MyThread("First Thread");
		MyThread t2=new MyThread("First Thread");
		t1.start();
		t2.start();
		
		
	}
}
