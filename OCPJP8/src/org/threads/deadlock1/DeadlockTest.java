package org.threads.deadlock1;

public class DeadlockTest extends Thread{
	
	Team1 team1 = new Team1();
	Team2 team2 = new Team2();
	
	public static void main(String[] args) {
		DeadlockTest t1=new DeadlockTest();
		t1.start();
		t1.callteam2m1();
	}
	
	public void callteam2m1(){
		team2.m1(team1);
	}
	
	@Override
	public void run() {
		
		team1.m1(team2);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

