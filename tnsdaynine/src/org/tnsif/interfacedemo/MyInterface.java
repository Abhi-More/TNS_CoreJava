package org.tnsif.interfacedemo;

public interface MyInterface {
	
	// By default all the variables inside interface is public static final
	String name = "Abhishek";
	
	//	By default all the methods inside interface is abstarct
	void display();
	
	//	Since Java 8, it can have default and static methods also.
	
	default void voidDisplay()
	{
		System.out.println("Display in default method");
	}
	
	static void staticDisplay()
	{
		System.out.println("Display in static method");
	}

}
