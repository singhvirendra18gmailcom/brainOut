package org.generics;

import java.util.TreeMap;

public class GenericTester {
	public static void main(String[] args) {
		
		TreeMap<String,String> map=new TreeMap<String,String>();
		map.put("a", "apple");
		map.put("d", "dear");
		map.put("f", "fig");
		map.put("p", "pear");
		
		System.out.println(map.higherKey("f"));
		System.out.println(map.higherEntry("f"));
		
		System.out.println(map.ceilingKey("e"));
		System.out.println(map.ceilingEntry("e"));
		
		
		System.out.println(map.lowerKey("f"));
		System.out.println(map.lowerEntry("f"));
		
		System.out.println(map.floorKey("e"));
		System.out.println(map.floorEntry("e"));
		
		
	}
}