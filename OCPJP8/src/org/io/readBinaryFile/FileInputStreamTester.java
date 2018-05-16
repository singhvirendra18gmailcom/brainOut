package org.io.readBinaryFile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTester {

	public static void main(String[] args) {
		
		File f=new File("view.jpg");
		long l=f.length();
		byte[] b=new byte[(int)l];
		try(BufferedInputStream br=new BufferedInputStream(new FileInputStream(f))) {
			
			br.read(b);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
			
		
		
		
		try(FileOutputStream fo=new FileOutputStream("view1.jpg")){
			fo.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
