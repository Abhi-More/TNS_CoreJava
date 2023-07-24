package org.tnsif.loopingstatement;
import java.util.*;
public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N : ");
		int N = sc.nextInt();
		
				
		// for loop : butterfly pattern
		for(int i = 1; i <= N; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			for(int j = 1; j <= (N-i)*2; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = N-1; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			for(int j = 1; j <= (N-i)*2; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// enhanced for loop
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		for(int i: arr)
		{
			System.out.print(i + "  ");
		}

	}

}
