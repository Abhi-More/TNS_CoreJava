package org.tnsif.interfacedemo;

public class InterfaceExecuter{

	public static void main(String[] args) 
	{
		InterfaceImplementer object = new InterfaceImplementer();
		object.display();
		object.voidDisplay();
		
		MyInterface.staticDisplay();
	}
}
