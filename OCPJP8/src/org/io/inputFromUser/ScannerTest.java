package org.io.inputFromUser;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		while(!line.equalsIgnoreCase("exit")) {
			System.out.println(line);
			line=sc.nextLine();
		}
		sc.close();		
	}
	
}
