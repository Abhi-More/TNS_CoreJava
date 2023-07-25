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
		
		
		// number of digits
		System.out.print("\nEnter N for number of digits : ");
		N = sc.nextInt();
		
		int digit = 0;
		int temp = N;
		do
		{
			N /= 10;
			digit++;
		}while(N != 0);
		System.out.println("Number of digits in "+ temp + " : " + digit);
		sc.close();
	}

}
