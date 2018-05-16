package org.io.inputFromUser;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		Console co=System.console();
		if(co!=null) {
			String userName=co.readLine("Enter user name");
			char[] password=co.readPassword("Enter your password");
			System.out.println(userName + password.toString());
		}
	}
	
}
