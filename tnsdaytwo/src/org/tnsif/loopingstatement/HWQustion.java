package org.tnsif.loopingstatement;
import java.util.*;
public class HWQustion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int N = sc.nextInt();
		
		// number pattern
		for(int i = 1; i <= N; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.print("\nEnter N : ");
		N = sc.nextInt();
		
		int digit = 0;
		int temp = N;
		while(N != 0)
		{
			N /= 10;
			digit++;
		}
		System.out.println("Number of digits in "+ temp + " : " + digit);
		sc.close();
	}

}
