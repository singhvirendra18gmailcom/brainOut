package org.threads.producerconsumer;

public class Clerk extends Thread {

	private Register register;

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Clerk(Register register, String name) {
		this.register = register;
		Thread.currentThread().setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; ++i) {
			synchronized (register) {
				
				while (!register.isAvailable()) {
					try {
						register.wait();
					} catch (InterruptedException e) {
						System.out.println(Thread.currentThread().getName() + "has been intrupted");
					}
				}
				register.setAvailable(false);
				Student s=register.getStudent();
				System.out.println(Thread.currentThread().getName() + " has processed a new student " + s + " from counter");
				register.notify();
			}
		}
	}

}
