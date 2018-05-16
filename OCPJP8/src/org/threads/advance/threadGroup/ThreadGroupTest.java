package org.threads.advance.threadGroup;

public class ThreadGroupTest {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	
		
		ThreadGroup group=new ThreadGroup("HeadGroup");
		
		MyThread t1=new MyThread(group,"t1");
		t1.setPriority(10);
		t1.start();
		
		
		MyThread t2=new MyThread(group,"t2");
		t2.setPriority(10);
		t2.start();
		group.setMaxPriority(3);
		
		MyThread t3=new MyThread(group,"t3");
		t3.start();
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());

		group.list();
		
		System.out.println(group.activeCount());
		System.out.println(group.activeGroupCount());
		
	
		
	}
}
