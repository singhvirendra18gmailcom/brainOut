package org.threads.advance.reentrantLock;

public class Player extends Thread{
	
	private Resource resource;
	private String name;
	
	public Player(Resource resource, String name) {
		super();
		this.resource = resource;
		this.name=name;
	}


	@Override
		public void run() {
			try {
				resource.greetings(name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
