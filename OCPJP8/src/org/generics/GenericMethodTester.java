package org.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTester {

	public  void display(List t){
		System.out.println(t.getClass());
		
		//System.out.println(t.intValue() * t.intValue());
	}
	
	public static void main(String[] args) {
		List<? super Integer> list=new ArrayList<>();
		new GenericMethodTester().display(list);
	}
}
