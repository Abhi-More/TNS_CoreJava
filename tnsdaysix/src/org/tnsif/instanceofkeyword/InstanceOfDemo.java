package org.tnsif.instanceofkeyword;

class RBI {
	protected String ifscCode = "RBISONGPA01";
}

class SBI extends RBI {
	public SBI() {
		super.ifscCode = "RBISONGPA01";
		String ifscCode = "SBI09876354";
		
		// if parent and child class has variable with same name we use super keyword to access super class variable
		System.out.println(ifscCode);
		System.out.println(super.ifscCode);
	}
	
}

public class InstanceOfDemo {
	
	public static void main(String[] args) {
		SBI sbiObj = new SBI();
		
		System.out.println(sbiObj instanceof SBI);
		System.out.println(sbiObj instanceof RBI);
		
		RBI Obj2 = new SBI();
		
		System.out.println(Obj2.ifscCode);
		
	}

}
