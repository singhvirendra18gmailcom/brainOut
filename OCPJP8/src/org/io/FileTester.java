package org.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTester {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Arrays.asList(new File("E:\\SORTED").list()).stream().filter( (s)-> (new File("E:\\SORTED\\"+s).isFile() && s.startsWith("ab")) ?true: false)
		.forEach( (s)-> {
				
				try(FileWriter fw=new FileWriter("E:\\SORTED\\"+s ,true)){
					fw.write("Hello I am writing into new abc file \n");
					fw.flush();
		}catch(IOException e){
			e.printStackTrace();
		};
				
		});
		
		
		try(FileReader fileReader=new FileReader("E:\\SORTED\\abc.txt")){
			try{
			while(true){
				int i=fileReader.read();
				if(i!=-1){
					System.out.print((char)i);
				}
				else
					break;
				
			}
		}catch(IOException exception){
			exception.printStackTrace();
		}
		
		}	
		
		
	}
}
