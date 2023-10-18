package org.tnsif.lambdaexpression;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TypesOfFunctionalInterface {

	public static void main(String[] args) {
		Supplier<String> sup = ()->"Hello Abhishek";
		System.out.println(sup.get());
		
		Consumer<Integer> cons = (n) -> {if( n > 0) 
											System.out.println(n + " is Positive");
										else
											System.out.println(n + " is Negative");
										};
								
	    cons.accept(10);
	    cons.accept(-10);
	    
	    Predicate<Integer> pred = (no) -> no % 2 == 0;
	    System.out.println("Is Even : " + pred.test(33));
										
		Function<Integer, String> fun;
		fun = (no) -> no > 0 ? "Positive" : "Negative";
		
		BiFunction<Integer, Integer, String> biFun;
		biFun = (a, b) -> a > b ? a + " is Big" : b + " is Big";
		String result = biFun.apply(10, 20);
		System.out.println(result);

	}

}
