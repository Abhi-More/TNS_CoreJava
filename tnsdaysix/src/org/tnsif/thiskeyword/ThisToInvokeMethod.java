package org.tnsif.thiskeyword;

class AnyClass{
	int anyVar;
	
	AnyClass(int anyVal) {
		this.anyVar = anyVal;
		
		this.display();  // invoke method
	}
	
	void display() {
		System.out.println("anyVar = " + anyVar);
	}
}

public class ThisToInvokeMethod {

	public static void main(String[] args) {

		AnyClass object = new AnyClass(10);
	}

}
