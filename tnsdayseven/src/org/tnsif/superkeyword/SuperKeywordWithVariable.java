package org.tnsif.superkeyword;

class Building {
	int floors = 23;
	String name = "The Park";
	
}

class Flat extends Building {
	String name = "Sunayana";
	
	void print() {
		System.out.println(super.name);
		System.out.println(name);
	}
	
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		
		Flat f = new Flat();
//		System.out.println(f.name);
		
		f.print();
	}

}
