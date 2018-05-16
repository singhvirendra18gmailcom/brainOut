package org.io.readTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	
	public static void main(String[] args) {
		
		readCharBufferedReader();	
		System.out.println("\n==================================");
		readStringBufferedReader();
		System.out.println("\n==================================");
		readCharArrayBufferedReader();
		
		
	}

	private static void readCharArrayBufferedReader() {

		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))){
			char[] cs=new char[100];
			br.read(cs);
			System.out.println(cs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}

	private static void readStringBufferedReader() {
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))){
			String line=br.readLine();
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void readCharBufferedReader() {
		
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))){
			int ch=br.read();
			while(ch!=-1) {
			System.out.print((char)ch);
			ch=br.read();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
