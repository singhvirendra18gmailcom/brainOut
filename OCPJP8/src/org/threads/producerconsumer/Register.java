package org.threads.producerconsumer;

public class Register {

	private Student student;
	private Boolean available=false;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Boolean isAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	
}


