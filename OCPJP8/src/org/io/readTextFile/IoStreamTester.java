package org.io.readTextFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoStreamTester {
	public static void main(String[] args) {
		
		try(FileInputStream fs=new FileInputStream("abc.txt")){
			int ch=fs.read();
			while(ch!=-1) {
				System.out.print((char)ch);
				ch=fs.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
