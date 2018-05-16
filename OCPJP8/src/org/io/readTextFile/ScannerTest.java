package org.io.readTextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("abc.txt"));
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());	
		}
		sc.close();
	}
	
}
