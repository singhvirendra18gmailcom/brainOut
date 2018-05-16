package org.threads.deadlock;

public class MyThreadA extends Thread{

 private Team1 team1;
 private Team2 team2;

 public MyThreadA(Team1 team1, 
		 		Team2 team2) {
  this.team1 = team1;
  this.team2 = team2;
 }

 @Override
 public void run() {
  team1.m1(team2);	
 }
}
