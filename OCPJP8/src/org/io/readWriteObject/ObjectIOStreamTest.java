package org.io.readWriteObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOStreamTest {

	public static void main(String[] args) {
	
	File f=new File("emp.obj");
	try {
		f.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
	try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(f))){
		
		os.writeObject(new Employee("1","Griva","10000"));
		os.flush();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	try(ObjectInputStream os=new ObjectInputStream(new FileInputStream(f))){
		
		Employee emp=(Employee)os.readObject();
		System.out.println(emp);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
}
