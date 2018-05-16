package org.threads.deadlock;

public class MyThreadB extends Thread{
	
 private Team1 team1;
 private Team2 team2;
	
 public MyThreadB(Team1 team1, 
		 Team2 team2) {
	this.team1 = team1;
	this.team2 = team2;
	}

  @Override
  public void run() {
	team2.m1(team1);
}
}
