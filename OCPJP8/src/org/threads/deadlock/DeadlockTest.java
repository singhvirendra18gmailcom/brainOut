package org.threads.deadlock;

public class DeadlockTest {
	public static void main(String[] args) {
		Team1 team1 = new Team1();
		Team2 team2 = new Team2();
		
		MyThreadA t1 = new MyThreadA(team1, team2);
		MyThreadB t2 = new MyThreadB(team1, team2);
		t1.setName("Clerk");
		t2.setName("GateKeeper");
		t1.start();
		t2.start();
	}
}
