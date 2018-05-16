package org.collections;

import java.util.TreeSet;

public class TreeSetTester {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("a");
		ts.add("c");
		ts.add("d");
		ts.add("e");
		ts.add("f");
		ts.add("g");
		ts.add("h");
		ts.add("i");
		
		System.out.println(ts);
		System.out.println(ts.headSet("e"));
		System.out.println(ts.tailSet("e"));
		System.out.println(ts.headSet("e", true));
		System.out.println(ts.headSet("e", false));
		System.out.println(ts.tailSet("e", false));
	}
}
