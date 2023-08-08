package org.tnsif.multidimensionalarray;
import java.util.*;

public class JaggedArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] mat = new int[3][];
		
		mat[0] = new int[2];
		mat[1] = new int[1];
		mat[2] = new int[5];
		
		for(int i = 0; i < mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++)
			{
				System.out.print("Enter Element : ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n---------Jagged Array---------\n");
		for(int[] arr: mat)
		{
			for(int a: arr)
			{
				System.out.print(a + "  ");
			}
			System.out.println();
		}
		
	}

}
