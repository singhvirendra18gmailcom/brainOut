package org.threads.ocpjp;

class Chicks{
	synchronized void yack(long id) {
	for(int x=1;x<3;x++) {
		System.out.println(id + "");
		Thread.yield();
	}
	}
}
public class ChickYack implements Runnable{
	
	Chicks c;
	
	public static void main(String[] args) {
		new ChickYack().go();
	}

	void go() {
		c=new Chicks();
		show();
		new Thread(new ChickYack()).start();
		new Thread(new ChickYack()).start();
		
	}
	
	@Override
	public void run() {
		c.yack(Thread.currentThread().getId());
		
	}
	
	public void show() {
		System.out.println(c);
	}

}
