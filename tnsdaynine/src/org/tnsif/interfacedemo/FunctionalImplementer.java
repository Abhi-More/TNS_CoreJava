package org.tnsif.interfacedemo;

public class FunctionalImplementer implements FunctionalInterfaceDemo{

	public void status()
	{
		System.out.println("Method overriden");
	}
	
	public static void main(String[] args) {
		FunctionalImplementer object = new FunctionalImplementer();
		object.status();

	}

}
