package org.tnsif.lambdaexpression;

public class Executor {

	public static void main(String[] args) {
		Cube c = (no) -> no*no*no;
		System.out.println(c.getCube(4));
		
		Operations opr = (a, b) -> a+b;
		System.out.println(opr.performArithmetic(10, 20));
		
		opr = (a, b) -> a*b;
		System.out.println(opr.performArithmetic(10, 20));
		
		opr = (a, b) -> a-b;
		System.out.println(opr.performArithmetic(10, 20));
		
	}

}
