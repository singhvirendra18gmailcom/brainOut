package org.threads.advance.executorFramework;

public abstract class IpApplication implements Runnable{

	@Override
	public void run() {
		whoIam();
		
	}
	private void whoIam() {
		System.out.println("========================================");
		System.out.println(Thread.currentThread().getName());
	}
	
}
