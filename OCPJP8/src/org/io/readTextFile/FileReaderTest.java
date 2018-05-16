package org.io.readTextFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	
	public static void main(String[] args) {
		
		System.out.println("\n==================================");
		readCharBufferedReader();	
		System.out.println("\n==================================");
		System.out.println("\n==================================");
		readCharArrayBufferedReader();
		
		
	}

	private static void readCharArrayBufferedReader() {

		try(FileReader fr=new FileReader("abc.txt")){
			char[] cs=new char[100];
			fr.read(cs);
			System.out.println(cs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}


	private static void readCharBufferedReader() {
		
		try(FileReader fr=new FileReader("abc.txt")){
			int ch=fr.read();
			while(ch!=-1) {
			System.out.print((char)ch);
			ch=fr.read();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
