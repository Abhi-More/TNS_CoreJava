package org.tnsif.encapsulation;

public class BankExecutor {

	public static void main(String[] args) {
		HDFC e1=new HDFC();
		e1.setBankDetails("Saving", 123214213, 21313, 1433);
		System.out.print(e1);

	}

	
}