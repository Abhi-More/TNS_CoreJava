package org.tnsif.polymorphism;

class CM {
	static void curruption(String name, int amount) {
		System.out.println("Curruption " + amount + " done by " + name);
	}
}

class MLA extends CM {
	
	
	static void curruption(String name, int amount) {
		System.out.println("Curruption " + amount + " done by " + name);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
//		MLA mla = new MLA();
		MLA.curruption("MLA", 1232435);
		CM.curruption("CM", 345670);
	}

}
