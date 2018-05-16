package org.threads.producerconsumer;

public class Peon extends Thread {

	private Register register;

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Peon(Register register, String name) {
		this.register = register;
		Thread.currentThread().setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; ++i) {
			synchronized (register) {
				Student s = new Student(i, "name1");
				while (register.isAvailable()) {
					try {
						register.wait();
					} catch (InterruptedException e) {
						System.out.println(Thread.currentThread().getName() + "has been intrupted");
					}
				}
				register.setAvailable(true);
				register.setStudent(s);
				System.out.println(Thread.currentThread().getName() + " has put a new student " + s + " at counter");
				register.notify();
			}
		}
	}

}
