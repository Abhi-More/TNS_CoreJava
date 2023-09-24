package org.tnsif.statickeyword;

public class StaticBlock {
	
	String name;
	static float salary;
	
	// automatically calls when starting execution
	static {
		salary = 234.56789f;
//		name = "Abhishek";  // Cannot make a static reference to the non-static field name
		System.out.println("Static block");
	}
		
	public static void main(String[] args) {
		
	}
}
