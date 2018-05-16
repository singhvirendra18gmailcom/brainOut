package org.io.inputFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
	
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			String line=br.readLine();
			while(!line.equalsIgnoreCase("exit")) {
				System.out.println(line);
				line=br.readLine();
			}
		}
		
	}
}