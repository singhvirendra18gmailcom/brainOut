package org.functionalInterfaces;

import java.util.function.Function;

public class MyFunction implements Function<Student, String>{

	@Override
	public String apply(Student t) {
		StringBuilder toReturn=new StringBuilder();
		if(t.marks>60){
			toReturn.append(t.getId() + t.getName() + t.marks + "Passed!!");
		}else{
			toReturn.append(t.getId() + t.getName() + t.marks + "Failed!!");
		}
			
		return toReturn.toString();
	}

		
}
