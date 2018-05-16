package org.threads;

public class ThreadIntruptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Main thread");
		MyThread myThread=new MyThread();
		myThread.start();
		myThread.interrupt();
	}
}

class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; ++i) {
			System.out.println("Child thread");
			if (i == 5) {
				try {
					System.out.println("going to sleep for 10s");
					Thread.sleep(10000);
					System.out.println("sleep over for 10s");
				} catch (InterruptedException ie) {
					System.out.println("====== sleep intruppted===");
				}
			}
		}
	}
}
