package org.core.anonymous;

class Person implements Human{

	Person(){
		System.out.println("Constructing Person");
	}
	@Override
	public void breathe() {
		System.out.println("Default breahing");
		
	}

}

public class Client{
	public static void main(String[] args) {
		
		Human h=new Person() {
			public void breathe() {
				System.out.println(" Client breathing");
			}
		
	};
		
	h.breathe();
	}


	
}