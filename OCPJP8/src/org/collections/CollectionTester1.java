package org.collections;

import java.util.Arrays;
import java.util.Comparator;

public class CollectionTester1 {

	public static void main(String[] args) {
		Integer x[]={12,6,56,1,34};
		Comparator<Integer> cm= (a,b)->b.compareTo(a);	
		Arrays.sort(x, cm);
		System.out.println(Arrays.binarySearch(x, 1,cm));
	}
	
}
