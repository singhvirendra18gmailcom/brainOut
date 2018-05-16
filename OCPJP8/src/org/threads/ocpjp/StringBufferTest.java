
package org.threads.ocpjp;

public class StringBufferTest extends Thread {

	StringBuffer letter;

	public StringBufferTest(StringBuffer buffer) {
		letter = buffer;
	}

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(letter);
		}
		char temp = letter.charAt(0);
		temp++;
		letter.setCharAt(0, temp);

	}

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("A");
		new StringBufferTest(buffer).start();
		new StringBufferTest(buffer).start();
		new StringBufferTest(buffer).start();

	}

}
