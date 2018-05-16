package org.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStreamTester {

	
	public static void main(String[] args) throws IOException {
	
		InputStreamReader keyInputStreamReader =new InputStreamReader(System.in);
		BufferedReader bw=new BufferedReader(keyInputStreamReader);
		String string=bw.readLine();
		System.err.println(string);
	}
}
