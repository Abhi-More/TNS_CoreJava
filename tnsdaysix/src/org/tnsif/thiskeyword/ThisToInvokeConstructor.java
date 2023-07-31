package org.tnsif.thiskeyword;

class Team {
		int size;
		
		Team() {
//			this(7);   // invoke parameterized constructor
			System.out.println("Default Constructor");
		}
		
		Team(int size) {
			this();
			this.size = size;
			System.out.println("Parameterized Constructor");
		}
}

public class ThisToInvokeConstructor {

	public static void main(String[] args) {
		
		Team object = new Team(56);
	}

}
