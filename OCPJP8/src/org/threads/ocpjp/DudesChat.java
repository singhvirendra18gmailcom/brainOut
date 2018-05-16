package org.threads.ocpjp;

class Dudes{
	static long flag=0;
	
	public synchronized void chat(long id) {
		if(flag==0) flag=id;
		for(int x=1;x<3;++x) {
			if(flag==id) System.out.println("yo");
			else System.out.println("dude");
		}
		}
		
	}
	

public class DudesChat implements Runnable {

	static Dudes d;

	public static void main(String[] args) {
		new DudesChat().go();
	}

	void go() {
		d=new Dudes();
		new Thread(new DudesChat()).start();
		new Thread(new DudesChat()).start();
	}
	
	@Override
	public void run() {
	d.chat(Thread.currentThread().getId());
		
	}
}
