package org.tnsif.operator;
import java.util.*;
public class Operators {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Arithmetic Operators
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		
		//Relational
		int x  = 5;
		System.out.println(5 < 8);
		System.out.println(5 >= 8);
		System.out.println(x == 8);
		System.out.println(5 != 8);
		
		//Logical Operators
		System.out.println("31 != 7 && 3 >= 5 :" + (31 != 7 && 3 >=5));
		System.out.println(31 != 7 || 3 >= 5);
		System.out.println(!(31 != 7 || 3 >= 5));
		
		//Assignment Operators
		int a = 2;
		a += 5;
		a -= 5;
		System.out.println(a);
		
		int b;
		System.out.println(b = 12);
		System.out.println(b);
		System.out.println(b += 10);
		System.out.println(b += 5*2);
		
		// Bitwise operators
		// $, |, ^, <<, >>
		
		int i = 13;  // 1101
		int j = 9;   // 1001
		
		System.out.println(i & j); // 1001
		System.out.println(i | j); // 1101
		System.out.println(i ^ j); // 0100
		
		byte b1 = 0b1010;
		byte b2 = 0b0101;
		System.out.println(b1 & b2); // 0000
		System.out.println(b1 | b2); // 1111
		System.out.println(b1 ^ b2); // 1111
		
		b1 = 0b1000;   // 8
		System.out.println(b1 << 1);  // 16
		System.out.println(b1 << 2);  // 32
		
		int n1 = 10;
		int n2 = 3;
		
		int result = n1 << 3;
		System.out.println(result);
		result = n1 >> 3;
		System.out.println(result);
		
		// Ternary Operator
		num1 = 10;
		
		String res = (num1 % 2 == 0) ? "Even" : "Odd";
		System.out.println(res);
		
		// Increment & Decrement
		num1 = 10;
		System.out.println(num1++); // output = 10 and x = 11
		System.out.println(++num1); // output = 12 and x = 12
		
		System.out.println(num1--); // output = 12 and x = 11
		System.out.println(--num1); // output = 10 and x = 10
		
		num1 = 23;
		num2 = 6;
		int r = num1++ + --num2;
		System.out.println(r); // 28
		
		System.out.println(num1-- + num2++);  
	}

}
