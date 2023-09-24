package org.tnsif.superkeyword;

class Parent {
	void display() {
		System.out.println("Displaying from Parent class");
	}
}

class Child extends Parent {
	void print() {
		super.display();
		System.out.println("Displaying from Child class");
	}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		Child c = new Child();
		c.print();

	}

}
