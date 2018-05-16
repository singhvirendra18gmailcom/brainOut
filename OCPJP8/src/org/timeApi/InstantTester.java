package org.timeApi;

import java.time.Instant;

public class InstantTester {
	public static void main(String[] args) {
	
		Instant instant=Instant.now();
		System.out.println(instant);
		
		
		for(int i=0;i<7;++i){
			System.out.println(i);	
		}
		System.out.println(instant.now().compareTo(instant));
	}
}
