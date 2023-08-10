package org.tnsif.uncheckedexception;

public class ArrayIndexOutOfBoundExceptionExecutor {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4};
		int n = arr.length;
		try {
			for(int i = 0; i <= n; i++)
			{
				System.out.println(arr[i] + "  ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Child Class " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally Executed");
		}
	}

}
