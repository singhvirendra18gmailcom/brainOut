package org.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;



public class MyClient {

	public static void main(String[] args) {
		
	
	List<Student> stus=new ArrayList<>();
	stus.add(new Student(1, "Ram",75));
	stus.add(new Student(2, "vijay",35));
	stus.add(new Student(3, "Sham",75));
	
	System.out.println("====================================================");
	stus.stream().map(new MyFunction()).forEach(System.out::println);
	
	System.out.println("====================================================");
	
	for(Student s: stus){
		System.out.println(s.getResult(s, new MyFunction()));
	}
	
	System.out.println("====================================================");
	for(Student s: stus){
		System.out.println(s.getResult(s, (st)-> {
			if(st.getMarks()<=35)
				return st.getName() + "Failed";
			else{
				return st.getName() + "Passes";
			}
		}));
	}
	
	System.out.println("====================================================");
	Function<Student, String> passFunction= (student)-> { 
		if(student.getMarks()>35){
			return student.getId() + student.getName() + "Passed";	
		}else{
			return student.getId() + student.getName() + "Failed";
		}
		
		
	};
	
	stus.stream().map(passFunction).forEach(System.out::println);
	stus.stream().map(passFunction).forEach((p)->System.out.println(p));
	
	}

	
	
	
	
	

	}


