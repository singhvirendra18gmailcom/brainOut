package org.threads.deadlock1;
public class Team2 {	
	public synchronized void m1(Team1 team1) {
		System.out.println("Team2 m1 started");
		team1.m2();
		System.out.println("Team2 m1 ended");
	}
	public synchronized void m2() {
		System.out.println("Team2 M2 started");
		System.out.println("Team2 M2 Ended");
	}
}
