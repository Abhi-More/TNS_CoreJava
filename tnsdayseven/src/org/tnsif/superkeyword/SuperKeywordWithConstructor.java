package org.tnsif.superkeyword;

class Google {
	String ceo;
	
	Google() {
		System.out.println("Google Class Constructor");
	}
	
	Google(String ceo) {
		this.ceo = ceo;
		System.out.println("Google Class Parameterized Constructor");
	}
}

class Chrome extends Google {
	String uID;
	
	Chrome() {
		super();
		System.out.println("Chrome Class Constructor");
	}
	
	public Chrome(String ceo, String uID) {

		super(ceo);
		this.uID = uID;
		System.out.println("Chrome Class Parameterized Constructor");
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
//		Chrome c = new Chrome();
		
		Chrome c = new Chrome("Sundar", "Abhishek@gmail.com");
		
	}

}
