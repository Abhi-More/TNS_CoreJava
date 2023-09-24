package org.tnsif.codingchallenge;
import java.util.Scanner;

public class Marry_Pinky {

	static boolean check(int[] p, int[] m, int n) {
		for(int i=0; i<n; i++)
		{
			if(p[i] != m[n-i-1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		
		int[] p = new int[n];
		int[] m = new int[n];
		System.out.println("Numbers said by Pinky : ");
		
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		
		System.out.println("Numbers said by Mary : ");
		for(int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
		}
		
		boolean result = check(p, m, n);
		
		if(result == true)
			System.out.println("Yes, it is in reverse order");
		else
			System.out.println("No, it is not in reverse order");
		
	}

}
