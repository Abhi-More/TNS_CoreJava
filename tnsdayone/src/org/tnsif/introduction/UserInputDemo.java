//To demonstrate user input

package org.tnsif.introduction;

import java.util.*;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.println("Your name is " + name);
		
		System.out.print("Enter your full name: ");
		name = sc.nextLine();
		System.out.print("Your full name is " + name);

	}

}
