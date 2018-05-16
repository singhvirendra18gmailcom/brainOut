package org.threads.deadlock;

public class Team1 {

	public synchronized void m1(Team2 team2) {
		System.out.println("Team1 M1 started");	
		team2.m2();
		System.out.println("Team1 M1 ended");
	}
	
	public synchronized void m2() {
		System.out.println("Team1 M2 started");
		System.out.println("Team1 M2 Ended");
	}
}
