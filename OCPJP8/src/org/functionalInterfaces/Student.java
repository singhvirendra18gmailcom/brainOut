package org.functionalInterfaces;

import java.util.List;
import java.util.function.Function;

public class Student {
	int id;
	String name;
	int marks;
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
		
	public String getResult(Student student,Function<Student, String> f){
			return f.apply(student);
	}
	
	
}
