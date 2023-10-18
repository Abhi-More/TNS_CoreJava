package org.tnsif.lambdaexpression;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TypesOfFunctionalInterface {

	public static void main(String[] args) {
		Supplier<String> sup = ()->"Hello Abhishek";
		System.out.println(sup.get());
		
		Consumer<Integer> cons = (n) -> {if( n > 0) 
											System.out.println("Positive");
										else
											System.out.println("positive");
										};
								
	    cons.accept(10);
										
		Function<Integer, String> fun;
		fun = (no) -> no > 0 ? "Positive" : "Negative";
		
		BiFunction<Integer, Integer, String> biFun;
		biFun = (a, b) -> a > b ? a + " is Big" : b + " is Big";
		String result = biFun.apply(10, 20);
		System.out.println(result);

	}

}
