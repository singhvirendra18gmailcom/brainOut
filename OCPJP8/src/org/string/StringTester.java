
package org.string;

public class StringTester {
	public static void main(String[] args) {
		String s1 = "temp";
		char[] chs = { 't', 'e', 'm', 'p' };
		StringBuilder sb = new StringBuilder();
		for (char ch : chs) {
			sb.append(ch);
		}

		String s2 = sb.toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
	}

}
