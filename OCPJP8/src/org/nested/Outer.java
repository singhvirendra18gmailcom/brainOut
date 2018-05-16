package org.nested;

public class Outer {
	private int outRings=10;
	
	/*public void getInnerDetails(){
		Inner in=new Inner();
		System.out.println(in.inRings);
		in.display();
		
	}*/
	
	class Inner {
		private int inRings=5;
		
		public void display(){
			System.out.println("My Outer:" + outRings);
			System.out.println("My :" + inRings);
		}
		
	}
	public static void main(String[] args) {
			Outer outer=new Outer();
			Outer.Inner inner=outer.new Inner();
			inner.display();
	}
	
}	