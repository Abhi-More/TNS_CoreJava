package org.tnsif.uncheckedexception;

public class FinallyNotUsed {

	public static void display(int arr[])
	{
		try {
			System.out.println(arr[3]);
			// When the exception does not occur and we use System.exit(0) in catch block, we can't use finally block
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("Pakad liya: " + e.getMessage());
			// When the exception occur and we use System.exit(0) in catch block, we can't use finally block
			System.exit(0);
		}
		finally {
			System.out.println("Finally Executed");
		}
	}
	public static void main(String[] args) 
	{
		display(new int[] {1, 2});
	}

}
