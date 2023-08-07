package org.tnsif.interfacedemo;

@FunctionalInterface

public interface FunctionalInterfaceDemo {
	
	// only one abstract method is allowed
	void status();
	
	// static method
	static void display()
	{
		//.........
	}
	// default method
	default void show()
	{
		//.........
	}
}
