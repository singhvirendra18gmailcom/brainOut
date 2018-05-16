package org.threads.classlock;

public class Resource {

	public static synchronized void m1() {
		System.out.println(" Its statin menthod" + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
