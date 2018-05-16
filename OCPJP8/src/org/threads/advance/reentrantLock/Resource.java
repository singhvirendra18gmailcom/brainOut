package org.threads.advance.reentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
	ReentrantLock lock = new ReentrantLock();

	public void greetings(String name) throws InterruptedException {

			do {
			if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
				System.out.print("Good moring" + name);
				Thread.sleep(10000);
				System.out.println("lock hold count=" + lock.getHoldCount());
				lock.unlock();
			} else {
				System.out.println(name + " is waiting for his turn!!");

			}
		}while(true);
	}
}
