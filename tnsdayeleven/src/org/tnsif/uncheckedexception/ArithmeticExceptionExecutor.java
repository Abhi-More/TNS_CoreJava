package org.tnsif.uncheckedexception;
import java.util.*;
public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
	}

}
